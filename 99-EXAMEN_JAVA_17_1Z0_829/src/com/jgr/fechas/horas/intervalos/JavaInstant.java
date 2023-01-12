package com.jgr.fechas.horas.intervalos;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * EN 80-Examen_Java_17_1Z0_829
 * 
 * The Class JavaInstant.
 * Instante->2023-01-11T18:59:48.426148100Z
 * es un momento concreto en la zona GMT
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
		
		//a partir de milisegundos
		var it2 = Instant.ofEpochMilli(2_000_000_000);
		System.out.println("Instante EpochMilli->"+it2);
		//a partir de segundos		
		it2 = Instant.ofEpochSecond(2_111_111_999);
		System.out.println("Instante EpochSecond->"+it2);
		
		//Creado a partir de un ZonedDateTime
		var z1 = ZoneId.of("US/Indiana-Starke");
		var ldt1 = LocalDateTime.now();
		var zdt1 = ZonedDateTime.of(ldt1, z1);
		System.out.println("\nz1->"+z1);
		System.out.println("LocalDateTime ldt1->"+ldt1);
		System.out.println("ZonedDateTime zdt1->"+zdt1);//este son 6 horas menos que greenwich
		System.out.println("Instant->"+zdt1.toInstant());
		

	}

}
