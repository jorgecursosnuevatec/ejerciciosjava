package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * The Class EjemploInterfazConsumeryBi.
 * solo tiene un metodo abstracto que se llama accpet que realiza algun proceso con lo que recibe
 *void accept(T t)
 *Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces,
 * Consumer is expected to operate via side-effects.
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html
 */
public class EjemploInterfazConsumeryBi {

	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Consumer<String> cr=(String a)-> System.out.println(a);
		cr.accept("Hola");
		
		
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
        
     // Create the first list
        List<Integer> listaa = new ArrayList<Integer>();
        listaa.add(2);
        listaa.add(1);
        listaa.add(3);
  
        // Create the second list
        List<Integer> listb = new ArrayList<Integer>();
        listb.add(2);
        listb.add(1);
        listb.add(2);
  
        // BiConsumer to compare both lists
        BiConsumer<List<Integer>, List<Integer> >
            equals = (list1, list2) ->
        {
            if (list1.size() != list2.size()) {
                System.out.println("False1");
            }
            else {
                for (int i = 0; i < list1.size(); i++)
                    if (list1.get(i) != list2.get(i)) {
                        System.out.println("False2");
                        return;
                    }
                System.out.println("True");
            }
        };
        equals.accept(listaa, listb);

	}

}
