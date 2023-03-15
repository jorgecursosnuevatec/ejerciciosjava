package com.jgr.prog.funcional.y.lambda;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

import com.jgr.prog.funcional.y.lambda.models.JsonAtributo;
import com.jgr.prog.funcional.y.lambda.models.Producto;



// TODO: Auto-generated Javadoc
/**
 * The Class ListaAtributosObjeto.
 * LISTA LOS ATRIBUTOS DE UN OBJETO,SI TIENE DECORADORES TB
 * VER EJERCICIO DE ANOTACIONES PARA LA EXPLICACION
 */
public class ListaAtributosObjeto {
	public static void main(String[] args) {
		Producto p = new Producto();
		p.setFecha(LocalDate.now());
		p.setNombre("NombreProducto");
		p.setPrecio(1L);
		
		 Field[] atributos =p.getClass().getDeclaredFields();//los campos declarados en el objeto
		 
		 String salida =Arrays.stream(atributos)//lo convertimos a stream
                .filter(f -> 
                f.isAnnotationPresent(JsonAtributo.class))//preguntamos si tiene anotaciones/atributos
                
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