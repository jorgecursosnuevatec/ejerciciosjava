package com.jgr.localizacion.clases;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;
 
// TODO: Auto-generated Javadoc
/**
 * The Class Messages.
 * 
 * definicio de una clase especifica para el tratamiento de los mensajes 
 */
public class Messages extends ResourceBundle 
{
    
    /** The data. */
    HashMap<String, String> data; 
             
    /**
     * Instantiates a new messages.
     */
    public Messages()
    {
        data = new HashMap<String, String>(); 
        populateData();
    }
     
    /**
     * Populate data.
     */
    protected void populateData()
    {
        data.put("messages.error","error");
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

