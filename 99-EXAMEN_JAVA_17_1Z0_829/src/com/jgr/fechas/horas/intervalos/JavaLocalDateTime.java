package com.jgr.fechas.horas.intervalos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;



/**
 * The Class JavaLocalDateTime.
 * LocalDateTime ahora->2023-01-11T20:00:32.959458100
 * 
 * Desde Java 8
 * Manipulacion de fechas mas horas 
 * no tienen constructor publico
 * se usan metodos estaticos(of)
 * los valores erroneos provocan excepcion 
 */
public class JavaLocalDateTime {

	public static void main(String[] args) {
		
		var dt1 = LocalDateTime.of(2020, 9,20,11,15,59);
		
		//a partir de un localdate y un localtime
		var f1 = LocalDate.of(2020, 01, 15);
		var h1 = LocalTime.of(10, 15,20);		
		var dt2= LocalDateTime.of(f1,h1);
		
		//ahora
		var dt3= LocalDateTime.now();
		System.out.println("LocalDateTime dt1->"+dt1);
		System.out.println("LocalDateTime dt2->"+dt2);
		System.out.println("\nLocalDateTime ahora->"+dt3);
		ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
		System.out.println("\nZonedDateTime ahora con la diferencia con Greenwich->"+zdt1);
		

	}

}
