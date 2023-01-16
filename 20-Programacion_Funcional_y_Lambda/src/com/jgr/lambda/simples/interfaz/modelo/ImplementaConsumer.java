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
	public void procesaLista(Collection<Integer> numeros , Consumer<Integer> criterio) {
		
		for (Integer n:numeros) {
			criterio.accept(n);
		}
		
	}
	
	public void procesaListaConCriterio(Collection<Integer> numeros , Consumer<Integer> criterio,
			Predicate<Integer> condicion) {
		
		for (Integer n:numeros) {
			
			//si cumple la condicion
			if(condicion.test(n)){
				//realiza el proceso
				criterio.accept(n);
			}
			
		}
		
		
	}
	
	
	
	

	

}
