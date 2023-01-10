package com.jgr.paquete.hilos.thread.nuevas;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The Class LanzadoraSincronizacionLock.
 * para sincronizar se utiliza la interfaz Lock
 * void lock()->bloquea
 * void unlock()->desbloquea
 * 
 * Se usa instanciando ReentrantLock,ReadlLock para lectura,WriteLock bloquea lectura/escritura 
 */
public class LanzadoraSincronizacionLock {

	static int cont=0;
	public static void main(String[] args) {
		
		
		//con este ejemplo en el bloque try que controlaria que solo se ejecute una vez con cada hilo 
		
		Lock lc = new ReentrantLock();
		
		lc.lock();
		try {
			int tmp = cont;
			tmp++;
			cont=tmp;
			
		}finally {
			lc.unlock();
		}
		
		


	}

}
