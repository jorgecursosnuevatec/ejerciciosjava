package com.jgr.lambda.simples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.jgr.lambda.simples.interfaz.modelo.GeneraListaNumeros;
import com.jgr.lambda.simples.interfaz.modelo.ImplementaConsumer;

/**
 * The Class LanzadoraConsumer.
 * 
 * Dispone del método abstracto accept, que realiza algún tipo de procesamiento con el objeto recibido 
 * NO DEVUELVE NADA
 *void accept(T t) 
 * 
 * 1->recibe lista y los imprime
 * 2->recibe lista y los guarda en fichero
 * 
 */
public class LanzadoraConsumer {
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		new GeneraListaNumeros();
		numeros = GeneraListaNumeros.getLista();
				
		//creo la clase que es la que implementa el metodo
		ImplementaConsumer iConsumer = new ImplementaConsumer();
		
		/*
		//defino que es lo que quiero que haga
		//esta variable llamada formula es la que voy a pasar como parametro
		//al metodo procesaLista que recibe una lista de numeros y esta funcion lambda
		//llamada formula
		Consumer<Integer> formula= (a)->System.out.println(a);			
		iConsumer.procesaLista(numeros, formula);
		*/
		
		
		System.out.println("\n Saca los numeros pares");
		//recibe una lista e imprime los pares		
		
		//sacamos los pares
		iConsumer.procesaListaConCriterio(numeros,
				(a)->System.out.println(a),//esta seria la funcion Consumer<Integer>
				x->x>0);//este seria la funcion Consumer<Integer>
		
		
		System.out.println("\n Saca los numeros positivos");
		//sacamos los positivos
		iConsumer.procesaListaConCriterio(numeros,
				a->System.out.println(a),//lo imprime por pantalla
				x->x>0);
		
		
		System.out.println("\n Saca los primos de 5");
		//sacamos los primos de 5
		iConsumer.procesaListaConCriterio(numeros,
				a->System.out.println(a),//lo imprime por pantalla
				x->x%5==0);
		
		
		//guarda los positivos en fichero
		
		String ruta = "./ficheroSalida.txt";
		iConsumer.procesaListaConCriterio(numeros, //lista de numeros
				//escribe en un fichero
				x->{
					try(FileOutputStream fos = new FileOutputStream(ruta,true);						
						PrintStream out = new PrintStream(fos);) {
						out.println(x);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		
		//solo los pares
				,x->x>0);
	
		
		Consumer<String> cr = (String a)->System.out.println(a);			
		String agradece = "Muuuchas gracias,Elsa";
		cr.accept(agradece);
		
		
	}

}
