package com.jgr.paquete.stream;

import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Usuario;


/**
 * The Class StreamFilterCount.
 * cuenta las ocurrencias
 */
public class StreamFilterCount {

	public static void main(String[] args) {

		long count = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
//				.peek(System.out::println)
				.filter(u -> u.getId().equals(1) && u.getNombre().equalsIgnoreCase("pato"))
				.count();

		System.out.println(count);
		
		

        /*List<Usuario> lista = Arrays.asList(new Usuario("Pato", "Guzman"),
                new Usuario("Paco", "Gonzalez"),
                new Usuario("Pepa", "Gutierrez"),
                new Usuario("Pepe", "Mena"),
                new Usuario("Pepe", "Garcia"));

        boolean resultado = false;
        for(Usuario u: lista){
            if(u.getId().equals(3)){
                resultado = true;
                break;
            }
        }

        System.out.println(resultado);

         */
    }
}
