package com.jgr.lambda.simples.interfaz.modelo;

/**
 * The Interface InterfazI3.
 */
public interface InterfazI3 {
	
	String send();
	default void call() {
		System.out.println("Hola");
	}
	

}
