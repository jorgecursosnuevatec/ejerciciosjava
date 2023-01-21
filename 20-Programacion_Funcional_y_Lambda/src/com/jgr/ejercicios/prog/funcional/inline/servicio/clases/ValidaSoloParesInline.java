package com.jgr.ejercicios.prog.funcional.inline.servicio.clases;

import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.PredicadoInline;
import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Predicado;


/**
 * The Class SoloPares.
 * valida si es par,usaria PREDICATE,le pasamos un valor y devuelve un booleano
 */
public class ValidaSoloParesInline implements PredicadoInline{

	
	@Override
	public boolean test(Integer valor) {
	
		return valor%2==0;
	}
	

}
