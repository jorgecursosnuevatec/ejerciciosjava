package com.jgr.paquete.hilos.thread.nuevas;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * The Class LanzadoraInterfazFuture.
 * -el metodo submit(Callable tarea) de executorService devuelve un objeto Future que pede usarse para acceder
 * al resultado y controlar su ejecucion
 * -isDone()->para saber si ha finalizado
 * -get()->devuelve el valor generado por callable,si no ha terminado se queda esperando el resultado
 * 
 * Future<Integer> f= exservice.submit(()->System.out.println("by"))
 * seria erronea porque no devuelve nada,el tipo de dato deberia ser ?
 * 
 * Future<String> f= exservice.submit(()->"hello");
 * seria correcto porque devuelve un string
 * 
 * Future<?> f= exservice.submit((n)->System.out.println(n));
 * seria erronea porque submit no admite parametros
 * 
 */
public class LanzadoraInterfazFuture {

	
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
