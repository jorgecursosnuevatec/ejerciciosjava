package com.jgr.paquete.hilos.thread;


/**
 * The Class LanzadorHiloBloqueado.
 * Ejemplo de bloqueo de hilos
 */
public class LanzadorHiloBloqueado {

	
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable=()->recursoBloqueo();
		
		Thread t1 = new Thread(runnable);
		Thread t2= new Thread(runnable);
		
		t1.start();
		t2.start();
		Thread.sleep(1000);
		//el segundo no va poder entrar hasta que termine el primero
		System.out.println("estado t1->"+ t1.getState());
		System.out.println("estado t2->"+ t2.getState());
	}
	
	
	public static synchronized void recursoBloqueo() {
		
		while (true) {}
	}

}
