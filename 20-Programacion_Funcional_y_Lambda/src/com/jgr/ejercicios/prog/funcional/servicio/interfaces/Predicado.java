package com.jgr.ejercicios.prog.funcional.servicio.interfaces;


/**
 * The Interface PredicadoGenerico.
 * es un PREDICATE,solo tiene el metodo test, realiza la comprobacion y devuelve el boolean
 */
public interface Predicado {
	
	/**
	 * Test.
	 * Aplica la condicion que se le pasa por parametro
	 *
	 * @param valor the valor
	 * @return true, if successful
	 */
	boolean test(Integer valor);

}
