/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.locate;

import br.com.card_editor.ejb.system_user.SystemUserService;
import br.com.card_editor.ejb.system_user.SystemUserServiceImpl;
import br.com.card_editor.util.CacheLocate;
import br.com.card_editor.util.ConstantesAcesso;
import br.com.sicredi.arqref.common.util.UddiLocateBase;

/**
 *
 * @author lucas.santos
 */
public class SystemUserServiceLocate extends UddiLocateBase<SystemUserServiceImpl> {

    private static final String SERVICE_NAME = "SystemUserServiceImpl";

    public SystemUserServiceLocate() throws Exception {
        super(ConstantesAcesso.APP_NAME, ConstantesAcesso.FILE_NAME_LOCATOR);
    }

    public SystemUserServiceLocate(String appName, String fileName) throws Exception {
        super(appName, fileName);
    }

    @Override
    public SystemUserServiceImpl get() throws Exception {
        SystemUserServiceImpl service = (SystemUserServiceImpl) CacheLocate.getInstance().get(SERVICE_NAME);
        if (service == null) {
            service = new SystemUserService(super.getURLWSDL(SERVICE_NAME), super.getNameSpaceURI(SERVICE_NAME)).getSystemUserServiceImplPort();
            CacheLocate.getInstance().put(SERVICE_NAME, service);
        }
        return service;
    }
}
