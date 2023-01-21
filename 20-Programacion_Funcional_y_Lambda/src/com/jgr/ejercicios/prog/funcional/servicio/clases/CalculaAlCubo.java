package com.jgr.ejercicios.prog.funcional.servicio.clases;

import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Funcion;


/**
 * The Class CalculaAlCubo.
 *  * Seria una FUNCTION, le pasamos un dato y devuelve algo
 */
public class CalculaAlCubo implements Funcion{

	/**
	 * Aplicar.
	 *
	 * @param valor the valor
	 * @return the integer
	 */
	@Override
	public Integer aplicar(Integer valor) {
		
		return valor*valor*valor;
	}

}
