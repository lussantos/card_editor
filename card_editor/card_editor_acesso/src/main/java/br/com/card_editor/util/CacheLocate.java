/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.util;

import java.util.HashMap;
import org.apache.commons.collections4.map.PassiveExpiringMap;

/**
 *
 * @author richard.durante
 */
public final class CacheLocate {
    
    private static final CacheLocate INSTANCE = new CacheLocate();
    private static PassiveExpiringMap<String, Object> cache;
    private static final long TIMEOUT = 3600000;
    
    private CacheLocate() {
        
    }
    
    public static CacheLocate getInstance() {
        return INSTANCE;
    }
    
    public Object get(final String chave) {
        if (cache == null) {
            cache = new PassiveExpiringMap(TIMEOUT, new HashMap<String, Object>());
        }
        
        final Object obj = cache.get(chave);
        return obj;
    }
    
    public void put(final String chave, final Object valor) {
        if (cache == null) {
            cache = new PassiveExpiringMap(TIMEOUT, new HashMap<String, Object>());
        }
        
        final Object obj = cache.get(chave);
        
        if (obj == null) {
            cache.put(chave, valor);
        }
    }
    
}
