/*
 * 
 */
package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.ViajeTarea;

/**
 * The Class Thread_Join.
 * espera a que acabe el resto de hilos que se ejecutan dentro de su proceso
 */
public class Thread_Join {

	public static void main(String[] args) throws InterruptedException {

		// defino este como el principal
		Thread main = Thread.currentThread();

		Thread v1 = new Thread(new ViajeTarea("1 Isla de Pascua"));
		Thread v2 = new Thread(new ViajeTarea("2 Robinson Crusoe"));
		Thread v3 = new Thread(new ViajeTarea("3 Juan Fernandez"));
		Thread v4 = new Thread(new ViajeTarea("4 Isla de Chiloe"));

		v1.start();
		v2.start();
		v3.start();
		v4.start();
		// relacionamos los hilos con el principal que va a esperar a que acaben todos
		v1.join();
		System.out.println("####estado del principal->" + main.getState());
		System.out.println("####getThreadGroup      ->" + main.getThreadGroup());
		main.getState();
		/*
		 * v2.join(); v3.join(); v4.join();
		 */
		System.out.println("********Salgo del método main: " + main.getName());
	}
}
