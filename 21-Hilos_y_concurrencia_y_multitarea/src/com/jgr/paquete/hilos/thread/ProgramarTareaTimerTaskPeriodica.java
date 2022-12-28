package com.jgr.paquete.hilos.thread;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * The Class ProgramarTareaTimerTaskPeriodica.
 * programa tarea periodica
 */
public class ProgramarTareaTimerTaskPeriodica {
	
   	public static void main(String[] args) {

	        Toolkit toolkit = Toolkit.getDefaultToolkit();
	        AtomicInteger contadorAtomic = new AtomicInteger(4);
	        Timer timer = new Timer();
	        
	        timer.schedule(new TimerTask(){
	            @Override
	            public void run() {
	                int i = contadorAtomic.getAndDecrement();
	                if(i > 0) {
	                    toolkit.beep();
	                    System.out.println("Tarea " +i+ " periódica en: "
	                            + new Date() + " nombre del Thread: "
	                            + Thread.currentThread().getName());
	                } else {
	                    System.out.println("Finaliza el tiempo");
	                    timer.cancel();
	                }
	            }
	        }, 50, 500);//empieza con un retraso de 50 ms y se repite cada 500

	        System.out.println("Agendamos una tarea inmediata que se repite cada 10 seg ...");
	    }
	}
