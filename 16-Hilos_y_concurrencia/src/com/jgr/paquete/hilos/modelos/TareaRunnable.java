package com.jgr.paquete.hilos.modelos;

/**
 * The Class TareaRunnable.
 * es parecido a Thread,pero en vez de heredar de Thread implementa runnable
 */
public class TareaRunnable implements Runnable{

	/**
	 * Run.
	 */
	@Override
	public void run() {
		System.out.println("Clase TareaRunnable");
		
		
	}

}
