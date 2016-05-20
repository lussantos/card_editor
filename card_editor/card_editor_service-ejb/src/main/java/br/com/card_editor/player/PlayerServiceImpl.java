/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.player;

import br.com.card_editor.entity.Player;
import card_editor.card.editor.ejb.dao.PlayerDao;
import card_editor.card.editor.util.ServiceBase;
import com.mongodb.MongoClient;
import java.lang.instrument.IllegalClassFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author lucas.santos
 */
@WebService(serviceName = "PlayerService")
@Stateless()
public class PlayerServiceImpl extends ServiceBase implements PlayerService {

    @Override
    @WebResult(name = "Resultado")
    public void cadastrarPlayer(
            @WebParam(name = "player") Player player) {
        MongoClient client = new MongoClient(uri);
        try {
            PlayerDao.cadastrarPlayer(player, getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PlayerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    @Override
    @WebResult(name = "Resultado")
    public void alterarPlayer(Player player) {
        MongoClient client = new MongoClient(uri);
        try {
            PlayerDao.alterarPlayer(player, getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PlayerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalClassFormatException ex) {
            Logger.getLogger(PlayerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    @Override
    @WebResult(name = "Resultado")
    public void excluirPlayer(
            @WebParam(name = "player") Player player) {
        MongoClient client = new MongoClient(uri);
        try {
            PlayerDao.excluirPlayer(player, getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PlayerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalClassFormatException ex) {
            Logger.getLogger(PlayerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }
}
