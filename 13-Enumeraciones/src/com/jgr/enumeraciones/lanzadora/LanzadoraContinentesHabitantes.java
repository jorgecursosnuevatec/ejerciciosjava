package com.jgr.enumeraciones.lanzadora;

import com.jgr.enumeraciones.modelo.Continentes;
import com.jgr.enumeraciones.modelo.ContinentesHabitantes;


/**
 * The Class LanzadoraContinentes.
 * La clase enum tiene atributos
 * como el numero de paises privado, lo recuperamos con el get 
 * 
 * con values recupero la lista de posibles valores que tiene la enumeracion
 * con name recupero cada uno de los valores individuales que devuelve values
 * 
 * 
 */
public class LanzadoraContinentesHabitantes {
	 
   	public static void main(String[] args) {

   		System.out.println("Continente no. 4: " + ContinentesHabitantes.AMERICA);
   		System.out.println("No. Paises en el 4to contienente: " + Continentes.AMERICA.getPaises());
   		System.out.println("No. Habitantes en el 4to contienente: " + ContinentesHabitantes.AMERICA.getHabitantes());

   		System.out.println("\n");

   		for (ContinentesHabitantes c : ContinentesHabitantes.values()) {
   			System.out.println(c);
   			System.out.println(c.name());

   			System.out.println(c.getHabitantes());
   			System.out.println(c.getPaises());

   		}

   	}

}
