package com.jgr.recursividad;

import java.util.stream.Stream;

import com.jgr.recursividad.modelo.Componente;


/**
 * The Class LanzadoraComponentes.
 * ES UNA ESTRUCTURA DE ARBOL,RECURSIVA EN LA QUE IMPORTA EL ORDEN EN QUE SE AÑADE
 */
public class LanzadoraComponentes {
	  
  	
  	public static void main(String[] args) {
  		
  		//EN ORDEN JERARQUICO,SE AÑADE SEGUN EL ORDEN DESEADO
	        Componente pc = new Componente("Gabinete PC ATX");
	        Componente poder = new Componente("Fuente Poder 700w");
	        Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
	        Componente cpu = new Componente("Cpu AMD Ryzen 5 2800");
	        Componente ventilador = new Componente("Ventilador CPU");
	        Componente disipador = new Componente("Disipador");
	        Componente tv =  new Componente("Nvidia RTX 3080 8GB");
	        Componente gpu = new Componente("Nvidia GPU RTX");
	        Componente gpuRam = new Componente("4GB Ram");
	        Componente gpuRam2 = new Componente("4GB Ram");
	        Componente gpuVentiladores = new Componente("Ventiladores");
	        Componente ram = new Componente("Memoria Ram 32GB");
	        Componente ssd = new Componente("Disco SSD 2T");


	        cpu.addComponente(ventilador)
	                .addComponente(disipador);
	        tv.addComponente(gpu)
	                .addComponente(gpuRam)
	                .addComponente(gpuRam2)
	                .addComponente(gpuVentiladores);
	        placaMadre.addComponente(cpu)
	                .addComponente(tv)
	                .addComponente(ram)
	                .addComponente(ssd);
	        pc.addComponente(poder)
	                .addComponente(placaMadre)
	                .addComponente(new Componente("Teclado"))
	                .addComponente(new Componente("Mouse"));

//	        metodoRecursivoJava8(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));
	        metodoRecursivo(pc, 0);
	    }

	    /**
    	 * Metodo recursivo java 8.
    	 *
    	 * @param c the c
    	 * @param nivel the nivel
    	 * @return the stream
    	 */
    	public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel){
	        c.setNivel(nivel);
	        return Stream.concat(Stream.of(c),
	                c.getHijos().stream().flatMap(hijo -> metodoRecursivoJava8(hijo, nivel + 1)));

	    }

	    /**
    	 * Metodo recursivo.
    	 *
    	 * @param c the c
    	 * @param nivel the nivel
    	 */
    	public static void metodoRecursivo(Componente c, int nivel){
	        System.out.println("\t".repeat(nivel) + c.getNombre());
	        if(c.tieneHijos()){
	            for(Componente hijo: c.getHijos()){
	                metodoRecursivo(hijo, nivel + 1);
	            }
	        }
	    }
	}
