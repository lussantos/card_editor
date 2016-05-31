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
@Table(collectionName = "CARD_CREATOR")
public class CardCreator extends EntityBase {

    @ID
    private String nickName;

    private String playerNickName;

    private String playerTpConta;

    private Character level;

    private String location;

    private String professionalDescription;

    private String especiality;

    private String interest;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPlayerNickName() {
        return playerNickName;
    }

    public void setPlayerNickName(String playerNickName) {
        this.playerNickName = playerNickName;
    }

    public String getPlayerTpConta() {
        return playerTpConta;
    }

    public void setPlayerTpConta(String playerTpConta) {
        this.playerTpConta = playerTpConta;
    }

    public Character getLevel() {
        return level;
    }

    public void setLevel(Character level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProfessionalDescription() {
        return professionalDescription;
    }

    public void setProfessionalDescription(String professionalDescription) {
        this.professionalDescription = professionalDescription;
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

}
