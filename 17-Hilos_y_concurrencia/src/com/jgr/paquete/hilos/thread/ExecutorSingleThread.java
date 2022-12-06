package com.jgr.paquete.hilos.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * The Class ExecutorSingleThread.
 * usamos un executors pero creando solo un hilo
 */
public class ExecutorSingleThread {

	
	public static void main(String[] args) throws InterruptedException {
		//este solo ejecuta una tarea,o una instancia de un runnable
		//Executor
		//crea un pool de hilos que los gestiona
		ExecutorService ejecutor = Executors.newSingleThreadExecutor();
		
		Runnable tarea =()->{
			System.out.println("inicio tarea");
			try {
				System.out.println("nombre Thread->"+Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {	
				//en caso de que se interrupta lo eliminamos 
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			System.out.println("acaba el thread");
		};
		ejecutor.submit(tarea);
		//lo para de golpe,se interrumpe todo. puede provocar inconsistencia
		//ejecutor.shutdownNow();
		
		//espera a que acaben las tareas incluidas las que estan en cola 
		ejecutor.shutdown();
		System.out.println("estoy terminando el main 1");
		//espera a que acabe lo que se esta ejecutando,luego sigue el main
		ejecutor.awaitTermination(2, TimeUnit.SECONDS);
		
		System.out.println("estoy terminando el main 2");
		
	

	}

}
