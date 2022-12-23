package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jgr.prog.funcional.y.lambda.models.Persona;

/**
 * The Class UnaryOperator.
 *subinterfaz de function, el tipo de entrada coincide con el de salida,como function,para transformar datos
 *static <T> UnaryOperator<T> identity()
 *T - the type of the input and output of the operator
 *Equivale a Function<T,T>
 *Returns:a unary operator that always returns its input argument
 *https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/UnaryOperator.html
 */
public class UnaryOperator {

	
	public static void main(String[] args) {
		
		Integer [] a1 = { 3, 5, 7, 9, 15, 20 };
		List<Integer> lista = new ArrayList<Integer>();
		lista = Arrays.asList(a1);
		lista.forEach(System.out::println);
		// se la recorre entera y lo multiplica por si misma
		lista.replaceAll(n -> Integer.valueOf(n) * Integer.valueOf(n));
		
		lista.forEach(System.out::println);
		
		Persona array []= {
				new Persona("Nombre3",66),new Persona("Nombre2",67),
				new Persona("Nombre1",66),new Persona("Nombre3",67)
		};
		
		
		List<Persona> lista2 = new ArrayList<>(Arrays.asList(array));		
		//aqui cambio las personas por otra, el metodo replac
		lista2.replaceAll(n->
		new Persona("nombrenuevo", (int)(Math.random()*10+1)));
		lista2.forEach(System.out::println);
			

	}

}
