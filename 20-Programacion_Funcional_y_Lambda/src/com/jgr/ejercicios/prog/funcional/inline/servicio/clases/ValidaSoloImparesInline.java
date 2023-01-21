package com.jgr.ejercicios.prog.funcional.inline.servicio.clases;

import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.PredicadoInline;
import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Predicado;


/**
 * The Class SoloImpares.
 * Valida si es impar,seria un PREDICATE, se le pasa algo y devuelve un boolean
 * 
 */
public class ValidaSoloImparesInline implements PredicadoInline{


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
