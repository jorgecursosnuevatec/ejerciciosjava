package com.jgr.ejercicios.prog.funcional.inline.servicio.clases;

import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.ProveedorInline;
import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Proveedor;


/**
 * The Class Aleatorio.
 * Seria un SUPPLIER, no le pasamos nada y devuelve algo
 */
public class GeneraNaturalesInline implements ProveedorInline{

	
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
