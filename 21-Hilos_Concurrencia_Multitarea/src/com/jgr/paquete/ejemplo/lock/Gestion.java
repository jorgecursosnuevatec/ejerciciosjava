package com.jgr.paquete.ejemplo.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author Bron
 */
public class Gestion {

    /**
     * Esta clase es la que gestiona los botones de reanudar y parar.
     */
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock w = lock.writeLock();
    public boolean pausar;

    public Gestion() {
    }

    public void reanudar() {
        
        /*
         * Ponemos pausar a false y desbloqueamos el escritor
         */
        
        pausar = false;
        w.unlock();

    }

    public void detener() {
        
        /*
         * Ponemos el pausar a true y bloqueamos el escritor
         */
        
        w.lock();
        pausar = true;
    }

    public void parar() {
        
        /*
         * Si está pausado, al mirar sigue estando bloqueado, y cuando termine lo desbloqueamos
         */
        if (pausar) {
            w.lock();
        try {
        } finally {
            w.unlock();
        }
        }
    }
}
