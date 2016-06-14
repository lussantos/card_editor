/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.input;

import br.com.card_editor.bean.CardBean;
import java.io.Serializable;

/**
 *
 * @author lucas.santos
 */
public class InSalvarCard implements Serializable {

    private CardBean cardBean;

    private String nickNameUser;

    public CardBean getCardBean() {
        return cardBean;
    }

    public void setCardBean(CardBean cardBean) {
        this.cardBean = cardBean;
    }

    public String getNickNameUser() {
        return nickNameUser;
    }

    public void setNickNameUser(String nickNameUser) {
        this.nickNameUser = nickNameUser;
    }

}
