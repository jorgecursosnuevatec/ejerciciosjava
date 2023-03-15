package com.jgr.patron.decorador2;

import com.jgr.patron.decorador.comun.Formateable;
import com.jgr.patron.decorador.modelo.Texto;
import com.jgr.patron.decorador.modelo.auxiliar.MayusculaDecorador;
import com.jgr.patron.decorador.modelo.auxiliar.RemplazarEspaciosDecorador;
import com.jgr.patron.decorador.modelo.auxiliar.ReversaDecorador;
import com.jgr.patron.decorador.modelo.auxiliar.SubrayadoDecorador;
import com.jgr.patron.decorador2.comun.Configurable;
import com.jgr.patron.decorador2.modelo.Cafe;
import com.jgr.patron.decorador2.modelo.auxiliar.ConChocolateDecorador;
import com.jgr.patron.decorador2.modelo.auxiliar.ConCremaDecorador;
import com.jgr.patron.decorador2.modelo.auxiliar.ConLecheDecorador;


/**
 * The Class EjemploDecoradorCafe. agrega funcionalidad pero sin utilizar herencia
 * El patrón Decorator responde a la necesidad de añadir dinámicamente funcionalidad a un Objeto. 
 * Esto nos permite no tener que crear sucesivas clases que hereden de la primera incorporando la nueva 
 * funcionalidad, sino otras que la implementan y se asocian a la primera
 * Se relacionan por medio de una interfaz que es la que añade funcionalidades
 * todos estan relacionados con formateable.
 * EN ESTE CASO estan relacionados por herencia, es la clase principal cafe la que implementa la interfaz
 * configurable , y por herencia el resto de clases van añadiendo caracteristicas o funcionalidades especificas
 * para ellas mismas
 * https://es.wikipedia.org/wiki/Decorator_(patr%C3%B3n_de_dise%C3%B1o)
 * 
 * 
 */
public class EjemploDecoradorCafe {
	 public static void main(String[] args) {
	        Configurable cafe = new Cafe("Cafe Mocha", 7);
	        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
	        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
	        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

	        System.out.println("El precio del cafe moca es: " + conChoco.getPrecioBase());
	        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

	        Configurable capuchino = new Cafe("Cafe Capuchino", 4);
	        conCrema = new ConCremaDecorador(capuchino);
	        conLeche = new ConLecheDecorador(conCrema);
	        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
	        System.out.println("Los Ingredientes " + conLeche.getIngredientes());

	        Configurable espresso = new Cafe("Cafe Espresso", 3);
	        System.out.println("El precio del cafe Espresso es " + espresso.getPrecioBase());
	        System.out.println("Los ingredientes del cafe Espresso es: " + espresso.getIngredientes());

	    }
	}
