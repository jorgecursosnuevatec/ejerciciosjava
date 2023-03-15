package com.jgr.lambda.simples.interfaz.modelo;

import java.util.List;
import java.util.function.Predicate;


/**
 * The Class ImplementaFuncionPredicate.
 * como parametros acepta una lista y un Predicate
 * devuelve un entero,el resultado de una operacion
 * 
 */
public class ImplementaPredicate {
	/**
	 * Calculo por criterio.
	 * Le pasamos una lista de enteros y un predicate que es una interfaz que 
	 * devuelve un boolean.
	 * si pasamos t->t%2==0; lo que hace en el criterio.test es validar que se cumple que t es par,	
	 *
	 * @param numeros the numeros
	 * @param criterio the criterio
	 * @return the int
	 */
	public int calculoPorCriterio(List<Integer> numeros , Predicate<Integer> criterio) {
		
		int suma=0;
		
		for (int n : numeros)   {
			if (criterio.test(n)) {
				suma+=n;
			}
		}
		return suma;
	}
	
	

	

}
