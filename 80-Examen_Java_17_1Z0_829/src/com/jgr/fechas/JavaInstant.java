package com.jgr.fechas;

import java.time.Instant;

/**
 * EN 80-Examen_Java_17_1Z0_829
 * 
 * The Class JavaInstant.
 * Instante->2023-01-11T18:59:48.426148100Z
 * 
 * Desde Java 8
 * Instante de tiempo concreto 
 * no tienen constructor publico
 * se usan metodos estaticos(of)
 * los valores erroneos provocan excepcion 
 */
public class JavaInstant {
	public static void main(String[] args) {
		
		var it1 = Instant.now();
		
		System.out.println("Instante->"+it1);

	}

}
