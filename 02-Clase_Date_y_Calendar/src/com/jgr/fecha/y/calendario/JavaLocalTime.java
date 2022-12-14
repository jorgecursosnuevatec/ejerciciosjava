package com.jgr.fecha.y.calendario;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaLocalTime {
	  public static void main(String[] args) {

	        LocalTime ahora = LocalTime.now();
	        System.out.println(ahora);
	        System.out.println("Hora: " + ahora.getHour());
	        System.out.println("Minutos: " + ahora.getMinute());
	        System.out.println("Seg.: " + ahora.getSecond());
	        //creado a partir de un localtime.of y de un parse
	        LocalTime seisConTreinta = LocalTime.of(6, 30, 59);
	        System.out.println("hora a partir de string->"+seisConTreinta);
	        seisConTreinta = LocalTime.parse("18:30:45");
	        System.out.println("seisConTreinta desde parse->" + seisConTreinta);
	        
	        
	        LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
	        System.out.println("sieteConTreinta creado = " + sieteConTreinta);
	        boolean esAnterior = LocalTime.of(6, 30, 59).isBefore(LocalTime.parse("07:30"));
	        System.out.println("esAnterior = " + esAnterior);

	        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
	        String ahoraFormateado = seisConTreinta.format(df);
	        //System.out.println(ahoraFormateado);	        
	        ahoraFormateado = df.format(ahora);
	        System.out.println("ahoraFormateado = " + ahoraFormateado);
	        
	        LocalTime max = LocalTime.MAX;
	        LocalTime min = LocalTime.MIN;

	        System.out.println("max = " + max);
	        System.out.println("min = " + min);

	    }
	}
