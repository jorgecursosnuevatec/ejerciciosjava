package com.jgr.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * The Class JavaPeriod.
 * representa un periodo medido en años,meses,dias 
 * 
 * P2Y50M100D->2 años,50 meses,100 dias
 * P10D->10 dias
 * P5M->5 meses
 * P7D->una semana(7 dias)
 * P4Y->4 años
 * 
 * Se pueden sumar/restar periodos de tiempo a objetos fecha,pero NO a LocalTime
 * 
 * Con el metodo between() se puede obtener el periodo de tiempa entre dos fechas en formato Period
 * SOLO con LocalDate
 * 
 */
public class JavaPeriod {
	public static void main(String[] args) {
		
		Period p1 = Period.of(2,50,100);
		System.out.println("p1 de 2 años 50 meses 100 dias->"+p1);
		p1 = Period.ofDays(10);
		System.out.println("p1 de 10 dias->"+p1);
		Period p2 = Period.ofMonths(5);
		System.out.println("p1 de 5 meses->"+p2);
		Period p3 = Period.ofWeeks(1);
		System.out.println("p1 de 1 semana->"+p3);
		Period p4= Period.ofYears(4);
		System.out.println("p1 de 4 años->"+p4);
		
		System.out.println("\nSumo 4 años y 10 dias->"+p4.plus(p1));		
		System.out.println("Calcula los meses de dos años->"+p4.toTotalMonths());
		
		//restar periodos de tiempo->2022-08-12
		var f1 = LocalDate.now();
		Period pe1 = Period.ofMonths(5);
		System.out.println("\nHoy menos 5 meses->"+f1.minus(pe1));
		
		//intervalo de tiempo entre dos fechas
		//tienen que estar en formato LocalDate->P52Y2M18D
		var ldt1 = LocalDateTime.now();
		var ldt2 = LocalDateTime.of(1970, 10,25,00,00,00);
		System.out.println("Periodo de tiempo entre dos fechas->"+ 
		Period.between(ldt2.toLocalDate(),ldt1.toLocalDate()));

	}

}
