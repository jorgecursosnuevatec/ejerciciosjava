package com.jgr.paquete.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Usuario;


/**
 * The Class StreamFilterFindFirst.
 * Busca los que cumplen la condicion
 * 
 */
public class StreamFilterFindFirst {
	public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);


          Optional<Usuario> usuario = nombres.findAny();
          
          List<Usuario> usuarios =	Stream
                  .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                          "Pepe Garcia")
                  .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                  .filter(u -> u.getNombre().equals("Pepe"))
                  .peek(System.out::println).collect(Collectors.toList())
                  ;
          
          
         Usuario otroUsuario =	Stream
        		  .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                          "Pepe Garcia")
                  .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                  .peek(System.out::println)
                  .filter(u -> u.getId().equals(4))
                  .findFirst()//EL PRIMERO QUE CUMPLA LA CONDICION
                  //Y SI NO EXISTE NINGUNO CREA ESTE
                  .orElseGet(() -> new Usuario("John", "Doe"));

          boolean existe=usuarios
        		  .stream()
        		  .anyMatch(u->u.getApellido().equalsIgnoreCase("gutierrez"));
        
        System.out.println("eXISTE->"+existe);
        // System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());
        // System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")).getNombre());
        if(usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontró el objeto!");
        }
        //nombres.forEach(System.out::println);

    }
}
