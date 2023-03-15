package com.jgr.patrones.abstracta.factoria;

import com.jgr.patrones.abstracta.factoria.base.PizzaProducto;
import com.jgr.patrones.abstracta.factoria.base.PizzeriaCaliforniaFactory;
import com.jgr.patrones.abstracta.factoria.base.PizzeriaNewYorkFactory;
import com.jgr.patrones.abstracta.factoria.base.PizzeriaZonaAbstractFactory;


/**
 * A factory for creating EjemploAbstract objects.
 * Se crean como familia de objetos,se relacionan con interfaces o herencia
 * en este caso partimos de lo mas generico que seria la PizzaProducto,algo abstracto con sus propiedades
 * Luego tenemos la fabrica con metodos abstractos, que es lo que pueden hacer y tienen que implementar las que
 * herenden
 * Es como la capa de repositorio y de negocio en Spring
 * aqui se crea la clase abstracta pizza producto que se usa en PizzeriaZonaAbstractFactory
 * las pizzas mas genericas heredan de ella y luego hay implementaciones con caracteristicas especificas
 */
public class EjemploAbstractFactory {
	public static void main(String[] args) {
		
		//esta seria la fabrica, los metodos
	        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
	        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

			//este es el modelo con sus propiedades
	        PizzaProducto pizza = california.ordenarPizza("queso");
	        System.out.println("Bruce ordena la pizza " + pizza.getNombre());
	        
	        pizza = ny.ordenarPizza("pepperoni");
	        System.out.println("Andrés ordena una " + pizza.getNombre());
	        
	        pizza = california.ordenarPizza("vegetariana");
	        System.out.println("James ordena " + pizza.getNombre());
	        
	        pizza = ny.ordenarPizza("vegetariana");
	        System.out.println("Linus ordena la pizza " + pizza.getNombre());
	        
	        pizza = california.ordenarPizza("pepperoni");
	        System.out.println("John ordena la pizza " + pizza.getNombre());

	        System.out.println("pizza = " + pizza);
	    }
	}
