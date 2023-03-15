package com.jgr.enumeraciones.lanzadora;

import com.jgr.enumeraciones.modelo.PaisesContinentes;


/**
 * The Class LanzadoraPaisesContinentes.
 * Con el metodo name que es propio de las enumeraciones recuperamos el valor de las enumeraciones
 * AFRICA, con el metodo value los posibles valores que tenga cada enumeracion
 * 
 */
public class LanzadoraPaisesContinentes {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        imprimirEjemplo();
        
        PaisesContinentes pc = null;
        
        System.out.println("\nPaises de africa");
        
        
        for (String s:pc.AFRICA.getPaises()) {
        		System.out.println("nombre pais->"+s);        	
        }
        
     
        
      
        for (PaisesContinentes s:pc.values()) {
        	System.out.println("nombre continente->"+s);        	
        }
        
        
    }

    /**
     * Imprimir ejemplo.
     */
    public static void imprimirEjemplo() {
        for (PaisesContinentes c : PaisesContinentes.values()) {
            System.out.println("el continente es: " + c.name() + " contiene a " + c );
           
        }
    }
}
