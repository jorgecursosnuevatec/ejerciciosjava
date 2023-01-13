package com.jgr.metodos.estaticos.interfaces;



/**
 * The Class EjercicioMetodoEstatico.
 * 
 * Dentro de la misma interface  creo una clase anonima
 * En la interfaz InterfacePrinter creamos una clase anonima que se devuelve a si misma con todos los metodos
 * El metodo estatico of es el que se devuelve a si mismo con todos los metodos asociados
 *    
 * 
 * 
 */

interface InterfacePrinter{
	
	//defino el metodo imprimir
	void imprimir(String cad);
	
	//declaro la clase anonima a la que llamo of
	static InterfacePrinter of() {
		return new InterfacePrinter() {
			@Override
			public void imprimir(String cad) {
				System.out.println("dentro de la implementacion de la interface");
			}
			
		};
				
		
	}
	
}



/**
 * The Class EjercicioMetodoEstatico.
 * En la interfaz InterfacePrinter creamos una clase anonima que se devuelve a si misma con todos los metodos
 * El metodo estatico of es el que se devuelve a si mismo con todos los metodos asociados
 *  
 * 
 */
public class EjercicioMetodoEstatico {
	
	public static void main(String[] args) {
		
		
		//USAMOS EL METODO ESTATICO DE LA INTERFAZ
		InterfacePrinter.of().imprimir("Esto es");
		
		

	}

}
