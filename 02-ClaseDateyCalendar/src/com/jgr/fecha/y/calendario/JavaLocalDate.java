package com.jgr.fecha.y.calendario;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class JavaLocalDate {

	public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Día: " + fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println("Mes: " + mes);
        System.out.println("Número del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Numero del día: " + diaSemana.getValue());
        System.out.println("Nombre del día: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Día del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());
        
        fechaActual = LocalDate.of(2020, 12, 25);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.of(2020, Month.NOVEMBER, 11);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);
        
        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);
        
        LocalDate mesAnterioMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterioMismoDia = " + mesAnterioMismoDia);

        DayOfWeek miercoles = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);

        int once = LocalDate.of(2020, 11, 11).getDayOfMonth();
        System.out.println(once);
//para saber si es bisiesto        
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);
        
        boolean esAntes = LocalDate.of(2020, 11, 11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("esAntes = " + esAntes);
        
        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues FechaString = " + esDespues);
        
        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
		
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 =LocalDate.of(2021, 7,22);
		LocalTime t1=LocalTime.of(10,23,50); //10:23:50
		LocalDateTime dt=LocalDateTime.of(2010,11,1,10,23,50); //2010-11-01T10:23:5
		System.out.println("resultadoComparacion->"+ld1.isAfter(ld2));
		
		System.out.println("suma 8 meses a la fecha"+ld1.plusMonths(8));
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha="20/09/2019";
		LocalDate date=LocalDate.parse(fecha, format);
		
		DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date2=LocalDate.of(2022,10,20);
		//System.out.println(date2.format(format2)); //20/10/202
		
		LocalDate f1=LocalDate.of(2019, 10, 30);
		LocalDate f2=LocalDate.of(2016, 01, 31);
		//comparación fechas
		if(f1.isBefore(f2)) {
			System.out.println("La fecha más antigua es: "+f1);
			System.out.println("La fecha más reciente es: "+f2);
		}else {
			System.out.println("La fecha más antigua es: "+f2);
			System.out.println("La fecha más reciente es: "+f1);
		}
		System.out.println(f1.plusMonths(8));
		System.out.println(f1.plusDays(200));
		System.out.println(f2.plusMonths(1));
		DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(f1.format(format1));
		String mf="11/11/2018";
		LocalDate nuevaFecha = LocalDate.parse(mf,format1);
		System.out.println("mf->"+nuevaFecha);
		
		Date d1 = new Date();
		Date d2 = new Date(Long.MAX_VALUE);
	
		System.out.println("d1->"+d1);
		System.out.println("d2->"+d2);		
		System.out.println("d1>d2->"+d1.compareTo(d2));
		System.out.println("d1.before(d2)->"+d1.before(d2));
		System.out.println("d1.after(d2)->"+d1.after(d2));
		LocalDate f11=LocalDate.of(2019, 10, 30);
		LocalDate f21=LocalDate.of(2016, 01, 31);
		//comparación fechas
		if(f11.isBefore(f21)) {
			System.out.println("La fecha más antigua es: "+f11);
			System.out.println("La fecha más reciente es: "+f21);
		}else {
			System.out.println("La fecha más antigua es: "+f21);
			System.out.println("La fecha más reciente es: "+f11);
		}
		System.out.println(f11.plusMonths(8));
		System.out.println(f11.plusDays(200));
		System.out.println(f21.plusMonths(1));
		DateTimeFormatter format11=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(f1.format(format1));
		String mf1="11/11/2018";
		LocalDate nuevaFecha1 = LocalDate.parse(mf1,format1);
		System.out.println("mf->"+nuevaFecha1);

		

	}

}
