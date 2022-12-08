package com.jgr.fecha.y.calendario;import java.time.Duration;
import java.time.LocalDateTime;

/**
 * The Class CalculoEntreFechas.
 * 
 */
public class CalculoEntreFechas {

	
	public static void main(String[] args) {

        LocalDateTime fecha1 = LocalDateTime.now();
        // fecha1 = fecha1.withMonth(10);
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);
        Duration lapsus = Duration.between(fecha1, fecha2);
        System.out.println("lapsus = " + lapsus);
        System.out.println("Diferencia en minutos->"+ lapsus.toMinutes());
        System.out.println("sumamos 5 horas " + lapsus.plusHours(5));

	}

}
