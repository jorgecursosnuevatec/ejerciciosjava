package com.jgr.ejercicios.opcional;

import com.jgr.ejercicios.opcional.modelo.Computador;
import com.jgr.ejercicios.opcional.repositorio.ComputadorRepositorio;
import com.jgr.ejercicios.opcional.repositorio.IRepositorio;


/**
 * The Class EjemploRepositorioMetodosOrElse.
 * Creamos un metodo que devuelva un valor por defecto en caso de que no lo encuentre
 * orElse llama al valorDefecto aunque lo encuentre 
 * orElseGet solo llama al valorDefecto si no lo encuentra 
 */
public class EjemploRepositorioMetodosOrElse {
	
	
	public static void main(String[] args) {

		IRepositorio<Computador> repositorio = new ComputadorRepositorio();

		// Computador defecto = new Computador("HP Omen", "LA0001");

		//el orElse llama al valorDefecto aunque lo encuentre 
		//Computador pc = repositorio.filtrar("Asus ROG").orElse(valorDefecto());
		Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());
		System.out.println(pc);

		//el orElseGet solo llama al valorDefecto si no lo encuentra 
		pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
		//System.out.println(pc);

	}

	/**
	 * Valor defecto.
	 */
	public static Computador valorDefecto() {
		System.out.println("Obteniendo valor por defecto!!!");
		return new Computador("HP Omen", "LA0001");
	}
}
