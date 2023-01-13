package com.jgr.metodos.estaticos.interfaces;


/**
 * The Class LanzadoraEstaticosInterfaces.
 * El metodo  print que hemos definido en la interface SOLO puede usarse desde dentro de la misma interface
 * no se hereda
 */
public class LanzadoraEstaticosInterfaces {

	public static void main(String[] args) {
		
		
		//creo una clase anonima de la interface
		InterfaceMetodoEstatico f = new InterfaceMetodoEstatico() {
			
			@Override
			public void imprime() {
				System.out.println("Ejecutando como clase anonima CON INTERFACE" );
				System.out.println("Clase anonima INTERFACE->" +this.getClass().getName());
				System.out.println("Clase anonima INTERFACE->" +this.getClass().getAnnotatedInterfaces());
				
			}
		};

		//ESTE METODO ES ESTATICO Y ESTA DEFINIDO EN LA INTERFACE
		InterfaceMetodoEstatico.print();
		f.imprime();
		
		
		//directamente de la clase
		ClaseHeredaMetodoEstatico clase = new ClaseHeredaMetodoEstatico();		
		clase.imprime();
		
		
	}

}
