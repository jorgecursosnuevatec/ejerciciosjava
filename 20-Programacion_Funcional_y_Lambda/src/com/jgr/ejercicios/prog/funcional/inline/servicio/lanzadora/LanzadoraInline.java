package com.jgr.ejercicios.prog.funcional.inline.servicio.lanzadora;

import java.util.ArrayList;
import java.util.List;

import com.jgr.ejercicios.prog.funcional.inline.servicio.SuperFuncionesInline;
import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.FuncionBinariaInline;
import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.FuncionInline;
import com.jgr.ejercicios.prog.funcional.servicio.util.GeneraDatos;




public class LanzadoraInline {

	
//https://www.youtube.com/watch?v=wenIr54-UEc&list=PLK6RrRW5qdCMccvDnZb6-0d6uAIwbTQ1A&index=8	
	
/**
 * Instantiates a new lanzadora.
 * USANDO CLASES ANONIMAS INLINE
 * en vez de instanciar un objeto del tipo calcular,funcionbinaria...
 * lo que hago es pasarle directamente como parametro el metodo que quiro que use
 * Aqui no harian falta las clases,porque directametnte le paso como parametros la interfaz que es generica
 * porque solo tiene la declaracion del metodo, y en vez de pasarle la clase implemento el metodo que estaba 
 * dentro de cada una de las clases
 * 
 */
public LanzadoraInline() {
	
		List<Integer> listaInt = new ArrayList<Integer>();
		GeneraDatos.getListaIntegerStreamRango(5, -1, 9999).
				forEach(listaInt::add);;
		
		/*
		//ahora le paso el Predicate, pero en vez de que llame a la interfaz lo que hago es implementarla 
		//directamente como parametro de entrada
		SuperFuncionesInline.proveer(5, new ProveedorInline() {
			@Override
			public Integer obtener() {			
				return new Random().nextInt(1000000);
			}		
		
	}).forEach(System.out::println);
		
	
	
	
	// "creo" la instancia de la interfaz para pasarle como parametro 
	//lo que tiene que hacer,que en este caso es que haga el sysout			
	SuperFuncionesInline.actuarSobreLista(listaInt, new ConsumidorInline() {
		@Override
		public void aceptar(Integer valor) {
			System.out.println("\nEn ClaseConsumidora->"+valor);
			
		}
	});	
	
	
	//esta seria otra manera de hacerlo,como es una interfaz 
	//puedo pasarla como parametro porque realmente lo que contiene es una ClaseConsumidora
	ConsumidorInline cI= new ClaseConsumidoraInline();	
	SuperFuncionesInline.actuarSobreLista(listaInt, new ConsumidorInline() {
		@Override
		public void aceptar(Integer valor) {
			System.out.println("\nEn ClaseConsumidora->"+valor);			
		}
	});	
				
	
		SuperFuncionesInline.filtrar(listaInt, new PredicadoInline() {
			@Override
			public boolean test(Integer valor) {

				return valor % 2 != 0;
			}
		}).forEach(System.out::println);
	
		
	   //sumamos los numeros, creamos lo que tiene que hacer			
		SuperFuncionesInline.transformar(listaInt, new FuncionInline() {
			@Override
			public Integer aplicar(Integer valor) {
				
				return valor*valor;
			}
			
		});	
		
			*/
				
		SuperFuncionesInline.reduciryAcumular(listaInt, 5, new FuncionBinariaInline() {
			@Override
			public Integer aplicar(Integer acumulador, Integer valor) {
				return acumulador + valor;
			}
		});
		
		
				
}

	
	public static void main(String[] args) {
		
		new LanzadoraInline();

	}
	
	

}
