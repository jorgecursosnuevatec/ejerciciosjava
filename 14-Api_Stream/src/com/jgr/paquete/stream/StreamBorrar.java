package com.jgr.paquete.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.jgr.paquete.stream.modelo.Curso;
/**
 * The Class StreamBorrar.
 * https://www.baeldung.com/java-9-stream-api
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate)
 * PARA BORRAR POR IMPORTE >= HAY QUE ORDENAR POR IMPORTE DESCENDENTE
 */
public class StreamBorrar {

	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		Curso cur;
		for (int i=0;i<10;i++) {
			cur = new Curso();
			cur.setCursoNombre("Nombre"+i);
			cur.setDuracion(i);
			cur.setPrecio(i);
			cur.setTematica("Tematica"+i);
			cursos.add(cur);
		}
		
		
//OJO QUE BORRA TODO LO QUE SEA MENOR, SI LE PONGO >= DEBERIA ORDENAR EN DESCENDENTE	
		
		List<Curso> cursoMod=cursos.stream()
				.sorted((a, b) -> a.getPrecio()>b.getPrecio()?1:a.getPrecio()<b.getPrecio()?-1:0)
		.peek(n->System.out.println("Antes->"+n))
		// Predicate<? super Curso> predicate
		.dropWhile(c -> (c.getPrecio()) >3.0)// recibe un objeto y devuelve un stream con el resultado
		.peek(n->System.out.println("Despues->"+n))
		.collect(Collectors.toList());
		
		cursoMod.forEach(System.out::println);
		
		List<Curso> cursoMod2 = cursos.stream()
		.sorted((a, b) -> a.getPrecio()>b.getPrecio()?-1:a.getPrecio()<b.getPrecio()?1:0)
		.peek(n->System.out.println("Antes cursoMod2->"+n))
		// Predicate<? super Curso> predicate
		.dropWhile(c -> (c.getPrecio()) >3.0)// recibe un objeto y devuelve un stream con el resultado
		.peek(n->System.out.println("Despues cursoMod2->"+n))
		.collect(Collectors.toList());
		
		cursoMod2.forEach(System.out::println);
		
		
				

	}

}
