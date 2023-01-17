package com.jgr.lambda.simples.interfaz.modelo;

import java.util.function.BiPredicate;


/**
 * The Class ImplementaBiPredicate.
 * le pasamos las variables y lo que tenemos que hacer (criterio)
 * 1->recibe dos numeros y nos indica si son o no iguales
 * 2->indica si el primero es mayor que el segundo
 * 3->indica si los dos son pares
 * 
 */
public class ImplementaBiPredicate {
	
	
	public boolean comprobar (int n1, int n2,BiPredicate<Integer, Integer> criterio) {
		
		return criterio.test(n1, n2);
		
	}

}
