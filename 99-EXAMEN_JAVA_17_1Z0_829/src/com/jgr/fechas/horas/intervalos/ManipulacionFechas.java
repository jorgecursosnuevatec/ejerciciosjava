package com.jgr.fechas.horas.intervalos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * The Class ManipulacionFechas.
 * 
 * NO SE MODIFICA EL VALOR DE LA VARIABLE,los objetos son inmutables
 */
public class ManipulacionFechas {
	public static void main(String[] args) {
		
		var f1 = LocalDate.now();		
		//calculamos 1 dia menos
		System.out.println("1 dia menos->"+f1.minusDays(1));
		System.out.println("NO HA CAMBIADO->"+f1);
		
		//le sumo 5 horas y 1 siglo
		var lt1 = LocalDateTime.now();
		lt1 = lt1.plusHours(5);
		lt1 = lt1.plus(1,ChronoUnit.CENTURIES);
		System.out.println("lt1 MODIFICADO->"+lt1);
		
	}

}
