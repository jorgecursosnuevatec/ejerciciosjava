package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploInterfazFunction {

	//interfaz function <T,R>,devuelve un objeto Resultado R
	//metodo apply que a partir de un objeto realiza una operacion y devuelve un resultado R apply(T t)
	//para transformar datos,como map de Stream
	
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
