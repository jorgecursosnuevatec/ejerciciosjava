package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.ViajeTarea;

/**
 * The Class Thread_Sleep.
 * con el sleep paro el metodo principal para asegurarme de que acaban los otros
 */
public class Thread_Sleep {
	
/**
 * The main method.
 *
 * @param args the arguments
 * @throws InterruptedException the interrupted exception
 */
public static void main(String[] args) throws InterruptedException {
		
	//defino este como el principal
	Thread main = Thread.currentThread();

        new Thread(new ViajeTarea("1 Isla de Pascua")).start();
        new Thread(new ViajeTarea("2 Robinson Crusoe")).start();
        new Thread(new ViajeTarea("3 Juan Fernandez")).start();
        new Thread(new ViajeTarea("4 Isla de Chiloe")).start();
        
        //con esto paro el principal 
        Thread.sleep(1000);
        System.out.println("********Salgo del método main: " + main.getName());
    }

}
