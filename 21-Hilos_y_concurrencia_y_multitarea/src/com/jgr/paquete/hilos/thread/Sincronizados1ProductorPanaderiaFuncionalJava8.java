package com.jgr.paquete.hilos.thread;

import java.util.concurrent.ThreadLocalRandom;

import com.jgr.paquete.hilos.modelos.Panaderia;
import com.jgr.paquete.hilos.modelos.Panadero;

/**
 * igual que Sincronizados1ProductorPanaderia pero con programacion funcional
 */
public class Sincronizados1ProductorPanaderiaFuncionalJava8 {
	

	public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread( () -> {
            for(int i = 0; i < 10; i++){
                p.hornear("Pan nº: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread( () -> {
            for(int i = 0 ; i < 10; i++){
                p.consumir();
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}