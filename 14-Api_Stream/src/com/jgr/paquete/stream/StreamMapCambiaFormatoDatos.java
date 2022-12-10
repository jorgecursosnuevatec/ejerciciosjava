package com.jgr.paquete.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Alumno;

/**
 * The Class StreamMapCambiaFormatoDatos.
 * Con el map a partir de un valor string lo podemos convertir en un Alumno
 */
public class StreamMapCambiaFormatoDatos {

	public static void main(String[] args) {

		/*		
		String[] nombresString =  {"Pato", "Paco", "Pepa", "Pepe"};
		List<String> listaNombres = Arrays.asList(nombresString);


		//lo convierto a un stream 
		Stream<Alumno> modificado = Stream.of("Pato", "Paco", "Pepa", "Pepe")
				//como parametro le paso el nombre que recupero del array
				.map(nombre->new Alumno(nombre,null, null))
				.peek(System.out::println)
				.map(al->{
					String nombre =al.getNombre().toLowerCase();
					al.setNombre(nombre);
					al.setNota(1);
					return al;
				});

		modificado.forEach(System.out::println);
		 */		
		
		//a partir de una lista ,lo divido en un array
		//como alumno tiene nombre y apellido ahora puedo usar cada parte del string recuperado en el constructor
		Stream<Alumno> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
				.map(nombre -> new Alumno(nombre.split(" ")[0], nombre.split(" ")[1], null))
				.peek(System.out::println)
				.map(usuario -> {
					String nombre = usuario.getNombre().toUpperCase();
					usuario.setNombre(nombre);
					String apellido = usuario.getApellidos().toLowerCase();
					usuario.setApellidos(apellido);
					return usuario;
				});

		List<Alumno> lista = nombres.collect(Collectors.toList());
		lista.forEach(System.out::println);




	}

}
