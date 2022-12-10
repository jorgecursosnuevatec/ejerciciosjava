package com.jgr.paquete.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Usuario;


/**
 * The Class StreamReduce.
 * Se le pasan dos argumentos,el inicial que es lo que va a hacer y luego se le pasan dos parametros
 * a es el anterior y b el actual
 * Identity – an element that is the initial value of the reduction operation and the default result
 *  if the stream is empty,acumula iteraciones
 *	Accumulator – a function that takes two parameters: 
 *  a partial result of the reduction operation and the next element of the stream
 *	Combiner – a function used to combine the partial result of the reduction operation
 *  when the reduction is parallelized or when there's a mismatch between the types of the accumulator 
 *  arguments and the types of the accumulator implementation
 *  https://www.baeldung.com/java-stream-reduce
 *  
 *  https://www.geeksforgeeks.org/stream-reduce-java-examples/
 *  
 *  T reduce(T identity, BinaryOperator<T> accumulator);
 *  Where, identity is initial value 
 *  of type T and accumulator is a 
 *  function for combining two values.
 */
public class StreamReduce {

	
	public static void main(String[] args) {

		//une el string "resultado concatenacion " con lo que tiene en el array
        Stream<String> nombres =  Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();
        
        String resultado = nombres.reduce("resultado concatenación ",
        		(a, b) -> a+ " # " + b);
        System.out.println(resultado);
                
        //suma todos los numeros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        var result = numbers
          .stream()
          .reduce(0, (subtotal, element) -> subtotal + element);
        
        //une todas las ocurrencias del array
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        var resultado1 = letters
          .stream()
          .reduce("", (partialString, element) -> partialString + element);
        		  
        
        System.out.println("resultado->"+resultado1);
        
        List<Usuario> users = Arrays.asList(new Usuario("John","apellidoJohn"), new Usuario("Julie","apellidoJulie"));
        int computedAges = 
        users.stream()
        //tenemos un usuario de entrada y de salida un integer,tenemos que acumular combinando¿?
        .reduce(0, 
        		(partialAgeResult, user) -> partialAgeResult + user.getId(),
        		Integer::sum);
        
        List<Integer> gastos= new ArrayList<Integer>();
        gastos.add(100);
        gastos.add(200);
        gastos.add(300);
      
        gastos.stream().reduce((acumulador,numero)-> {
          return acumulador+numero;
        }).ifPresent(System.out::println);
        
        List<String> nombres2= new ArrayList<String>();
        
        
        nombres2.add("juan");
        nombres2.add("gema");
        nombres2.add("maria");
        
        
        nombres2.stream().reduce(String::concat).ifPresent(System.out::println);
        
        
	}

}
