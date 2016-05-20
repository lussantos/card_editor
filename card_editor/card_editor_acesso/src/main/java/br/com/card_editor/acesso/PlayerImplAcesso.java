/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.acesso;

import br.com.card_editor.locate.PlayerServiceLocate;
import br.com.card_editor.player.Player;
import br.com.card_editor.player.PlayerServiceImpl;
import br.com.card_editor.util.ConstantesAcesso;
import sun.rmi.runtime.Log;

/**
 *
 * @author lucas.santos
 */
public class PlayerImplAcesso {

    private final PlayerServiceImpl service;
    private static Log log;

    public PlayerImplAcesso() throws Exception {
        this.service = new PlayerServiceLocate().get();
        log = Log.getLog(PlayerImplAcesso.class.getName(), ConstantesAcesso.APP_NAME, true);
    }

    public void cadastrarPlayer(Player player) {
        this.service.cadastrarPlayer(player);
    }

    public void alterarPlayer(Player player) {
        this.service.alterarPlayer(player);
    }

    public void excluirPlayer(Player player) {
        this.service.excluirPlayer(player);
    }

}
