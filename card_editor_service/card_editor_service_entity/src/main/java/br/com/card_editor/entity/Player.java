/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.entity;

import br.com.card_editor.annotation.IDComposto;
import br.com.card_editor.annotation.Tabela;
import br.com.card_editor.entity.key.IdPlayer;
import br.com.card_editor.util.EntityBase;

/**
 *
 * @author lucas.santos
 */
@Tabela(collectionName = "Player")
public class Player extends EntityBase {

    @IDComposto
    private IdPlayer idPlayer;

    public IdPlayer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(IdPlayer idPlayer) {
        this.idPlayer = idPlayer;
    }

}
