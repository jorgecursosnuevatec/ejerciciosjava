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
