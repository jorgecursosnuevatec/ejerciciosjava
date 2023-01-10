package com.jgr.localizacion.clases;


/**
 * The Class Messages_en.
 * definicio de una clase especifica para el tratamiento de los mensajes
 * 
 * http://bitsmi.com/2016/06/12/resourcebundle-localizacion-de-recursos/
 */
public class Messages_en extends Messages 
{
    
    /**
     * Populate data.
     */
    @Override
    protected void populateData()
    {
        // Se sobreescriben sólo los datos propios del idioma ya que el resto es comun (messages.error)
        data.put("messages.car","car");
        data.put("messages.house","house");
    }
}