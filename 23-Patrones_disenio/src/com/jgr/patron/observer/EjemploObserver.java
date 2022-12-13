package com.jgr.patron.observer;

import com.jgr.patron.observer.modelo.Corporacion;

/**
 * Es un patron que define la relacion de uno a muchos, cuando uno cambia su estado
 * se notifica a todos sus dependientes, es un patron de comportamiento.
 * 
 * 
 * 
 * 
 * 
 * https://es.wikipedia.org/wiki/Observer_(patr%C3%B3n_de_dise%C3%B1o)
 */

public class EjemploObserver {
    public static void main(String[] args) {
    	
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver( (observable, obj) -> {
            System.out.println("John: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Andrés: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Maria: " + observable );
        });
        google.modificaPrecio(2000);
    }
}
