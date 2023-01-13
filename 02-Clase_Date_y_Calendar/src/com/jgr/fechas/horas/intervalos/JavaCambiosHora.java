package com.jgr.fechas.horas.intervalos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * The Class JavaCambiosHora.
 * los tiene en cuenta en la manipulacion de ZonedDateTime
 * 
 */
public class JavaCambiosHora {
	public static void main(String[] args) {
		
		//el 30 a las 3 am fue cuando se cambio la hora
		//por eso zd1->2022-10-30T02:30:30+02:00[Europe/Madrid]
		//zd2->2022-10-30T02:30:30+02:00[Europe/Madrid]
		//tienen la misma hora por eso, aunque zd1 seria GMT+1 y zd2 seria GMT2
		//
		//en octubre ese dia zd1 seria GMT+2 y zd2 seria GMT+1
		//
		LocalDateTime ld1 = LocalDateTime.of(2022,10,30,2,30,30);
		ZonedDateTime zd1=ZonedDateTime.of(ld1, ZoneId.of("Europe/Madrid"));
		ZonedDateTime zd2= zd1.plus(1,ChronoUnit.HOURS);
		
		System.out.println("zd1->"+zd1);
		System.out.println("zd2->"+zd2);
		System.out.println("Diferencia horas->"+Duration.between(zd1, zd2));
		//getOffset devuelve la diferencia con GMT
		System.out.println("zd1->"+zd1.getOffset());
		System.out.println("zd2->"+zd2.getOffset());
	}

}
