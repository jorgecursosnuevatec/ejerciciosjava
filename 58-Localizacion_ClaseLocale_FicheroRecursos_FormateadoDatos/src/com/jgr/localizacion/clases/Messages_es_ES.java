package com.jgr.localizacion.clases;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;
 

/**
 * The Class Messages_es_ES.
 * definicio de una clase especifica para el tratamiento de los mensajes 
 */
public class Messages_es_ES extends ResourceBundle 
{
    
    /** The data. */
    HashMap<String, String> data; 
             
    /**
     * Instantiates a new messages es ES.
     */
    public Messages_es_ES()
    {
        data = new HashMap<String, String>(); 
        populateData();
    }
     
    /**
     * Populate data.
     */
    protected void populateData()
    {
        data.put("messages.car","coche");
        data.put("messages.house","casa");
    }
     
    /**
     * Handle get object.
     *
     * @param key the key
     * @return the object
     */
    @Override
    protected Object handleGetObject(String key) 
    {
        return data.get(key);
    }
 
    /**
     * Gets the keys.
     *
     * @return the keys
     */
    @Override
    public Enumeration<String> getKeys() 
    {
        return Collections.enumeration(data.keySet());
    }
}