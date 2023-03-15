package com.jgr.enumeraciones.lanzadora;

import com.jgr.enumeraciones.modelo.Dias;

// TODO: Auto-generated Javadoc
/**
 * The Class LanzadoraDias.
 */
public class LanzadoraDias {
	  
  	/**
  	 * The main method.
  	 *
  	 * @param args the arguments
  	 */
  	public static void main(String[] args) {
	        System.out.println("Dia 1:" + Dias.LUNES );
	        indicarDiaSemana(Dias.MARTES);
	    }
	    
	    /**
    	 * Indicar dia semana.
    	 *
    	 * @param dias the dias
    	 */
    	private static void indicarDiaSemana(Dias dias){
	        switch(dias){
	            case LUNES:
	                System.out.println("Primer dia de la semana");
	                break;
	            case MARTES:
	                System.out.println("Segundo dia de la semana");
	        }
	    }
	}


