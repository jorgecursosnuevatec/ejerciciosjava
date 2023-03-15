package com.jgr.fechas.horas.intervalos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * The Class JavaDuration.
 * 
 * intervalo de tiempo en horas,minutos,segundos
 * se opera con HORAS,MINUTOS, p.ej se sumaria 24 horas aunque pongamos un dia
 * a diferencia de Period, en el que SI se sumaria un dia 
 * se pueden sumar/restar duraciones a objetos de hora,pero NO a LocalDate
 * between tiene en cuenta la zona horaria
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
		
		//restamos entre dos LocalDateTime
		var ldt2 = ldt1.plus(Duration.ofHours(5)); 
		System.out.println("diferencia de horas localDateTime->" +
		Duration.between(ldt1, ldt2));
		
		//diferencia horas entre dos ZonedDateTime
		//Europa/Amsterdam es gmt+1->+01:00
		//America/New_York es gmt-5->-05:00
		//por eso la diferencia es 6 horas->PT6H
		
		var zdt1 = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Europe/Amsterdam"));
		var zdt2 = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("America/New_York"));
		System.out.println("zdt1->"+zdt1);
		System.out.println("zdt2->"+zdt2);		
		System.out.println("Diferencia de tiempo GMT->"+
		Duration.between(ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Europe/Amsterdam")), 
				ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("America/New_York"))));
		
		
		//La diferencia GMT entre Madrid y new York es 6 horas
		//al realizar el calculo lo tiene en cuenta
		//en el resultado sale 2 porque son las horas que he añadido a la z2/i2
		//si no lo hiciera,seria 0 porque se han creado EN EL MISMO MOMENTO
		
		Instant i1= Instant.now();
		Instant i2 = i1.plus(2,ChronoUnit.HOURS);
		ZonedDateTime z1 = i1.atZone(ZoneId.of("America/New_York"));
		System.out.println("America/New_York->"+z1);
		ZonedDateTime z2 = i2.atZone(ZoneId.of("Europe/Madrid"));
		System.out.println("Europe/Madrid   ->"+z2);
		
		System.out.println("Diferencia horas entre New York y America->"+
				Duration.between(z1, z2));
		
		

	}

}
