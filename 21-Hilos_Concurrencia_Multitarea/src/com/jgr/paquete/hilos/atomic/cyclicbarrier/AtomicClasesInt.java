package com.jgr.paquete.hilos.atomic.cyclicbarrier;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The Class AtomicClasesInt.
 * para operar sobre variables simples en entorno multitarea,como si tuviera un bloque sincronizado
 * del paquete java.util.concurrent.atomic
 * AtomicBoolean
 * AtomicLong
 * AtomicInteger
 * int incrementAndGet()
 * int decrementAndGet()
 * int addAndGet(int delta),añade el valor y devuelve el valor
 * int get() devuelve el valor
 */
public class AtomicClasesInt {
	public static void main(String[] args) {

		
		AtomicInteger atint = new AtomicInteger();
		System.out.println("incrementa->"+atint.incrementAndGet());
		System.out.println("suma->"+atint.addAndGet(25));
		System.out.println("obtiene y suma->"+atint.getAndAdd(25));
		System.out.println("obtiene->"+atint.get());
		
		

	}

}
