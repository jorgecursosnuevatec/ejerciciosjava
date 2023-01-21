package com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces;

/**
 * The Interface ConsumidorGenerico.
 * es un CONSUMER, recibe un valor , tiene un metodo accept con el que procesa algo y devuelve algo
 */
public interface ConsumidorGenerico<T> {

	void  aceptar(T valor);

}
