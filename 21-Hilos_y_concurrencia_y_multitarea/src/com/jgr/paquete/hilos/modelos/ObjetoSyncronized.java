package com.jgr.paquete.hilos.modelos;

public class ObjetoSyncronized implements Runnable {
	
	private int contador;

	public ObjetoSyncronized() {
		super();
	}

	public ObjetoSyncronized(int contador) {
		super();
		this.contador = contador;
	}
	
	@Override
	public void run() {
		 metodoSincronizado();
		
	}


	/**
	 * @return the contador
	 */
	public int getContador() {
		return this.contador;
	}

	/**
	 * @param contador the contador to set
	 */
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public synchronized void metodoSincronizado(){
		
		for (int i=0; i<contador;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}			 
			 System.out.println("MetodoSincronizado-Hilo->"+Thread.currentThread().getName());
			
		}
		
		
	}

	
}
