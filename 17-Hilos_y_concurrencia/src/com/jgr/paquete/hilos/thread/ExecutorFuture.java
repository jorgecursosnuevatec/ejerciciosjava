package com.jgr.paquete.hilos.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * The Class ExecutorFuture.
 * Devuelve un future,la tarea que se esta ejecutando se puede seguir.
 * si es runnable o callable este resultado se puede dar cuando aunque acabe esto
 */
public class ExecutorFuture {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Callable<String> tarea = () -> {
			System.out.println("Inicio de la tarea...");
			try {
				System.out.println("Nombre del thread->" + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(3);// hacemos que se pare esta tarea
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			System.out.println("Finaliza la tarea ...");
			return "Algún resultado importante de la tarea";
		};

		Future<String> resultado = executor.submit(tarea);
		executor.shutdown();
		System.out.println("Continuando con la ejecución del método main");
		System.out.println("Ha terminado la tarea antes->" + resultado.isDone());
		// hace que espere a que termine

		while (!resultado.isDone()) {
			System.out.println("ejecutando tarea ....");
			TimeUnit.MILLISECONDS.sleep(1500);
		}

		System.out.println("Haciendo que espere a que termine->" + resultado.get());

		System.out.println("Continuando.....");

	}

}
