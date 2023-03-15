package com.jgr.paquete.hilos.thread;

/**
 * The Class HiloWaiting. esta en estado Waiting cuando esta esperando a
 * otro que esta en wait() o en join();
 */
public class HiloWaiting {

	public static void main(String[] args) throws InterruptedException {

		// defino este hilo que es el del main como principal
		Thread t1 = Thread.currentThread();
		//este se queda parado 1000 ms
		Thread t2 = new Thread(() -> {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
				System.out.println("estado t1->"+t1.getState());
		});
		t2.start();
		//este se une al hilo principal t1 y el principal espera a que acabe el t2
		t2.join();
		t2.interrupt();
		

	}

}
