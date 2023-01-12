package com.jgr.fechas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * The Class JavaDuration.
 * 
 * intervalo de tiempo en horas,minutos,segundos
 * se pueden sumar/restar duraciones a objetos de hora,pero NO a LocalDate
 *
 */
public class JavaDuration {

	public static void main(String[] args) {
		
		//PT48H
		Duration d1=Duration.of(2, ChronoUnit.DAYS);
		System.out.println("Duracion dos dias->"+d1);		
		//PT33M20S
		Duration d2=Duration.of(2000, ChronoUnit.SECONDS);
		System.out.println("Duracion 2000 segundos->"+d2);
		//PT5H
		Duration d3 = Duration.ofHours(5);
		System.out.println("Duracion 5 horas->"+d3);
		
		//resto horas a fecha que tiene incluida la hora,a localdate no se puede si solo tiene fecha
		LocalDateTime ldt1= LocalDateTime.now();
		System.out.println("Ahora menos 5 horas->"+ldt1.minus(Duration.ofHours(5)));
		
		//diferencia entre dos zonas
		
		System.out.println("Diferencia de tiempo->"+
		Duration.between(ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Zulu")), 
				ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Europe/Madrid"))));

	}

}
