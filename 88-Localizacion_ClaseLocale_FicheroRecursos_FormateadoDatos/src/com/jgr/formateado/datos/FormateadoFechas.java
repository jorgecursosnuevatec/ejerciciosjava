package com.jgr.formateado.datos;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * The Class FormateadoFechas.
 * Para formatear fechas
 * 
 * constantes a usar para el formateo de fechas
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
 */
public class FormateadoFechas {
	public static void main(String[] args) {
		
		
		//CLASES ANTIGUAS en java.text
		//DateFormat es una clase abstracta,no se instancia con un new
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,Locale.US);
		System.out.println("formato EEUU->"+df.format(new Date()));
		df = DateFormat.getDateInstance(DateFormat.FULL,Locale.JAPAN);
		System.out.println("formato JAPON->"+df.format(new Date()));
		
		//CLASES NUEVAS de java.time.format
		LocalDate ld = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(ld));
		LocalDateTime ldt = LocalDateTime.now();
		dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("ISO->"+dtf.format(ldt));
		dtf = DateTimeFormatter.BASIC_ISO_DATE;
		String cadena = LocalDate.now().format(dtf);
		System.out.println("desde una cadena->"+cadena);
	}

}
