package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.TareaThread;

/**
 * The Class LanzaThread.
 * no se suele usar extends Thread porque la clase que lo hereda no puede heredar de otra
 * los thread son tareas que se ejecutan dentro de un proceso
 * 
 */
public class LanzaThread {

	/**
	 * The main method.
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		
		Thread hilo1 = new TareaThread("tareaThread1");
		Thread hilo2 = new TareaThread("tareaThread2");
		
		System.out.println("estado tareaThread1 ANTES START->"+ hilo1.getState());
		hilo1.start();
		hilo2.start();
		System.out.println("estado tareaThread1 DESPUES START->"+ hilo2.getState());	
		//mejor no hacerlo,pero para que no se quede pillado
		hilo1.interrupt();
		hilo2.interrupt();
		System.out.println("estado tareaThread1->" + hilo1.getState());
		System.out.println("estado tareaThread2->" + hilo2.getState());
		

		
	}

}
