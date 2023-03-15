package com.jgr.paquete.hilos.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * The Class ProgramarTareaTimer.
 */
public class ProgramarTareaTimer {
	 
 	
 	public static void main(String[] args) {
//como parametro en el delay le ponemos que se repita cada 5000 ms
	        Timer timer = new Timer();
//funcion que se planifica cada 	        
	        timer.schedule(new TimerTask(){
	            @Override
	            public void run() {
	                System.out.println("Tarea realizada en: " + new Date() + " nombre del Thread: "
	                 + Thread.currentThread().getName());
	                System.out.println("Finaliza el tiempo");
	                timer.cancel();
	            }
	        }, 5000);///5000 ms es el tiempo que se planifica

	        System.out.println("Agendamos una tarea para 5 segundos más ...");
	    }
	}
