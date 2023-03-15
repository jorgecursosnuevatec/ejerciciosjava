package com.jgr.enumeraciones.lanzadora;

import com.jgr.enumeraciones.modelo.Continentes;


/**
 * The Class LanzadoraContinentes.
 * La clase enum tiene atributos
 * como el numero de paises privado, lo recuperamos con el get 
 */
public class LanzadoraContinentes {
	   
   	/**
   	 * The main method.
   	 *
   	 * @param args the arguments
   	 */
   	public static void main(String[] args) {

	        System.out.println("Continente no. 4: " + Continentes.AMERICA);
	        System.out.println("No. Paises en el 4to contienente: " 
	                + Continentes.AMERICA.getPaises()); 
	        
	        System.out.println("Continente no. 1: " + Continentes.AFRICA);
	        System.out.println("No. Paises en el 1er contienente: " 
	                + Continentes.AFRICA.getPaises()); 
	        
	    }

}
