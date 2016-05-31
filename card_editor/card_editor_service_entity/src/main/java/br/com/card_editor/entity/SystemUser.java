package br.com.card_editor.entity;

import br.com.card_editor.annotation.Column;
import br.com.card_editor.annotation.ID;
import br.com.card_editor.annotation.Table;
import br.com.card_editor.util.EntityBase;

@Table(collectionName = "SYSTEM_USER")
public class SystemUser extends EntityBase {

    @ID
    private String userName;

    @Column(name = "userPassword")
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
