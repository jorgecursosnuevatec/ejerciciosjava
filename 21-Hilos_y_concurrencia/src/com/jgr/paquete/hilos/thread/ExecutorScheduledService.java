package com.jgr.paquete.hilos.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * The Class ExecutorScheduledService.
 * planifica una tarea de manera periodica,o cuando se cumpla el delay
 */
public class ExecutorScheduledService {
	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

		System.out.println("Alguna tarea en el main ...");

		executor.schedule(() -> {
			System.out.println("Hola mundo tarea ..." + executor.hashCode());
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}, 2000, TimeUnit.MILLISECONDS);// 200 de espera entre cada una

		System.out.println("Alguna otra tarea en el main ....");
		executor.shutdown();
		System.out.println("Apagado el executor->" + executor.isTerminated());
    }
}
