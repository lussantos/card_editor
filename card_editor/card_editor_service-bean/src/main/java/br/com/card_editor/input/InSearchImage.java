/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.input;

import java.io.Serializable;

/**
 *
 * @author lucas.santos
 */
public class InSearchImage implements Serializable {

    private String userName;

    private String idImage;

    private Long imageQuality;

    private String cardName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdImage() {
        return idImage;
    }

    public void setIdImage(String idImage) {
        this.idImage = idImage;
    }

    public Long getImageQuality() {
        return imageQuality;
    }

    public void setImageQuality(Long imageQuality) {
        this.imageQuality = imageQuality;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

}
