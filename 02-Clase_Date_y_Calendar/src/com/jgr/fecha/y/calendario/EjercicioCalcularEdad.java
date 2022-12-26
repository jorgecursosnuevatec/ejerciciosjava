package com.jgr.fecha.y.calendario;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EjercicioCalcularEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(),
        		periodo.getMonths(), periodo.getDays());
      
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("\nIngrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr2 = scanner.next();

        LocalDate fechaNacimiento2 = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual2 = LocalDate.now();

        long anios = ChronoUnit.YEARS.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años", anios);
        
        
        
        
    }
}