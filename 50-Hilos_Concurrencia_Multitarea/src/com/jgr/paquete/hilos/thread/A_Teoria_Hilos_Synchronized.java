package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.ObjetoSyncronized;

/**
 * The Class A_Teoria_Hilos_Synchronized.
 * se bloquea el acceso a un bloque de codigo hasta que acabe el anterior
 * se utiliza synchronized para delimitar el bloque
 * cuando un hilo entra en el bloque sincronizado adquiere el monitor del objeto y 
 * no lo suelta hasta terminarlo
 */
public class A_Teoria_Hilos_Synchronized {

	public static void main(String[] args) {
		
		ObjetoSyncronized ob1 = new ObjetoSyncronized(100);
		
		
		Thread th1 = new Thread(ob1);
		Thread th2 = new Thread(ob1);
		th1.start();
		th2.start();
		

	}

}
