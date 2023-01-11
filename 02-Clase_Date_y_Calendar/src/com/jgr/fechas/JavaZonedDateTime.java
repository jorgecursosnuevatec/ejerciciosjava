package com.jgr.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * The Class JavaZonedDateTime.
 * ZonedDateTime->2020-01-15T10:15:20+01:00[Europe/Madrid]
 * 
 * Desde Java 8
 * Manipulacion de fechas y horas en zona horaria 
 * 
 * en este aparece el offset +01:00[Europe/Madrid] que es la diferencia con el meridiano Greenwich 
 * 
 * no tienen constructor publico
 * se usan metodos estaticos(of)
 * los valores erroneos provocan excepcion
 * 
 */
public class JavaZonedDateTime {
	
	public static void main(String[] args) {
		
		//Lista de las zonas
				Set<String> zonas = ZoneId.getAvailableZoneIds();		
				zonas.stream()
				.sorted()
				.forEach(s->System.out.println("ZonaId->"+s + "\nLocalDateTime->"+LocalDateTime.now(ZoneId.of(s))));
				
				
		var dt1 = LocalDateTime.of(2020, 9,20,11,15,59);
		
		//a partir de un localdate y un localtime
		var f1 = LocalDate.of(2020, 01, 15);
		var h1 = LocalTime.of(10, 15,20);
		var dt2= LocalDateTime.of(f1,h1);
		
		//asignamos zona
		var z1 = ZoneId.of("Europe/Madrid");
		var zdt1= ZonedDateTime.of(dt2,z1);
		System.out.println("\nZona->"+z1);
		System.out.println("\nZonedDateTime->"+zdt1);
		


	}

}
