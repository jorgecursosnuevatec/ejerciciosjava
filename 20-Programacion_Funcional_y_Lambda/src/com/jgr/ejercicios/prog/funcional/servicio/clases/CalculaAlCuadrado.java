package com.jgr.ejercicios.prog.funcional.servicio.clases;

import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Funcion;


/**
 * The Class CalculaAlCuadrado.
 * Seria una FUNCTION, le pasamos un dato y devuelve algo
 */
public class CalculaAlCuadrado implements Funcion{

	/**
	 * Aplicar.
	 *
	 * @param valor the valor
	 * @return the integer
	 */
	@Override
	public Integer aplicar(Integer valor) {
		
		return valor*valor;
	}

}
