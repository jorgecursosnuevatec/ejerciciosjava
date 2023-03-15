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
				System.out.println("Clase anonima INTERFACE->" +this.getClass().getName().toString());
				System.out.println("Clase anonima INTERFACE->" +this.getClass().getAnnotatedInterfaces().toString());
				
			}
		};

		//ESTE METODO ES ESTATICO Y ESTA DEFINIDO EN LA INTERFACE
		InterfaceMetodoEstatico.print();
		f.imprime();
		//puedo acceder a la constante estatica desde la propia interface,y desde una instancia
		int numero=InterfaceMetodoEstatico.constante;
		int error = f.constante;
		//accedo a un metodo implementado de la interface,desde la clase que lo implementa NO PUEDO
		InterfaceMetodoEstatico.print();
		
		

		
		
		//directamente de la clase
		ClaseHeredaMetodoEstatico clase = new ClaseHeredaMetodoEstatico();		
		clase.imprime();
		//puedo acceder a las variables estaticas desde una instancia de la clase que implementa
		//la interface
		int constante=clase.constante;
		
		
		
		
	}

}
