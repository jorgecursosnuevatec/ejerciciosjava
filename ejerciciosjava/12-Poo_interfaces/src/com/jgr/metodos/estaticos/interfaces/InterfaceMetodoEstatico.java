package com.jgr.metodos.estaticos.interfaces;


/**
 * The Interface InterfaceMetodoEstatico.
 * EL METODO PRINT COMO ES ESTATICO NO SE VA A HEREDAR 
 */
public interface InterfaceMetodoEstatico {
	
	
	public final static int constante=15;
	
	/**
	 * Prints the.
	 * 
	 */
	static void print() {
		System.out.println("En interface metodo estatico");
	}
	
	/**
	 * Imprime.
	 */
	void imprime();
	

}
