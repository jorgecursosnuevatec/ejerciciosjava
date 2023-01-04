package com.jgr.paquete.hilos.modelos;

/**
 * The Class TareaThread.
 * tiene que extender de Thread,se desaconseja porque como ya hereda de una clase no puede heredar de mas
 */
public class TareaThread extends Thread{
	
	String name;
	public TareaThread(String name) {
		super(name);
		this.name=name;
	}
	
	/**
	 * Run.
	 */
	public void run() {
		System.out.println("\nEntro en Clase TareaThread llamada->"+getName());
		
		for (int i=0;i<10;i++) {
			System.out.println("Dentro del run de :"+ getName()+" ->"+this.getState() +" "+ i);
		}
		System.out.println("Salgo del run de :"+ getName()+" ->" +this.getState());
	}

}
