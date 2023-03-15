package com.jgr.fecha.y.calendario;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


/**
 * The Class JavaLocalDateTime.
 * LocalDateTime. Para respresentar una combinación de fecha más hora:
 * Para parsear y formatear fechas, utilizamos la clase
java.time.format.DateTimeFormatter:

 */
public class JavaLocalDateTime {
	public static void main(String[] args) {
		
		//fecha+hora
		LocalDateTime f1t1 = LocalDateTime.now();
		System.out.println("LocalDateTime now->"+f1t1);
		LocalDateTime f2t2 = LocalDateTime.of(0001,01,01, 00,00,00);
		System.out.println("LocalDateTime of->"+f2t2);


        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);
        DateTimeFormatter dt =DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("fechaTiempoFormateada ->"+ fechaTiempo.format(dt));
       

        fechaTiempo = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("fechaTiempo Formateada año-mes-dia-hora-minuto-segundo= " + fechaTiempo);
        
        fechaTiempo = LocalDateTime.parse("2020-12-25T21:45:59.821339800");
        System.out.println("fechaTiempo desde un string con parse= " + fechaTiempo);

        LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1).plusHours(3);
        System.out.println("fechaTiempo2 sumando 1 dia 3 horas= " + fechaTiempo2);
        ///System.out.println("fechaTiempo = " + fechaTiempo);
        System.out.println("fechaTiempo3 quitando 5 horas= " + fechaTiempo.minusHours(5));
        
        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);
        
        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia: " + dia);

        int anio = fechaTiempo.getYear();
        System.out.println("anio = " + anio);
        
        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("formato1 = " + formato1);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String formato2 = fechaTiempo.format(df);
        System.out.println("formato2 yyyy/MM/dd hh:mm:ss a->" + formato2);
        

	}

}
