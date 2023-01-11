package com.jgr.fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * The Class JavaLocalDate.
 * LocalDate f3->2023-01-11
 * 
 * Desde Java 8
 * Manipulacion de fechas
 * no tienen constructor publico
 * se usan metodos estaticos(of)
 * los valores erroneos provocan excepcion 
 */
public class JavaLocalDateParse {
	public static void main(String[] args) {
		
		var f1 = LocalDate.parse("2020-01-01");
		System.out.println("LocalDate f1->"+f1);		
		var f2 = LocalDate.parse("01/01/2020",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("LocalDate Parse f2->"+f2);

	}

}
