package com.jgr.ejercicios.prog.funcional.servicio.lanzadora;

import java.util.ArrayList;
import java.util.List;

import com.jgr.ejercicios.prog.funcional.servicio.*;
import com.jgr.ejercicios.prog.funcional.servicio.clases.*;

import com.jgr.ejercicios.prog.funcional.servicio.util.GeneraDatos;

public class Lanzadora {
	
	
//https://www.youtube.com/watch?v=uuprkE2i7kU&list=PLK6RrRW5qdCMccvDnZb6-0d6uAIwbTQ1A&index=1	
/**
 * Instantiates a new lanzadora.
 */
public Lanzadora() {
	
		List<Integer> listaInt = new ArrayList<Integer>();		
		listaInt = (List<Integer>) GeneraDatos.getListaIntegerStreamRango(5, -1, 9999);
		
		/*
		//SACARIAMOS SOLO IMPARES 			
		SuperFunciones.filtrar(listaInt, new ValidaSoloImpares()).forEach(System.out::println);
		//SACARIAMOS SOLO PARES
		SuperFunciones.filtrar(listaInt, new ValidaSoloImpares()).forEach(System.out::println);
		
		//GENERAMOS UNA LISTA DE NUMEROS ALEATORIOS
		SuperFunciones.proveer(10, new GeneraAleatorio()).forEach(System.out::println);
		
		//GENERAMOS UNA LISTA DE NUMEROSNATURALES
		SuperFunciones.proveer(10, new GeneraNaturales()).forEach(System.out::println);

		//TRANSFORMAMOS EL NUMERO
		SuperFunciones.transformar(listaInt, new CalculaAlCuadrado()).forEach(System.out::println);
		SuperFunciones.transformar(listaInt, new CalculaAlCubo()).forEach(System.out::println);
		
		//ACTUA SOBRE LA LISTA Y LA CONSUME
		 //devuelve lista
		SuperFunciones.actuarSobreLista(listaInt, new ClaseConsumidora());		
		//este no devolveria nada
		SuperFunciones.consumirLista(listaInt, new ClaseConsumidora());
		
		
		//ACTUA SOBRE LISTA CON DOS PARAMETROS
		//esta clase multiplicaria un numero por otro
		System.out.println(
		SuperFunciones.reduciryAcumular(listaInt, 1,new FuncionBinariaMultiplicador())
				);
		//esta clase sumaria un numero a otro
		System.out.println(
		SuperFunciones.reduciryAcumular(listaInt, 0,new FuncionBinariaSumador())
				);
				
		*/
		
		
	}


	
	public static void main(String[] args) {
		
		new Lanzadora();

	}
	
	

}
