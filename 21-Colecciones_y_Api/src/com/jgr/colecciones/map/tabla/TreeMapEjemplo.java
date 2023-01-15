package com.jgr.colecciones.map.tabla;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * The Class TreeMapEjemplo.
 * TreeMapEjemplo-> es un mapa ordenado 
 */
public class TreeMapEjemplo {
    public static void main(String[] args) {

        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));

        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);

        
        //añade al map persona este otro map
        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);
        
        for(Map.Entry<String, Object> par: persona.entrySet()){
        	
        	System.out.println("clave->"+par.getKey());
        	System.out.println("valor->"+ par.getValue());
        	
        }

    }
}
