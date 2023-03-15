package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.Panaderia;

/**
 * The Class Sincronizados2ConsumidorPanaderia.
 */
public class Sincronizados2ConsumidorPanaderia implements Runnable{
    private Panaderia panaderia;

    public Sincronizados2ConsumidorPanaderia(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10; i++){
            panaderia.consumir();
        }
    }
}

