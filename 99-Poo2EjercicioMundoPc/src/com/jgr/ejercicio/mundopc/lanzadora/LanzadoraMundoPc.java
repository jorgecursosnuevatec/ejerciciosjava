package com.jgr.ejercicio.mundopc.lanzadora;

import com.jgr.ejercicio.mundopc.modelos.Computadora;
import com.jgr.ejercicio.mundopc.modelos.Monitor;
import com.jgr.ejercicio.mundopc.modelos.Orden;
import com.jgr.ejercicio.mundopc.modelos.Raton;
import com.jgr.ejercicio.mundopc.modelos.Teclado;

public class LanzadoraMundoPc {
	   public static void main(String[] args) {
	        Monitor monitorHP = new Monitor("HP", 13);
	        Teclado tecladoHP = new Teclado("bluetooth", "HP");
	        Raton ratonHP = new Raton("bluetooth", "HP");
	        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP );
	        
	        Monitor monitorGamer = new Monitor("Gamer", 34);
	        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
	        Raton ratonGamer = new Raton("bluetooth", "Gamer");
	        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonGamer );
	        
	        Orden orden1 = new Orden();
	        orden1.agregarComputadora(computadoraHP);
	        orden1.agregarComputadora(computadoraGamer);
	        
	        
	        
	        System.out.println("Busco pc"+orden1.mostrarOrdenPedido(computadoraGamer));
	        System.out.println("Busco pc"+orden1.mostrarOrdenPedido(computadoraHP));
	    }
}