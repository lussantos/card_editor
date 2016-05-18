/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_editor.card.editor.util;

import com.mongodb.BasicDBObject;

/**
 *
 * @author lucas.santos
 */
public abstract class EntityBase extends BasicDBObject {

    protected abstract String getCollectionName();

    protected abstract void persistData();

}
