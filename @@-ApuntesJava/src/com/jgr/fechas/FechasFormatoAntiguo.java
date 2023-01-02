package com.jgr.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * The Class FechasFormatoAntiguo.
 * 
 * java.util.Date->fecha y hora concreta,deprecated
 * java.util.Calendar->para trabajar con componentes de la fecha,hora,año....
 * java.sql.Date y java.sql.Timestamp->para bbdd
 * java.text.SimpleDateFormat->para formatear/parse fechas
 */
public class FechasFormatoAntiguo {
	public static void main(String[] args) {
		
		//fecha y hora actual
		Date date = new Date();
		System.out.println("fecha y hora actual Date->"+date);
		
		//fecha y hora concreta
		Calendar cal = Calendar.getInstance();		
		System.out.println("Calendar->"+cal);
		
		//convertir desde cadena de caracteres a fecha
		SimpleDateFormat formateo = new SimpleDateFormat("yyyy/MM/dd");
		String fecha ="0001/01/01";
		Date fechaFormat = null;
		try {
			fechaFormat =  formateo.parse(fecha);
		} catch (ParseException e) {
			
			e.printStackTrace();
		} finally {
			System.out.println("Fecha Date formateada->"+fechaFormat);
		}
		
		


	}

}
