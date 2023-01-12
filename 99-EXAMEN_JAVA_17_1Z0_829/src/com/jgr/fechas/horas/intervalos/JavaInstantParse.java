package com.jgr.fechas.horas.intervalos;

import java.time.Instant;

/**
 * The Class JavaInstant.
 * Instante->2023-01-11T18:59:48.426148100Z
 * 
 * Desde Java 8
 * Instante de tiempo concreto 
 * no tienen constructor publico
 * se usan metodos estaticos(of)
 * los valores erroneos provocan excepcion 
 */
public class JavaInstantParse {
	public static void main(String[] args) {
		
		var it1 = Instant.parse("2023-01-11T18:59:48.426148100Z");		
		System.out.println("Instante->"+it1);

	}

}
