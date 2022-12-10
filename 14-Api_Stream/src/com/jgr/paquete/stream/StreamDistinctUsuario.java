package com.jgr.paquete.stream;

import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Usuario;


/**
 * The Class StreamDistinctUsuario.
 * busca los que son distintos 
 */
public class StreamDistinctUsuario {
	public static void main(String[] args) {

		Stream<Usuario> nombres = Stream
				.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Pato Guzman",
						"Pato Guzman")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])).distinct();

		nombres.forEach(System.out::println);
	}
}
