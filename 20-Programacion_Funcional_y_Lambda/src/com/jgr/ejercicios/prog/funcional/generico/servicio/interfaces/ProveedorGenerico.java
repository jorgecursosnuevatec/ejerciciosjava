package com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces;

import java.util.List;


/**
 * The Interface ProveedorGenerico.
 * es un SUPPLIER,tiene un metodo get que no recibe nada y devuelve algo
 */
public interface ProveedorGenerico<T> {
	
	T obtener();

}
