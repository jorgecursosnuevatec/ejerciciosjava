package com.jgr.metodos.estaticos.interfaces;

/**
 * The Class EjercicioInterfazAnonimaSeDevuelveASiMisma.
 * 
 * Dentro de la misma interface  creo una clase anonima
 * En la interfaz InterfacePrinter creamos una clase anonima que se devuelve a si misma con todos los metodos
 * El metodo estatico of es el que se devuelve a si mismo con todos los metodos asociados
 *    
 * 
 * 
=======

/**
 * The Class ClaseHeredaMetodoEstatico.
 * 
 * EL METODO PRINT DE LA INTERFACE COMO ES ESTATICO NO SE VA A HEREDAR
>>>>>>> 7f05977e0cecf51be10a19a527af944eb5cf2ecd
 */
public class ClaseHeredaMetodoEstatico implements InterfaceMetodoEstatico {
	
	@Override
	public void imprime() {
		System.out.println("Metodo imprime en DESDE LA clase recupero constante->"+constante);
		
	}
	

}
