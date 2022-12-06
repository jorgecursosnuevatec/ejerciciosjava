package com.jgr.paquete.hilos.modelos;

/**
 * The Class Panaderia.
 * Clase panaderia
 * un metodo crearia el pan y espera hasta que se consuma, el otro metodo lo consume y espera a que
 * haya terminado de hacerlo antes de volver a recoger otro
 */
public class Panaderia {
    
    /** The pan. */
    private String pan;
    
    /** The disponible. */
    private boolean disponible;

    /**
     * Hornear.
     *
     * @param masa the masa
     */
    public synchronized void hornear(String masa){
    	
//lo paramos hasta que el siguiente hilo lo recoja	
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true;
        notify();
    }

    /**
     * Consumir.
     *
     * @return the string
     */
    public synchronized String consumir(){
//espera hasta que haya terminado el metodo hornear    	
        while(!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume: " + this.pan);
        this.disponible = false;
        notify();
        return pan;
    }
}
