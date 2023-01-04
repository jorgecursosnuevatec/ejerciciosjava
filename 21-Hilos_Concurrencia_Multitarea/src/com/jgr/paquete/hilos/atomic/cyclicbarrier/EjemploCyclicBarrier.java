package com.jgr.paquete.hilos.atomic.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

// https://chuwiki.chuidiang.org/index.php?title=Ejemplo_simple_con_CyclicBarrier
/**
 * The Class EjemploCyclicBarrier.
 */
public class EjemploCyclicBarrier {
	
	public static void main(String[] args) {
        int numeroHilos = 5;
        final CyclicBarrier barreraInicio = new CyclicBarrier(numeroHilos + 1);
        final CyclicBarrier barreraFin = new CyclicBarrier(numeroHilos + 1);

        
        for (int i = 0; i < numeroHilos; i++) {
            Thread hilo = new Thread() {
                public void run() {
                    try {
                    	
                        barreraInicio.await();
                        System.out.println("hilo ejecutandose->");
                        barreraFin.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            hilo.start();
        }

        try {
            System.out.println("levanto barrera");
            barreraInicio.await();
            barreraFin.await();
            System.out.println("todo acabado");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}