package com.jgr.ejercicios.prog.funcional.inline.servicio.clases;

import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.FuncionInline;
import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Funcion;


/**
 * The Class CalculaAlCuadrado.
 * Seria una FUNCTION, le pasamos un dato y devuelve algo
 */
public class CalculaAlCuadradoInline implements FuncionInline{

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
