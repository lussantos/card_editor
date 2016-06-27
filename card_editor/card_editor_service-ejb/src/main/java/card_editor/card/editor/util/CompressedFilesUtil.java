/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.util;

import java.io.File;
import java.io.FileOutputStream;
import org.codehaus.plexus.archiver.UnArchiver;
import org.codehaus.plexus.archiver.tar.TarGZipUnArchiver;
import org.codehaus.plexus.archiver.tar.TarUnArchiver;
import org.codehaus.plexus.archiver.zip.AbstractZipUnArchiver;
import org.codehaus.plexus.archiver.zip.ZipUnArchiver;
import org.codehaus.plexus.logging.console.ConsoleLogger;

/**
 *
 * @author lucas.santos
 */
public class CompressedFilesUtil {

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

}
