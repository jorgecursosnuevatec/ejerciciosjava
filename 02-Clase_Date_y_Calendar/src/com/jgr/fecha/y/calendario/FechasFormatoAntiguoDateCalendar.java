package com.jgr.fecha.y.calendario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * The Class FechasFormatoAntiguoDateCalendar.
 * 
 * java.util.Date->fecha y hora concreta,deprecated 
 * java.util.Calendar->para trabajar con componentes de la fecha,hora,año.... 
 * java.sql.Date y java.sql.Timestamp->para bbdd 
 * java.text.SimpleDateFormat->para formatear/parse fechas
 */
public class FechasFormatoAntiguoDateCalendar {
	public static void main(String[] args) {

		// fecha y hora actual
		Date date = new Date();
		System.out.println("fecha y hora actual Date->" + date);

		// fecha y hora concreta
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar->" + cal);

		// convertir desde cadena de caracteres a fecha
		SimpleDateFormat formateo = new SimpleDateFormat("yyyy/MM/dd");
		String fecha = "0001/01/01";
		Date fechaFormat = null;
		try {
			fechaFormat = formateo.parse(fecha);
		} catch (ParseException e) {

			e.printStackTrace();
		} finally {
			System.out.println("Fecha Date formateada->" + fechaFormat);
		}
		
		
		
		
		//comparar fechas
		Date d1=new Date();
		Date d2=new Date(3345022223495L);
		//comprobaciones fechas
		if(d1.before(d2)) {
			System.out.println("Fecha más antigua: "+d1);
			System.out.println("Fecha más moderna: "+d2);
		}else {
			System.out.println("Fecha más antigua: "+d2);
			System.out.println("Fecha más moderna: "+d1);
		}
		

	}

}
