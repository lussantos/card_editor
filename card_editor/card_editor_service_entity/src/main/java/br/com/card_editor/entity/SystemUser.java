package br.com.card_editor.entity;

import br.com.card_editor.annotation.Column;
import br.com.card_editor.annotation.ID;
import br.com.card_editor.annotation.Table;
import br.com.card_editor.util.EntityBase;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@Table(collectionName = "SYSTEM_USER")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemUser")
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
