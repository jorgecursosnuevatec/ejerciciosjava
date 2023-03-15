package com.jgr.paquete.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Usuario;

/**
 * The Class ListaToStream. convertimos una lista en un list string
 */
public class ListaToStream {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<>();
		lista.add(new Usuario("Andrés", "Guzmán"));
		lista.add(new Usuario("Luci", "Martínez"));
		lista.add(new Usuario("Pepe", "Fernández"));
		lista.add(new Usuario("Cata", "Pérez"));
		lista.add(new Usuario("Lalo", "Mena"));
		lista.add(new Usuario("Exequiel", "Doe"));
		lista.add(new Usuario("Bruce", "Lee"));
		lista.add(new Usuario("Bruce", "Willis"));

		Stream<String> nombres = lista.stream()// devolvemos un com.jgr.stream
				.map(u -> u.getNombre().toUpperCase()// de cada elemeto el nombre
						.concat(" ")// espacio en blanco
						.concat(u.getApellido().toUpperCase())) // apellido en mayusculas
				.flatMap(nombre -> {
					if (nombre.contains("bruce".toUpperCase())) {
						return Stream.of(nombre);
					}
					return Stream.empty();
				}).map(String::toLowerCase)
				.peek(System.out::println);

		//System.out.println(nombres.count());
		nombres.forEach(System.out::println);
/*
		Stream<String> nombres2 = lista.stream()// devolvemos un com.jgr.stream
				.filter(u -> u.getNombre().equalsIgnoreCase("Exequiel")).
				map(u -> u.getNombre().toUpperCase()// de cada elemento el nombre
						.concat("*")// espacio en blanco
						.concat(u.getApellido().toUpperCase())) // apellido en mayusculas
				.map(String::toUpperCase);

		List<String> lista2 = nombres2.collect(Collectors.toList());
		lista.forEach(System.out::println);
*/
	}
}
