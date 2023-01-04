package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.TareaRunnable;
import com.jgr.paquete.hilos.modelos.TareaThread;

/**
 * The Class A_Teoria_Hilos.
 * se puede hacer de dos maneras
 * 
 * 1-Exender de Thread
 * debe sobreescribirse el metodo run() donde se incluye el codigo
 * para ponerlo en ejecucion concurrente usamos el metodo start()
 * 
 * 
 * 2-implementar interfaz Runneable
 * la propia interfaz incluye el metodo run
 * para ponerlo en ejecucion creamos instancias de Thread
 * 
 * 
 */
public class A_Teoria_Hilos {

	public static void main(String[] args) {
		
		//extiende de thread,solo hace falta el start
		TareaThread t1 = new TareaThread("textoThread1");
		TareaThread t2 = new TareaThread("textoThread2");
		t1.start();
		t2.start();
		
		//implementa runnable,se sobreescribe run y se crean instancias de thread a partir del objeto
		//runnable
		TareaRunnable t1r = new TareaRunnable("textoRunnable1");
		Thread th1 = new Thread(t1r);
		Thread th2 = new Thread(t1r);
		th1.start();
		th2.start();
		

	}

}
