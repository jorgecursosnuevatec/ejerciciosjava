package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class EjemploInterfazConsumer {

	public EjemploInterfazConsumer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Persona array[] = { new Persona("Nombre3", 66), new Persona("Nombre2", 67), new Persona("Nombre1", 66),
				new Persona("Nombre3", 67) };

		List<Persona> lista = new ArrayList<>(Arrays.asList(array));
//		
		lista.forEach(n -> System.out.println(n + " recuperado"));
		
		// Create a properties and add some values
        Properties properties = new Properties();
        properties.put("Pen", 10);
        properties.put("Book", 500);
        properties.put("Clothes", 400);
        properties.put("Mobile", 5000);
        
        
        //le paso el map
        properties.forEach((k, v) -> {
        	  
            v = (int)v + 100;
            properties.replace(k, v);
        });
        
        properties.forEach(
                (k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        
        
        

	}

}
