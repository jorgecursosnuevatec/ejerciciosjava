package com.jgr.lambda.simples.interfaz.modelo;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * The Class ImplementaFunction.
 * Método abstracto apply, que a partir de un objeto realiza una operación y devuelve un resultado
 * 
 * 
 * 
 */
public class ImplementaUnaryOperator {
	
public int procesaLista(Collection<Integer> numeros , UnaryOperator<Integer> criterio) {
		
		
	int acumula=0;
		for (Integer n:numeros) {
			acumula+=criterio.apply(n);
			
		}
		return acumula;
		
	}
	

}
