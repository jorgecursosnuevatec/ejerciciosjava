package com.jgr.paquete.hilos.atomic.cyclicbarrier;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * The Class AtomicClasesBoolean.
 * void set(boolean newValue)
 * boolean get()
 */
public class AtomicClasesBoolean {
	public static void main(String[] args) {

		
		AtomicBoolean atBool = new AtomicBoolean();
		atBool.set(false);
		
		System.out.println("obtiene->"+atBool.get());
		//si es false lo cambia a true
		System.out.println("compara y modifica->"+atBool.compareAndExchange(false, true));
		System.out.println("obtiene->"+atBool.get());
		//si es false lo deja a false¿??????????
		System.out.println("compara y modifica2->"+atBool.compareAndExchange(false, false));
		System.out.println("obtiene->"+atBool.get());

	}

}
