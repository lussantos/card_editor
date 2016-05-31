/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.entity;

import br.com.card_editor.annotation.ID;
import br.com.card_editor.annotation.Table;
import br.com.card_editor.util.EntityBase;

/**
 *
 * @author lucas.santos
 */
@Table(collectionName = "LINK")
public class Link extends EntityBase {

    @ID
    private Long id;

    private String description;

    private String linkAdress;

    private String cardCreatorName;

    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkAdress() {
        return linkAdress;
    }

    public void setLinkAdress(String linkAdress) {
        this.linkAdress = linkAdress;
    }

    public String getCardCreatorName() {
        return cardCreatorName;
    }

    public void setCardCreatorName(String cardCreatorName) {
        this.cardCreatorName = cardCreatorName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
