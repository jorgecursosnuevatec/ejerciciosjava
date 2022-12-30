package com.jgr.paquete.hilos.thread.nuevas;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The Class LanzadoraInterfazExecutorService.
 * en el paquete java.util.concurrent
 * 
 * Clase Executors
 * 
 * Interfaz ExecutorService,es la principal para lanzar y ejecutar tareas de forma concurrente,usando un pool de threads
 * -submit(Runnable tarea)->lanza la tarea y la pone en ejecucion concurrente con el resto
 * -submit(Callable tarea)->igual que Runnable para objetos Callable
 * -shutdown()->finaliza el pool de hilos,no se admiten mas tareas.HASTA QUE NO SE LLAMA A ESTE METODO SIGUE EN MAQUINA,NO SE PARA
 * Para crear implementaciones de la interfaz
 * -newCachedThreadPools()->crea un executorService con un pool variable que se crean a demanda
 * -newFixedThreaPools(int hilos)->crea un pool con un numero fijo de hilos
 * -newSingleThreadExecutor()->crea un executor con un solo hilo
 * -newScheduledThreadPool(int corePoolSize)->devuelve un ScheduledExecutorService que ejecuta tareas periodicamente
 * 
 * 
 * exservice.submit(()->System.out.println("hola"));
 * seria un callable,correcto porque no devuelve nada
 * exservice.submit(()->5);
 * seria un runnable porque devuelve un dato,seria correcto
 * 
 */
public class LanzadoraInterfazExecutorService {

	public static void main(String[] args) {
		
		//SI NO SE LLAMA A shutdown() no se paran los hilos
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.submit(()->System.out.println("Hola"));
		ex.submit(()->System.out.println("Mundo"));
	

	}

}
