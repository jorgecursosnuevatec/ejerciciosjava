package com.jgr.paquete.stream;
import java.util.stream.Stream;
import com.jgr.paquete.stream.modelo.Usuario;

/**
 * The Class StreamFlatMap. parecido al map, devuelve otro stream, si lo hacemos
 * con varios se unen en una unica corriente
 */
public class StreamFlatMap {

	public static void main(String[] args) {

		Stream<Usuario> nombres = Stream
				.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])).flatMap(u -> {
					if (u.getNombre().equalsIgnoreCase("Pepe")) {
						return Stream.of(u);// devuelve un stream con este usuario
					}
					return Stream.empty();// si no lo es devuelve un stream vacio
				}).peek(System.out::println);

		// nombres.forEach(System.out::println);
		System.out.println(nombres.count());

	}

}
