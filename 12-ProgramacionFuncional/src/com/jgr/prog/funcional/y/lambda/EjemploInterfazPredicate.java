package com.jgr.prog.funcional.y.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploInterfazPredicate {
	
	//interfaz Predicate<T>,devuelve un boolean
	//metodo abstracto test que realiza una comprobacion y devuelve un boolean

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
