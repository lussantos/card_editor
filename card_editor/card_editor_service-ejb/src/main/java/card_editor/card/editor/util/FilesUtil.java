/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.util;

import br.com.card_editor.entity.Card;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.codehaus.plexus.archiver.UnArchiver;
import org.codehaus.plexus.archiver.tar.TarGZipUnArchiver;
import org.codehaus.plexus.archiver.tar.TarUnArchiver;
import org.codehaus.plexus.archiver.zip.AbstractZipUnArchiver;
import org.codehaus.plexus.archiver.zip.ZipUnArchiver;
import org.codehaus.plexus.logging.console.ConsoleLogger;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.*;

/**
 *
 * @author lucas.santos
 */
public class FilesUtil {

    public static void convertByteFToFile(byte[] content, String userName) throws Exception {
        try {
            File path = new File("compressed_temp");
            path.mkdir();
            if (!path.exists()) {
                path.createNewFile();
            }
            File compressed = new File(path, userName + ".tgz");
            FileOutputStream fos = new FileOutputStream(compressed);
            fos.write(content);
            fos.close();
            compressed = new File(path, "card.tgz");
        } catch (Exception e) {
            throw new Exception("Erro ao salvar projeto");
        }
    }

    public static void decompressArchive(String userName) throws Exception {
        try {
            File path = new File("compressed_temp");
            path.mkdir();
            File compressed = new File(path, userName + ".tgz");
            if (compressed.exists()) {
                final UnArchiver unarchiver;
                final ConsoleLogger consoleLogger
                        = new ConsoleLogger(org.codehaus.plexus.logging.Logger.LEVEL_INFO, "console");
                if (compressed.getAbsolutePath().endsWith(".tgz")
                        || compressed.getAbsolutePath().endsWith(".tar.gz")) {
                    unarchiver = new TarGZipUnArchiver();
                    ((TarUnArchiver) unarchiver).enableLogging(consoleLogger);
                } else if (compressed.getAbsolutePath().endsWith(".zip")) {
                    unarchiver = new ZipUnArchiver();
                    ((AbstractZipUnArchiver) unarchiver).enableLogging(consoleLogger);
                } else {
                    throw new RuntimeException(String
                            .format("Compressed file must end in .zip, .tgz, or .tar.gz, but path is %s", compressed));
                }

                unarchiver.setSourceFile(compressed);
                final File destDir = new File(userName + "_decompressed");
                destDir.mkdir();
                destDir.createNewFile();
                unarchiver.setDestDirectory(destDir);
                unarchiver.extract();
                File pathRemove = new File("compressed_temp");
                path.mkdir();
                if (pathRemove.exists()) {
                    File compressedToRemove = new File(pathRemove, userName + ".tgz");
                    if (compressedToRemove.exists()) {
                        compressedToRemove.delete();
                    }
                }
            }
        } catch (Exception e) {
            throw new Exception("Erro ao exportar imagem!");
        }
    }

    public static Card getCardDecompressed(String userName) {

        final File destDir = new File(userName + "_decompressed");
        destDir.mkdir();
        File json = null;
        File image = null;
        for (File file : destDir.listFiles()) {
            if (file.getName().contains(".json")) {
                json = file;
            } else if (file.getName().contains(".jpeg")
                    || file.getName().contains(".jpg") || file.getName().contains(".png")) {
                image = file;
            }
        }
        Card retorno = getCardFromJson(json);
        retorno.setUserName(userName);
        retorno.setTemplate(image);
        return retorno;
    }

    private static Card getCardFromJson(File json) {
        Card card = null;
        if (json != null) {
            card = new Card();
            try {
                JsonFactory f = new MappingJsonFactory();

                JsonParser jp = f.createJsonParser(json);

                JsonToken current;

                current = jp.nextToken();
                if (current != JsonToken.START_OBJECT) {
                    System.out.println("Error: root should be object: quiting.");
                    return null;
                }

                while (jp.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = jp.getCurrentName();
                    if ("name".equals(fieldName)) {
                        jp.nextToken();
                        card.setName(jp.getText());
                    }
                    if ("text".equals(fieldName)) {
                        jp.nextToken();
                        card.setText(jp.getText());
                    }
                }
                jp.close();
            } catch (Exception exception) {
            }
            json.delete();
        }
        return card;
    }

    public static byte[] getSource(GridFSDBFile grid, GridFS gfsPhoto) {
        try {
            final File destDir = new File("temp_images");
            destDir.mkdir();
            if (!destDir.exists()) {
                destDir.createNewFile();
            }
            File image = new File(destDir, "image.png");
            grid.writeTo(image);
            gfsPhoto.remove(gfsPhoto.findOne(grid.getFilename()));
            Path path = Paths.get(image.getPath());
            byte[] data = Files.readAllBytes(path);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
