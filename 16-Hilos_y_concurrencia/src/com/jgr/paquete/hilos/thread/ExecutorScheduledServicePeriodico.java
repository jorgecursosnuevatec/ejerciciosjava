package com.jgr.paquete.hilos.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The Class ExecutorScheduledService.
 * planifica una tarea de manera periodica
 */
public class ExecutorScheduledServicePeriodico {
	public static void main(String[] args) {
	      ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

	        System.out.println("Alguna tarea en el main ...");

	        AtomicInteger contador = new AtomicInteger(5);
	        // CountDownLatch lock = new CountDownLatch(5);
	        Future<?> future = executor.scheduleAtFixedRate(() -> {
	            System.out.println("Hola mundo tarea ...");
	            try {
	                TimeUnit.MILLISECONDS.sleep(1000);
	                // lock.countDown();
	                contador.getAndDecrement();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	        }, 1000, 2000,TimeUnit.MILLISECONDS);//la tarea se ejecuta en 20000

	        // lock.await();
	        // future.cancel(true);
	        // TimeUnit.SECONDS.sleep(10);
	        while(contador.get() >= 0){
	            if(contador.get() == 0){
	                future.cancel(true);
	                contador.getAndDecrement();
	            }
	        }
	        System.out.println("Alguna otra tarea en el main ....");
	        executor.shutdown();
	    }
	}
