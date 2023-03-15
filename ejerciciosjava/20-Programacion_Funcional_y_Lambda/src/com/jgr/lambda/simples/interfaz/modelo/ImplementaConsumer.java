package com.jgr.lambda.simples.interfaz.modelo;

import java.util.Collection;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Predicate;



/**
 * The Class ImplementaConsumer
 * realiza un tratamiento,pero NO devuelve nada
 * 
 */
public class ImplementaConsumer {
	
	//esta clase utiliza el metodo ACCEPT de Consumer que recibe un parametro
	//y no devuelve nada, lo que define realmente que es lo que hace es la 
	//lambda que pasamos como parametro y que llamamos criterio
	public void procesaLista(Collection<Integer> numeros , Consumer<Integer> hazEsto) {
		
		for (Integer n:numeros) {
			hazEsto.accept(n);
		}
		
	}
	
	/**
	 * Procesa lista con criterio.
	 * Le pasamos como parametros una lista de numeros ,un metodo Consumer<integer> que no devuelve nada, solo
	 * hace lo que le indiquemos con el numero y un Predicate<Integer> que lo que hace es verificar si
	 * se cumple la condicion
	 * en lanzadoraConsumer le pasamos como Consumer hazEsto que escriba en un fichero
	 * en lanzadoraConsumer le pasamos como Predicate x->x>0 para que veamos si es mayor que cero
	 *  
	 *
	 * @param numeros the numeros
	 * @param hazEsto the criterio
	 * @param condicionSeCumple the condicion
	 */
	public void procesaListaConCriterio(Collection<Integer> numeros , Consumer<Integer> hazEsto,
			Predicate<Integer> condicionSeCumple) {
		
		for (Integer n:numeros) {			
			//si cumple la condicion
			if(condicionSeCumple.test(n)){//este es el predicate,devuelve boolean con condicion que se cumple
				//realiza el proceso
				hazEsto.accept(n);//este es el consumer, procesa lo que le pasamos
			}
			
		}
		
		
	}
	
	
	
	

	

}
