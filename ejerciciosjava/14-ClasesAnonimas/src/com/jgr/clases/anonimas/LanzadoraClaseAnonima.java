package com.jgr.clases.anonimas;

import com.jgr.clases.anonimas.modelo.Circulo;
import com.jgr.clases.anonimas.modelo.Figura;
import com.jgr.clases.anonimas.modelo.Triangulo;

/**
 * The Class LanzadoraClaseAnonima.
 * 
 * Una clase interna sin nombre y para la que solo necesitamos crear un único objeto se 
 * conoce como clase interna anónima de Java
 * 
 * 
 * Clases anónimas en java se usan mucho por ejemplo en escuchadores, callbacks o eventos. 
 * La ventaja de una clase anónima es que puede acceder variables locales en su alcance.
 * En pocas palabras, el uso de una clase anónima te permite crear un objeto que implementa una interfaz en particular y poder usarlo libremente sin la molestia de tener que definir explícitamente una clase.

 *Aunque nunca es estrictamente necesario emplear las clases anónimas (siempre es posible lograr un 
 *código equivalente usando clases normales), hay por lo menos 3 ventajas en su uso que se me ocurren,
 *y que aplican bajo ciertas circunstancias:

 *Si hay un solo lugar en tu código donde se necesitaría una instancia de una clase en particular, 
 *el tener que tomar la pena de definir una clase entera para un solo uso se puede volver fastidioso. 
 *Una clase anónima es ideal para estas situaciones, y te evita contaminar tu proyecto con clases que 
 *no piensas reutilizar en otros lugares de todas maneras.
 *Sobre todo cuando la implementación es corta, el que la implementación de la clase se encuentre 
 *directamente en el lugar donde se usa, puede hacer que el código sea más legible y entendible.
 *Te permite acceder de forma conveniente a variables locales y miembros de clase sin la molestia de 
 *tener que definir un constructor para poder recibirlas y usarlas. 
 *(Aunque en cuanto a las miembros de clase, se puede lograr lo mismo con clases anidadas).
 * 
 * 
 */
public class LanzadoraClaseAnonima {


	public static void main(String[] args) {

		Figura cir = new Circulo("Amarillo",15);
		Figura tri = new Triangulo("Amarillo",15,10);
		
//		System.out.print("\ncirculo-figura->"+(cir instanceof Figura));
//		System.out.print("\tfigura-circlo>"+(cir instanceof Circulo));

		
		//esta seria una clase ANONIMA, seria una subclase de figura
		Figura f = new Figura("verde") {
			@Override
			public double superficie() {
				return 10*2;
			}
		};
		
		System.out.println("F NO es figura,es una subclase->"+f.getClass().toString());
		System.out.println("F instance of->"+(f instanceof Figura));
		System.out.println("F instance of->"+(f instanceof Circulo));
		

	}

}
