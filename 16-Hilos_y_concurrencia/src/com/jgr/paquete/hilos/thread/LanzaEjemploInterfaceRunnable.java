package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.ViajeTarea;

/**
 * The Class LanzaEjemploInterfaceRunnable.
 * ejecutamos todos estos hilos a la vez, como el orden no esta controlado, no se puede saber cual acabara antes
 * sacando el msg Finalmente me voy de viaje a: " + nombre
 */
public class LanzaEjemploInterfaceRunnable {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("Robinson Crusoe")).start();
        new Thread(new ViajeTarea("Juan Fernandez")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();
    }

}
