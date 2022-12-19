package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.jgr.prog.funcional.y.lambda.models.Persona;

/**
 * The Class InterfazFunction.
 * interfaz function <T,R>,recibe un argumento y devuelve un objeto Resultado R R apply(T t)
 * metodo apply que a partir de un objeto realiza una operacion y devuelve un resultado R apply(T t)
 * para transformar datos,como map de Stream
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html
 * con dos parametros es BiFunction
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html
 */
public class InterfazFunction {

	public static void main(String[] args) {

		Persona array []= {
				new Persona("Nombre3",66),new Persona("Nombre2",67),
				new Persona("Nombre1",66),new Persona("Nombre3",67)
		};

		List<Persona> lista = new ArrayList<>(Arrays.asList(array));
		List<String> modificado= (lista.stream()//lo convierto a stream para trabajar con el

				//este es el function, de la persona obtiene el nombre
				.map(per->per.getNombre())) //de cada persona obtengo el nombre
				.collect(Collectors.toList());

		List<Persona> modificado2= (lista.stream()//lo convierto a stream para trabajar con el

				//este es el function, de la persona obtiene el nombre
				.map(per->{
					Persona personita= new Persona();					
					personita.setNombre(per.getNombre()+"modificado".toLowerCase());
					personita.setEdad(per.getEdad()*55);
					return personita;
				}).collect(Collectors.toList()));

		modificado.forEach(System.out::println);
		modificado2.forEach(System.out::println);

		//el primer String es el que recibe y el segundo el que devuelve 
		Function<String, String> f1 = param -> "Hola que tal! " + param;
		String resultado = f1.apply("andres");
		System.out.println(resultado);

		Function<String, String> f2 = String::toUpperCase;
		System.out.println("resultado f2->"+ f2.apply("andres"));
		
		//convertimos un String en integer
		Function<String,Integer> convierteInt=(String a)-> Integer.getInteger(a);		
		System.out.println("valor numero->"+ convierteInt.apply("4"));
		
		
		//recibe dos String y devuelve otro string
		BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
		String r2 = f3.apply("andres", "jose");
		System.out.println("resultado r2->"+ r2);

		//recibe dos String y devuelve un numero
		BiFunction<String, String, Integer> f4 = String::compareTo;// (a, b) -> a.compareTo(b);
		System.out.println("resultado f4->"+ f4.apply("andres", "andres"));

		BiFunction<String, String, String> f5 = String::concat;// (a, b) -> a.concat(b);
		System.out.println("resultado f5->"+ f5.apply("andres", "jose"));

	}

}
