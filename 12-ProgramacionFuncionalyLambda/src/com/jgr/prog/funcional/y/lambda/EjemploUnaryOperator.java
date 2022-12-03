package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Class EjemploUnaryOperator.
 */
public class EjemploUnaryOperator {

	
	/**
	 * The main method.
	 *subinterfaz de function, el tipo de entrada coincide con el de salida,como function,para transformar datos
	 *static <T> UnaryOperator<T> identity()
	 *T - the type of the input and output of the operator
	 *Returns:a unary operator that always returns its input argument
	 *https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/UnaryOperator.html
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Integer [] a1 = { 3, 5, 7, 9, 15, 20 };
		List<Integer> lista = new ArrayList<Integer>();
		lista = Arrays.asList(a1);
		lista.forEach(System.out::println);
		// se la recorre entera y lo multiplica por si misma
		lista.replaceAll(n -> Integer.valueOf(n) * Integer.valueOf(n));
		
		lista.forEach(System.out::println);
		
		List<Integer> lista2 = new ArrayList<Integer>();
		
		

	}

}
