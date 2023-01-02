package com.jgr.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * The Class FechasFormatoNuevoParse.
 * java.time.format.DateTimeFormatter
 * DateTimeFormatter 
 */
public class FechasFormatoNuevoParse {
	
	
	public static void main(String[] args) {
		
		
		//fecha a partir de una cadena
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = "01/01/0001";
		System.out.println("A partir de una cadena->"+LocalDate.parse(fecha,format));
		
		//formateamos fecha
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yy/MM/dd");
		LocalDate date = LocalDate.now();		
		System.out.println("A partir de una LocalDate->"+date.format(format2));
	
	}

}
