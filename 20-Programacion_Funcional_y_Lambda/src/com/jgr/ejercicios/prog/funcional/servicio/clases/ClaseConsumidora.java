package com.jgr.ejercicios.prog.funcional.servicio.clases;

import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Consumidor;


/**
 * The Class ClaseConsumidora.
 * es un CONSUMER, recibe un valor,hace algo pero NO devuelve nada
 */
public class  ClaseConsumidora implements Consumidor{

	/**
	 * Aceptar.
	 *
	 * @param valor the valor
	 */
	@Override
	public void aceptar(Integer valor) {
		System.out.println("\nEn ClaseConsumidora->"+valor);
		
	}

}
