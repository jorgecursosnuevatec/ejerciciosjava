package com.jgr.paquete.hilos.modelos;

/**
 * The Class TareaRunnable.
 * es parecido a Thread,pero en vez de heredar de Thread implementa runnable
 */
public class TareaRunnable implements Runnable{

	private String name;
	public TareaRunnable(String name) {
		
		this.name=name;
				
	}
	@Override
	public void run() {
		
		System.out.println("Entro en Clase TareaRunnable llamada->"+ this.name);
		for (int i=0;i<10;i++) {
			System.out.println("Dentro del run de :"+ this.name +" "+ i);
		}
		System.out.println("Salgo del run de :"+ this.name);
		
		
		
		
	}

}
