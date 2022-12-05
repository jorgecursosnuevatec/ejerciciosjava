package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.TareaRunnable;
import com.jgr.paquete.hilos.modelos.TareaThread;

/**
 * The Class LanzaThreadyRunnable.
 * no se suele usar extends Thread porque la clase que lo hereda no puede heredar de otra
 * los thread son tareas que se ejecutan dentro de un proceso
 * 
 */
public class LanzaThreadyRunnable {

	/**
	 * The main method.
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		TareaThread tareaThread = new TareaThread();
		
		System.out.println("estado tareaThread ANTES START->"+ tareaThread.getState());
//se le invoca llamando a start
		tareaThread.start();
		System.out.println("estado tareaThread DESPUES START->"+ tareaThread.getState());
		
		Runnable tareaRunnable = new TareaRunnable();
		
		Thread t = new Thread(tareaRunnable);
		System.out.println("estado TareaRunnable ANTES START->"+ t.getState());
		t.start();
		System.out.println("estado TareaRunnable DESPUES START->"+ t.getState());		
		
		

	}

}
