package com.jgr.paquete.hilos.modelos;


/**
 * The Class ViajeTarea.
 * Hereda de Runnable para que pueda meterse en un hilo
 */
public class ViajeTarea implements Runnable{
	 
 	/** The nombre. */
 	private String nombre;

	    /**
    	 * Instantiates a new viaje tarea.
    	 *
    	 * @param nombre the nombre
    	 */
    	public ViajeTarea(String nombre) {
	        this.nombre = nombre;
	    }

	    /**
    	 * Gets the nombre.
    	 *
    	 * @return the nombre
    	 */
    	public String getNombre() {
	        return nombre;
	    }

	    /**
    	 * Run.
    	 */
    	@Override
	    public void run() {
	        for(int i=0; i < 10; i++){
	            System.out.println(i + " - " + nombre);
	            try {
	                Thread.sleep( (long)(Math.random() * 100));
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("Finalmente me voy de viaje a: " + nombre);

	    }
	}
