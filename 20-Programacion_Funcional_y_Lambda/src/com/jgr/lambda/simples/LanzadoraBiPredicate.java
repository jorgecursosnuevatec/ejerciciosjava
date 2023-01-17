package com.jgr.lambda.simples;

import com.jgr.lambda.simples.interfaz.modelo.ImplementaBiPredicate;

/**
 * The Class LanzadoraBiPredicate
 * Dispone del método abstracto test, que a partir de un objeto realiza una comprobación y devuelve un boolean
 * 
 * 
 * https://mkyong.com/tag/functional-interface/
 * 
 * 1->recibe dos numeros y nos indica si son o no iguales
 * 2->indica si el primero es mayor que el segundo
 * 3->indica si los dos son pares
 * 
 * 
 */
public class LanzadoraBiPredicate {
	public static void main(String[] args) {
		
		ImplementaBiPredicate iBP = new ImplementaBiPredicate();
		
		//llamamos a la clase ImplementaBiPredicate con los numeros y lo que queremos que haga
		// 1->recibe dos numeros y nos indica si son o no iguales
		iBP.comprobar(6, 8, (a,b)->a==b);
		
		//2->indica si el primero es mayor que el segundo
		iBP.comprobar(6, 8, (a,b)->a>b);
		
		//3->indica si los dos son pares
		iBP.comprobar(6, 8, (a,b)->a%2==0&&b%2==0);

	}

}
