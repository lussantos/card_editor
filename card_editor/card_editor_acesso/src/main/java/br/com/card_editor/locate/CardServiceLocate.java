/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.locate;

import br.com.card_editor.ejb.card.CardService;
import br.com.card_editor.ejb.card.CardServiceImpl;

/**
 *
 * @author lucas.santos
 */
public class CardServiceLocate {

    private CardServiceImpl service;

    public CardServiceImpl get() throws Exception {
        if (service == null) {
            service = new CardService().getCardServiceImplPort();
        }
        return service;
    }
}
