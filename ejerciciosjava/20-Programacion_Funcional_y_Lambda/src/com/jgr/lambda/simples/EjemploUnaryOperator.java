package com.jgr.lambda.simples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import com.jgr.lambda.simples.interfaz.modelo.GeneraListaNumeros;
import com.jgr.lambda.simples.interfaz.modelo.ImplementaUnaryOperator;

/**
 * The Class EjemploUnaryOperator.
 * Interface UnaryOperator<T>
 * T - the type of the operand and result of the operator
 * static <T> UnaryOperator<T>	identity()	
 * Returns a unary operator that always returns its input argument.
 * 
 * Misma funcionalidad que function,pero devuelve el mismo tipo de dato que recibe, 
 * devuelve el mismo tipo de dato
 * 
 */
public class EjemploUnaryOperator {

	
	public static void main(String[] args) {
		
		
		UnaryOperator<Integer> func2 = x -> x * 2;
        Integer result2 = func2.apply(2);
        System.out.println(result2);        // 4
        
    	List<Integer> numeros = new ArrayList<Integer>();
		new GeneraListaNumeros();
		numeros = GeneraListaNumeros.getLista();
        
        ImplementaUnaryOperator iUO = new ImplementaUnaryOperator();
        
      //recibe una lista y devuelve la suma de los cuadrados de la lista
      		//le pasamos la lista de numeros y de decimos lo que tiene que hacer el function
      		
      		System.out.println("\nSuma de los cuadrados de la lista->"+iUO.procesaLista(numeros, n->(n*n)));
		
	}

}
