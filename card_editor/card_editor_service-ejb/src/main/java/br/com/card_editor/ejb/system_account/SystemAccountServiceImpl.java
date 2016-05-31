/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.system_account;

import br.com.card_editor.ejb.system_user.*;
import br.com.card_editor.entity.Player;
import br.com.card_editor.entity.SystemUser;
import br.com.card_editor.entity.key.IdPlayer;
import br.com.card_editor.input.InSalvarUsuarioPlayer;
import card_editor.card.editor.ejb.dao.PlayerDao;
import card_editor.card.editor.ejb.dao.SystemUserDao;
import card_editor.card.editor.util.ServiceBase;
import com.mongodb.MongoClient;
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
@WebService(serviceName = "SysteAcountService")
@Stateless()
public class SystemAccountServiceImpl extends ServiceBase implements SysteAcountService {

    @Override
    @WebResult(name = "Resultado")
    public void criarContaUsuario(
            @WebParam(name = "InSalvarUsuarioPlayer") InSalvarUsuarioPlayer inSalvarUsuarioPlayer) {
        MongoClient client = new MongoClient(uri);
        try {
            SystemUserDao.cadastrarUsuario(convertUser(inSalvarUsuarioPlayer), getConnetcion(client));
            PlayerDao.cadastrarPlayer(convertPlayer(inSalvarUsuarioPlayer), getConnetcion(client));
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SystemUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.close();
    }

    private SystemUser convertUser(InSalvarUsuarioPlayer inSalvarUsuarioPlayer) {
        SystemUser retorno = new SystemUser();
        retorno.setUserName(inSalvarUsuarioPlayer.getSystemUserBean().getUserName());
        retorno.setUserPassword(inSalvarUsuarioPlayer.getSystemUserBean().getUserPassword());
        return retorno;
    }

    private Player convertPlayer(InSalvarUsuarioPlayer inSalvarUsuarioPlayer) {
        Player retorno = new Player();
        retorno.setDataNascimento(inSalvarUsuarioPlayer.getPlayerBean().getDataNascimento());
        retorno.setDescricao(inSalvarUsuarioPlayer.getPlayerBean().getDescricao());
        retorno.setEmail(inSalvarUsuarioPlayer.getPlayerBean().getEmail());
        retorno.setIdPlayer(new IdPlayer());
        retorno.getIdPlayer().setNick_name(inSalvarUsuarioPlayer.getPlayerBean().getIdPlayer().getNick_name());
        retorno.getIdPlayer().setTp_conta(inSalvarUsuarioPlayer.getPlayerBean().getIdPlayer().getTp_conta());
        retorno.setNome(inSalvarUsuarioPlayer.getPlayerBean().getNome());
        retorno.setUsuarioSistema(inSalvarUsuarioPlayer.getPlayerBean().getUsuarioSistema());
        return retorno;
    }
}
