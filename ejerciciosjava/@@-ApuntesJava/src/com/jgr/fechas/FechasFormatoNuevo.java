package com.jgr.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * The Class FechasFormatoNuevo.
 * en java.time
 * LocalDate-> fecha concreta
 * LocalTime->hora
 * LocalDateTime->fecha+hora
 */
public class FechasFormatoNuevo {
	public static void main(String[] args) {
		
		//fecha
		LocalDate f1 = LocalDate.now();
		System.out.println("LocalDate now->"+f1);		
		LocalDate f2 = LocalDate.of(0001, 01, 01);
		System.out.println("LocalDate.of->"+f2);
		
		//hora
		LocalTime t1 = LocalTime.now();
		System.out.println("LocalTime now->"+t1);
		LocalTime t2 = LocalTime.of(01, 01);
		System.out.println("LocalTimeofHHMM->"+t2);
		LocalTime t3 = LocalTime.of(01, 01,01);
		System.out.println("LocalTimeofHHMMSS->"+t3);
		
		//fecha+hora
		LocalDateTime f1t1 = LocalDateTime.now();
		System.out.println("LocalDateTime now->"+f1t1);
		LocalDateTime f2t2 = LocalDateTime.of(0001,01,01, 00,00,00);
		System.out.println("LocalDateTime of->"+f2t2);
	}

}
