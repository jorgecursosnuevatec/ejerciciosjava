package com.jgr.fechas;

import java.time.LocalTime;

/**
 * The Class JavaLocalTime.
 * LocalTime h1->10:15:20
 * 
 * Desde Java 8
 * Manipulacion de horas 
 * no tienen constructor publico
 * se usan metodos estaticos(of)
 * los valores erroneos provocan excepcion 
 */
public class JavaLocalTime {

	
	public static void main(String[] args) {
		
		var h1 = LocalTime.of(10, 15,20);
		
		System.out.println("LocalTime h1->"+h1);
		

		
	

	}

}
