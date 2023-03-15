package com.jgr.fecha.y.calendario;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        
        Date fecha = new Date();
        System.out.println("fecha Date= " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fecha fechaStr= EEEE dd 'de' MMMM, yyyy->" + fechaStr);
        
        long j = 0;
        for(int i = 0; i < 1000000000; i++){
            j +=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        //System.out.println("fechaStr = " + fechaStr);
    }
}
