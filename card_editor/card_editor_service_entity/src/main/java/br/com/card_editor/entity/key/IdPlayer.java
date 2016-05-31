/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.entity.key;

import br.com.card_editor.annotation.Column;
import br.com.card_editor.annotation.Table;

/**
 *
 * @author lucas.santos
 */
@Table(collectionName = "IdPlayer")
public class IdPlayer {

    @Column(name = "nick_name")
    private String nick_name;

    @Column(name = "tp_conta")
    private String tp_conta;

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getTp_conta() {
        return tp_conta;
    }

    public void setTp_conta(String tp_conta) {
        this.tp_conta = tp_conta;
    }

}
