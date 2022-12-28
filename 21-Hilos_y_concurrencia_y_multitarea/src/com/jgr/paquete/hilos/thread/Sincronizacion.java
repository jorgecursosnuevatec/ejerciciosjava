package com.jgr.paquete.hilos.thread;

import com.jgr.paquete.hilos.modelos.ImprimirFrases;

/**
 * The Class Sincronizacion.
 * sincronizamos la ejecucion de los hilos
 */
public class Sincronizacion {

	 /**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 * @throws InterruptedException the interrupted exception
 	 */
 	public static void main(String[] args) throws InterruptedException {
		 
	        Thread h1 = new Thread(new ImprimirFrases("Hola ", "que tal"));
	        h1.start();
	        Thread h2 = new Thread(new ImprimirFrases("¿Quién eres ", "tú?"));	        
	        h2.start();
	        
	        Thread.sleep(100);
	        Thread h3 = new Thread(new ImprimirFrases("Muchas ", "gracias amigo!"));
	        h3.start();
	        Thread.sleep(100);
	        
	        System.out.println("hilo1->" + h1.getState());
	        System.out.println("hilo2->" + h1.getState());
	        System.out.println("hilo3->" + h1.getState());

	    }

	    /**
    	 * Imprimir frases.
    	 * con el synchronized cada hilo entra pero por orden,el resto espera a que acabe el hilo anterior    	
    	 */
    	public synchronized static void imprimirFrases(String frase1, String frase2){
	    	
	        System.out.print("\n*****Sincronizacion-imprimirFrases\n");
	        System.out.print(frase1);

	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.print("\n*****Salgo sincronizacion-imprimirFrases\n");
	        System.out.println(frase2);
	    }
}
