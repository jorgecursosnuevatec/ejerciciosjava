package com.jgr.fechas.horas.intervalos;

import java.time.Duration;
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
		System.out.println("ZonedDateTime->"+zdt1);
		
		//el cambio se produjo  a las 2 de la noche
		//la diferencia es 2 horas
		//al sumar/restar horas cambiamos de zona horaria y el between lo tiene en cuenta
		
		LocalDateTime ld1= LocalDateTime.of(2022,3,13,1,30,30);
		ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("America/New_York"));
		ZonedDateTime zd2 = zd1.plusHours(1);
		System.out.println("\nHora GMT zd2->"+zd2.getOffset());
		ZonedDateTime zd3 = zd1.minusHours(1);
		System.out.println("Hora GMT zd3->"+zd3.getOffset());
		System.out.println("Diferencia de horas->"+Duration.between(zd2, zd3));

	}

}
