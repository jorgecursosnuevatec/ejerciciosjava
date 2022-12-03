package com.jgr.prog.funcional.y.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * The Class EjemploInterfazPredicate.
 * recibe un dato y devuelve un boolean
 * metodo abstracto test que realiza una comprobacion y devuelve un boolean
 * boolean test(T t)
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html
 * por ejemplo removeIf
 */
public class EjemploInterfazPredicate {
	
	

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Persona array []= {
				new Persona("Nombre3",66),new Persona("Nombre2",67),
				new Persona("Nombre1",66),new Persona("Nombre3",67)
		};
		
		
		List<Persona> lista = new ArrayList<>(Arrays.asList(array));
		
		lista.removeIf(p->p.getEdad()>66);
		lista.forEach(System.out::println);
		

	}

}
