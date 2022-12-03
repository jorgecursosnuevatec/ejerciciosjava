package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * The Class EjemploInterfazFunction.
 * interfaz function <T,R>,devuelve un objeto Resultado R R apply(T t)
 * metodo apply que a partir de un objeto realiza una operacion y devuelve un resultado R apply(T t)
 * para transformar datos,como map de Stream
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html
 * con dos parametros es BiFunction
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html
 */
public class EjemploInterfazFunction {

	public static void main(String[] args) {
		
		Persona array []= {
				new Persona("Nombre3",66),new Persona("Nombre2",67),
				new Persona("Nombre1",66),new Persona("Nombre3",67)
		};
		
		
		List<Persona> lista = new ArrayList<>(Arrays.asList(array));
		List<String> modificado= (lista.stream()//lo convierto a stream para trabajar con el 
				.map(per->per.getNombre())) //de cada persona obtengo el nombre
				.collect(Collectors.toList());

		
		modificado.forEach(System.out::println);
		
		
		
	}

}
