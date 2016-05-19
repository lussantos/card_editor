package br.com.card_editor.entity;

import br.com.card_editor.annotation.Coluna;
import br.com.card_editor.annotation.ID;
import br.com.card_editor.annotation.IDComposto;
import br.com.card_editor.annotation.Tabela;
import br.com.card_editor.util.EntityBase;

@Tabela(collectionName = "SystemUser")
public class SystemUser extends EntityBase {

    @ID
    private String userName;

    @Coluna(name = "userPassword")
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
