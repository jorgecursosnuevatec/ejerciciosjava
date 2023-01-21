package com.jgr.ejercicios.prog.funcional.inline.servicio.clases;

import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.ConsumidorInline;
import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Consumidor;


/**
 * The Class ClaseConsumidora.
 * es un CONSUMER, recibe un valor,hace algo pero NO devuelve nada
 */
public class  ClaseConsumidoraInline implements ConsumidorInline{

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
