package br.com.card_editor_user;

import java.io.Serializable;

public class SystemUser implements Serializable {

    private final String COLLECTION_NAME = "SystemUser";

    private String userName;

    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
