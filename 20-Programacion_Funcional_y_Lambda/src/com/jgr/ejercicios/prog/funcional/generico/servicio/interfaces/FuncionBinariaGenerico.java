package com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces;


/**
 * The Interface FuncionBinariaGenerico.
 * T->tipo del primer valor
 * U->tipo del segundo valor
 * R->tipo de valor del resultado
 */
public interface FuncionBinariaGenerico<T,U,R> {
	
	
	R aplicar(T acumulador,U valor);

}
