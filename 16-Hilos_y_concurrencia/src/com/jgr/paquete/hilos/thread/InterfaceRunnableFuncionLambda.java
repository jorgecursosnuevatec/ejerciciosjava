package com.jgr.paquete.hilos.thread;

/**
 * The Class InterfaceRunnable.
 * ejecutamos todos estos hilos a la vez, como el orden no esta controlado,
 *  no se puede saber cual acabara antes sacando el msg Finalmente me voy de viaje a: " + nombre
 */
public class InterfaceRunnableFuncionLambda {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		// instancio un runnable y creo una funcion lambda igual que la clase viajetarea
		Runnable viaje = new Runnable() {
			// sobreescribo el run
			@Override
			public void run() {
				int contador_hilo = 0;
				for (int i = 0; i < 10; i++) {
					contador_hilo = i;
					System.out.println("Primera forma " + contador_hilo + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep((long) (Math.random() * 100));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Primera forma  Finalmente me voy de viaje a: " + contador_hilo + "->"
						+ Thread.currentThread().getName());

			}

		};

		new Thread(viaje, "1Isla de Pascua").start();
		new Thread(viaje, "2Robinson Crusoe").start();
		new Thread(viaje, "3Juan Fernandez").start();
		new Thread(viaje, "4Isla de Chiloe").start();

		// esta seria otra manera de hacerlo
		Runnable viaje2 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep((long) (Math.random() * 100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Acabo->" + Thread.currentThread().getName());
		};

		new Thread(viaje2, "Hilo1").start();
		new Thread(viaje2, "Hilo2").start();
		new Thread(viaje2, "Hilo3").start();
		new Thread(viaje2, "Hilo4").start();
	}

}
