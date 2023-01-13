package com.jgr.metodos.estaticos.interfaces;


/**
 * The Class ClaseHeredaMetodoEstatico.
 * 
 * EL METODO PRINT DE LA INTERFACE COMO ES ESTATICO NO SE VA A HEREDAR
 */
public class ClaseHeredaMetodoEstatico implements InterfaceMetodoEstatico {
	
	@Override
	public void imprime() {
		System.out.println("Metodo imprime en clase recupero constante"+constante);
		
	}
	

}
