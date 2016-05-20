/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.locate;

import br.com.card_editor.player.PlayerService;
import br.com.card_editor.player.PlayerServiceImpl;
import br.com.card_editor.util.CacheLocate;
import br.com.card_editor.util.ConstantesAcesso;
import br.com.sicredi.arqref.common.util.UddiLocateBase;

/**
 *
 * @author lucas.santos
 */
public class PlayerServiceLocate extends UddiLocateBase<PlayerServiceImpl> {

    private static final String SERVICE_NAME = "PlayerServiceImpl";

    public PlayerServiceLocate() throws Exception {
        super(ConstantesAcesso.APP_NAME, ConstantesAcesso.FILE_NAME_LOCATOR);
    }

    public PlayerServiceLocate(String appName, String fileName) throws Exception {
        super(appName, fileName);
    }

    @Override
    public PlayerServiceImpl get() throws Exception {
        PlayerServiceImpl service = (PlayerServiceImpl) CacheLocate.getInstance().get(SERVICE_NAME);
        if (service == null) {
            service = new PlayerService(super.getURLWSDL(SERVICE_NAME), super.getNameSpaceURI(SERVICE_NAME)).getPlayerServiceImplPort();
            CacheLocate.getInstance().put(SERVICE_NAME, service);
        }
        return service;
    }
}
