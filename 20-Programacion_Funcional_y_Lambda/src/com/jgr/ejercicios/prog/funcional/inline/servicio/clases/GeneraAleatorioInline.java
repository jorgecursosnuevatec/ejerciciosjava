package com.jgr.ejercicios.prog.funcional.inline.servicio.clases;

import java.util.Random;

import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.ProveedorInline;
import com.jgr.ejercicios.prog.funcional.servicio.interfaces.Proveedor;


/**
 * The Class Aleatorio.
 * Seria un SUPPLIER, no le pasamos nada y devuelve algo
 * 
 */
public class GeneraAleatorioInline implements ProveedorInline{

	/**
	 * Obtener.
	 *
	 * @return the integer
	 */
	@Override
	public Integer obtener() {			
		return new Random().nextInt(1000000);
	}
	
	

}