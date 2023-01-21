package com.jgr.ejercicios.prog.funcional.servicio.clases;

import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Proveedor;


/**
 * The Class Aleatorio.
 * Seria un SUPPLIER, no le pasamos nada y devuelve algo
 */
public class GeneraNaturales implements Proveedor{

	
	private static int next=0;
	/**
	 * Obtener.
	 *
	 * @return the integer
	 */
	@Override
	public Integer obtener() {
		
		
		return next++;
		
		
	}
	
	

}
