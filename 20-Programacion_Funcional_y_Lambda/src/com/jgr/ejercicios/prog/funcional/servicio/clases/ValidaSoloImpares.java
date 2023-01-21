package com.jgr.ejercicios.prog.funcional.servicio.clases;

import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Predicado;


/**
 * The Class SoloImpares.
 * Valida si es impar,seria un PREDICATE, se le pasa algo y devuelve un boolean
 * 
 */
public class ValidaSoloImpares implements Predicado{


	/**
	 * Test.
	 *
	 * @param valor the valor
	 * @return true, if successful
	 */
	@Override
	public boolean test(Integer valor) {
	
		return valor%2!=0;
	}
	

}
