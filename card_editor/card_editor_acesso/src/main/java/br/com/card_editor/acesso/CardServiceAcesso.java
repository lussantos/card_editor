/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.acesso;

import br.com.card_editor.ejb.card.CardServiceImpl;
import br.com.card_editor.ejb.card.Exception_Exception;
import br.com.card_editor.ejb.card.InSalvarCard;
import br.com.card_editor.locate.CardServiceLocate;

/**
 *
 * @author lucas.santos
 */
public class CardServiceAcesso {

    private CardServiceImpl service;

    public CardServiceAcesso() throws Exception {
        this.service = new CardServiceLocate().get();
    }

    public void uploadImage(InSalvarCard inSalvarCard) throws Exception_Exception {
        this.service.insertCard(inSalvarCard);
    }
    
}
