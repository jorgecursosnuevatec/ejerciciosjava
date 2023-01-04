package com.jgr.paquete.ejemplo.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author Bron
 */
public class Libro {

    /**
     * Esta clase libro es la variable compartida y por tanto, la que tenemos
     * que proteger de lectores/escritores para que el programa funcione
     * satisfactoriamente.
     *
     * Creamos todos los atributos necesarios para que el programa funcione,
     * incluyendo los locks para gestionar la entrada y salida de los escritores
     */
    private String libro;
    private LanzadoraInterfaz interfaz;
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock r = lock.readLock();
    private Lock w = lock.writeLock();

    /**
     *
     * @param interfaz
     */
    public Libro(LanzadoraInterfaz interfaz) {

        /**
         * Creamos el constructor y inicializamos a lo que queremos.
         */
        this.interfaz = interfaz;
        libro = "";
    }

    public void leerLibro(int identificador) {

        /**
         * Este método se encarga de leer el libro, antes de leer, bloqueamos el
         * lock de lectura.
         */
        r.lock();
        interfaz.meterDatos(1, interfaz.leerDatos(1) + "" + identificador + " ");
    }

    public boolean libroTerminado() {

        /**
         * Si el libro ha llegado a 50 habremos terminado de leer y devolvemos
         * un valor booleano.
         */
        if (libro.length() == 50) {
            return true;
        } else {
            return false;
        }
    }

    public void terminarLeer(int identificador) {

        /**
         * Este método se encarga de terminar de leer los datos, desbloquea el
         * LOCK de lectura cuando hemos terminado.
         */
        interfaz.meterDatos(1, interfaz.leerDatos(1).replaceAll("" + identificador + " ", ""));
        if (libroTerminado()) {
            interfaz.meterDatos(4, interfaz.leerDatos(4) + "Leido por " + identificador + ": " + libro + "\n");
        }
        r.unlock();
    }

    public void escribirLibro(int identificador) {

        /**
         * Este método se encarga de escribir en el libro, la estructura es como
         * la de lectura. Bloqueamos el LOCK de escritura.
         *
         */
        w.lock();
        libro = libro + identificador;
        interfaz.meterDatos(2, interfaz.leerDatos(2) + identificador);
        interfaz.meterDatos(3, libro);
    }

    public void terminarEscribir(int identificador) {

        /**
         * Método que termina de escribir un libro. Desbloqueamos el LOCK de
         * escritura.
         */
        interfaz.meterDatos(2, interfaz.leerDatos(2).replaceAll("" + identificador, ""));
        w.unlock();
    }
}
