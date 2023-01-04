package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.TareaRunnable;


/**
 * The Class LanzaRunnable.
 * 
 * public abstract void run();
 * 
 * La diferencia con Callable es que esta ultima devuelve un valor, Runnable NO
 * 
 */
public class LanzaRunnable {
	public static void main(String[] args) {
		
		Runnable tareaRunnable = new TareaRunnable("Runnable");		
		Runnable tareaRunnable1 = new TareaRunnable("Runnable1");		
		Thread run = new Thread(tareaRunnable);
		Thread run1 = new Thread(tareaRunnable1);
		System.out.println("estado TareaRunnable ANTES START->"+ run.getState());
		run.start();
		run1.start();
		System.out.println("estado TareaRunnable DESPUES START->"+ run1.getState());	
		//mejor no hacerlo,pero para que no se quede pillado
		run.interrupt();
		run1.interrupt();
		System.out.println("estado TareaRunnable->" + run.getState());
		System.out.println("estado TareaRunnable->" + run1.getState());

	}

}
