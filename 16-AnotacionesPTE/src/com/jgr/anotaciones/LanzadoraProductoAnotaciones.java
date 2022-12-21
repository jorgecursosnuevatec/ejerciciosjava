package com.jgr.anotaciones;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import com.jgr.anotaciones.excepciones.JsonSerializadorException;
import com.jgr.anotaciones.modelo.Producto;
import com.jgr.anotaciones.serializador.JsonAtributo;

public class LanzadoraProductoAnotaciones {

	public static void main(String[] args) {
		Producto p = new Producto();
		p.setFecha(LocalDate.now());
		p.setNombre("NombreProducto");
		p.setPrecio(1L);
		
		 Field[] atributos =p.getClass().getDeclaredFields();//los campos declarados en el objeto
		 
		 String salida =Arrays.stream(atributos)//lo convertimos a stream
                .filter(f -> 
                f.isAnnotationPresent(JsonAtributo.class))
                
                .map(f->{
                	f.setAccessible(true);//forzamos a que se pueda acceder a los atributos
                	//miramos si el atributo nombre tiene atributo
                	String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                	?f.getName()//no tiene atributo
                	:f.getAnnotation(JsonAtributo.class).nombre();//tiene atributo
                	
						try {
							return "\"" + nombre + "\":\"" + f.get(p) + "\"";						
						} catch (IllegalAccessException e) {
							throw new RuntimeException("error al serializar"+ e.getMessage());
							
						}
                	
                })
                .reduce("{" , (a,b) -> {
                    if("{".equals(a)){//la primera vez no añade "," despues del primer elemento de flujo
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
		 
		 System.out.println("salida"+salida);
               
    }
}
