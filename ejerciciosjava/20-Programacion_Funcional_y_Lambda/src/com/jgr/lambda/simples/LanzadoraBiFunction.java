package com.jgr.lambda.simples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * The Class anzadoraBiFunction.
 * 
 * Método abstracto apply, que a partir de un DOS objetos devuelve un resultado
 * 
 * 
 * https://mkyong.com/tag/functional-interface/
 */
public class LanzadoraBiFunction {


	public static void main(String[] args) {
				
		
		//recibe dos enteros y devuelve un enteros
		BiFunction<Integer,Integer,Integer> funcion=(x1,x2)->(x1+x2);		
		System.out.println("\nSuma de los numeros->"+funcion.apply(1, 2));
		
		
		//recibe dos enteros y devuelve un Double
		BiFunction<Integer,Integer,Double> funcionDouble=(x1,x2)-> Math.pow(x1, x2);		
		System.out.println("\nSuma de los numeros->"+funcionDouble.apply(1, 2));
		
		//recibe dos enteros y devuelve una lista
		BiFunction<Integer,Integer,List<Integer>> funcionLista=(x1,x2)-> Arrays.asList(x1,x2);		
		System.out.println("\nSuma de los numeros->"+funcionLista.apply(1, 2));
		
		
				

		

	}

}
