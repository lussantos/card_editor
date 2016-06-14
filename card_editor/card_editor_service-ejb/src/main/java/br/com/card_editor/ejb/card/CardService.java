/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.ejb.card;

import br.com.card_editor.input.InSalvarCard;

/**
 *
 * @author lucas.santos
 */
public interface CardService {

    void uploadCard(InSalvarCard card);

}
