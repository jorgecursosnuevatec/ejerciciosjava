package com.jgr.paquete.hilos.thread;


/**
 * The Class LanzadorHiloTerminated.
 * TERMINATED es cuando acaba la ejecucion bien o por error.
 */
public class LanzadorHiloTerminated {

	public static void main(String[] args) throws InterruptedException {
		Thread t2 = new Thread(() -> {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
				
		});
		t2.start();
		Thread.sleep(1000);
		System.out.println("estado->"+t2.getState());
		System.out.println("isAlive->"+ t2.isAlive());
		t2.interrupt();
		System.out.println("estado despues interrupt->"+t2.getState());
		
		

	}

}
