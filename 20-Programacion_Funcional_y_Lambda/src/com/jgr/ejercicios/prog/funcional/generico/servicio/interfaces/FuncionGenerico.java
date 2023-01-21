package com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces;

/**
 * The Interface FuncionGenerico.
 * funcion FUNCTION
 * tiene un metodo apply que realiza una operacion y devuelve un resultado
 * 
 * T->tipo de valor de entrada
 * R->tipo de valor de salida
 */
public interface FuncionGenerico<T,R> {
	
	R aplicar(T valor);

}
