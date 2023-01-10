package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.AlumnoComparable;
import com.jgr.paquete.stream.modelo.Ciudad;
import com.jgr.paquete.stream.modelo.Empleado;
import com.jgr.paquete.stream.modelo.Persona;

/**
 * The Class StreamFinalCollection.
 * reducimos a coleccion List,Map
 * Collectors	
 *	Implementations of Collector that implement various useful reduction operations, 
 *  such as accumulating elements into collections,summarizing elements according to various criteria, etc.
 */
public class StreamFinalCollection {

	public static void main(String[] args) {
		
		//elimino duplicados y lo convierto a una lista
		Integer [][] numeritos = {{2,11,7},{2,11,7},{4,1,9,6}};
		List<Integer> salida = Stream.of(numeritos).//lo convierto a stream
				flatMap(a->Arrays.stream(a)).//lo aplano a array de 1 dimension
				distinct().//dejo los no repetidos
				sorted().//ordeno
				peek(System.out::println).//saco datos por pantalla
				collect(Collectors.toList());//lo convierto a lista


		//usamos el dni como clave y el nombre como valor
		Map<Integer,String> lista = Stream.of(new Persona("Persona1",12345),
				new Persona("Persona2",23456)).
				//en cada parametro tengo que usar la funcion -> para obtener el parametro
				collect(Collectors.toMap(p->p.getDni(),p->p.getNombre()));		
		System.out.println(Arrays.asList(lista));
		System.out.println(Collections.singletonList(lista));

		//agrupamos por nota
		Map<Integer,List<AlumnoComparable>> agrupado = Stream.of(
				new AlumnoComparable("Nombre1", "Apellido1", 15),
				new AlumnoComparable("Nombre0", "Apellido0", 10),
				new AlumnoComparable("Nombre2", "Apellido2", 15),
				new AlumnoComparable("Nombre3", "Apellido3", 16),
				new AlumnoComparable("Nombre4", "Apellido4", 16))
				.collect(Collectors.groupingBy(p->p.getNota())); //agrupamos por nota
		agrupado.forEach((k,v)->System.out.println(v));


		//agrupamos por departamento y hallamos la media del salario
		Stream<Empleado> empleados =Stream.of(
				new Empleado("Luis", "ventas", 110),
				new Empleado("Pepe", "ventas", 110),
				new Empleado("Antonio", "marketing", 220),
				new Empleado("Andres", "marketing", 220)
				);	

		empleados.collect(Collectors.groupingBy(e->e.getDepartamento()))
		.forEach((k,v)->System.out.println(k+"->"+v.stream().
				mapToDouble(e->e.getSalario())//obtengo el salario
				.average()//obtengo la media
				//.getAsDouble()
				));//lo convierto a double,si no ponto esto saldria que es optional OptionalDouble[220.0]
		
		
		//separamos en listas distinas segun cumplan o no la condicion
		Stream<Empleado> empleados2 =Stream.of(
				new Empleado("Luis", "ventas", 110),
				new Empleado("Pepe", "ventas", 110),
				new Empleado("Antonio", "marketing", 220),
				new Empleado("Andres", "marketing", 220)
				);	
		
		//partitioningBy devuelve un boolean 
		Map<Boolean,List<Empleado>> agrupadas=
				empleados2.
				collect(Collectors.
				partitioningBy(p->p.getDepartamento().equalsIgnoreCase("ventas")));
		
		agrupadas.forEach((k,v)->System.out.println("clave->"+ k + "\n valor"+v));
		
		//agrupamos en un string todos los nombres separados por *
		
		Stream<Empleado> empleados3 =Stream.of(
				new Empleado("Luis", "ventas", 110),
				new Empleado("Pepe", "ventas", 110),
				new Empleado("Antonio", "marketing", 220),
				new Empleado("Andres", "marketing", 220)
				);	
		
		String todos = empleados3
				.map(p->p.getNombre())
				.collect(Collectors.joining("*"));
		System.out.println("\ntodos->"+todos); 
		
		
		//calcular la temperatura media de dos ciudades
		
		List<Ciudad> ciudades = Arrays.asList(
				new Ciudad("Ciudad1",11.0),
				new Ciudad("Ciudad2",22.0),
				new Ciudad("Ciudad3",33.0)
				);
		
		//calcular la media de temperatura de las ciudades
		Stream<Ciudad> streamCiudad = ciudades.stream();		
		System.out.println("\nla media de temperatura es->"+
				streamCiudad.collect(Collectors.
						averagingDouble(p->p.getTemperatura()))
		);
		//otra forma
		Stream<Ciudad> streamCiudad2 = ciudades.stream();
		System.out.println("\nla media de temperatura2 es->"+
		streamCiudad2.mapToDouble(p->p.getTemperatura()).average()
		.getAsDouble()//esto hace que no devuelva un optional
		);
		
		
		
		Integer[] arrayEnteros = {1,3,5,8,9,10};		
		Stream.of(arrayEnteros).mapToInt(p->p).average();
		System.out.println(Stream.of(arrayEnteros).mapToInt(p->p).average());
			
		
	}

}
