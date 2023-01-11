package com.jgr.fechas;

import java.time.LocalDate;
import java.time.Month;

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
public class JavaLocalDate {

	
	public static void main(String[] args) {
		
		var f1 = LocalDate.of(2020, 01, 15);
		//utilizando enumeracion para el mes
		var f2= LocalDate.of(2020, Month.APRIL, 15);
		
		//ahora
		var f3 = LocalDate.now();
		
		System.out.println("LocalDate f1->"+f1);
		System.out.println("LocalDate f2->"+f2);
		System.out.println("LocalDate f3->"+f3);

	}

}
