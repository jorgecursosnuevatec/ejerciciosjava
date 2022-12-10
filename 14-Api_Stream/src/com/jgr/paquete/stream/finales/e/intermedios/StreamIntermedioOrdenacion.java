package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.Comparator;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Alumno;
import com.jgr.paquete.stream.modelo.CajaNegraComparator;
import com.jgr.paquete.stream.modelo.Usuario;

/**
 * The Class StreamIntermedioOrdenacion.
 * Stream<T> sorted() 
 * Returns a stream consisting of the elements of this stream, sorted according to natural order.
 * Stream<T>	sorted​(Comparator<? super T> comparator) 
 * Returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.
 * 
 * 
 */
public class StreamIntermedioOrdenacion {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Nombre1", "Apellido1");
		Usuario u2 = new Usuario("Nombre2", "Apellido2");	
		Alumno a1 = new Alumno("Nombre1", "Apellido1", 15);
		Alumno a2 = new Alumno("Nombre2", "Apellido2", 16);
		CajaNegraComparator c1= new CajaNegraComparator();
		CajaNegraComparator c2= new CajaNegraComparator();
		
		Integer [][] numeritos = {{8,3,5},{2,11,7},{4,1,9,6}};
		 
		//compara segun el orden natural
		Stream<String> st = Stream.of("Luis","Javier","Pepe");
		st.sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
		
		Stream<Alumno> al = Stream.of(new Alumno("Nombre1", "Apellido1", 15),
				new Alumno("Nombre2", "Apellido2", 16));
		
		al.sorted(Comparator.comparing(a->a.getNota())).forEach(b->System.out.println(b.getNota()));
		
		
		Stream<CajaNegraComparator> cajas = Stream.of(c1,c2);	
		cajas.sorted(Comparator.comparing(c->c.getNumCaja())).forEach(System.out::println);;
		
		
		
		
		

	}

}
