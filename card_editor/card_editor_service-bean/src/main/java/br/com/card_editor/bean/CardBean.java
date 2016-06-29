/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.bean;

import java.io.File;

/**
 *
 * @author lucas.santos
 */
public class CardBean {

    private String id;

    private String name;

    private String description;

    private byte[] template;

    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getTemplate() {
        return template;
    }

    public void setTemplate(byte[] template) {
        this.template = template;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
