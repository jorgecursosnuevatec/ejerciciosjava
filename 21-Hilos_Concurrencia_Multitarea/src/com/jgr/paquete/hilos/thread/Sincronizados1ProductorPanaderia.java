package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.Panaderia;
import com.jgr.paquete.hilos.modelos.Panadero;

/**
 * The Class Sincronizados1ProductorPanaderia.
 */
public class Sincronizados1ProductorPanaderia {

	public static void main(String[] args) {
		Panaderia p = new Panaderia();
		new Thread(new Panadero(p)).start();
		new Thread(new Sincronizados2ConsumidorPanaderia(p)).start();

	}

}
