package com.jgr.anotaciones;

import java.lang.reflect.Field;
import java.time.LocalDate;

import com.jgr.anotaciones.modelo.Producto;
import com.jgr.anotaciones.serializador.JsonAtributo;
import com.jgr.anotaciones.serializador.JsonSerializador;


/**
 * The Class Anotaciones.
 * Metadata,sustituye al xml 
 */
public class Anotaciones {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro ROBLE");
        p.setPrecio(1000L);
        
        
        //obtengo los atributos declarados en producto
        Field[] atributos = p.getClass().getDeclaredFields();
        
        for (int i=0;i<atributos.length;i++) {        	
        	System.out.println("\n atributos declarados en producto->"+
        	atributos[i].isAnnotationPresent(JsonAtributo.class));        	
        }

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}
