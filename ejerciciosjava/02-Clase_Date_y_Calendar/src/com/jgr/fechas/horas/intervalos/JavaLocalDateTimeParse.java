package com.jgr.fechas.horas.intervalos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;


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
public class JavaLocalDateTimeParse {

	public static void main(String[] args) {
		
		var dt1 = LocalDateTime.parse("2023-01-11T20:00:32.959458100");
		
		System.out.println("LocalDateTime dt1->"+dt1);
		
			

	}

}
