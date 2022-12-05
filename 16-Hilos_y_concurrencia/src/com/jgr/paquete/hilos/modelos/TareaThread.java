package com.jgr.paquete.hilos.modelos;

/**
 * The Class TareaThread.
 * tiene que extender de Thread,se desaconseja porque como ya hereda de una clase no puede heredar de mas
 */
public class TareaThread extends Thread{
	
	/**
	 * Run.
	 */
	public void run() {
		System.out.println("Clase TareaThread");
	}

}
