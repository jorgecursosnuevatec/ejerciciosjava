package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.Comparator;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.AlumnoComparable;
import com.jgr.paquete.stream.modelo.CajaNegra;

/**
 * The Class StreamIntermedioOrdenacion.
 * Stream<T> sorted() 
 * Returns a stream consisting of the elements of this stream, sorted according to natural order.
 * Stream<T>	sorted​(Comparator<? super T> comparator) 
 * Returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.
 */
public class StreamIntermedioOrdenacion {

	public static void main(String[] args) {


		AlumnoComparable a1 = new AlumnoComparable("Nombre1", "Apellido1", 15);
		AlumnoComparable a2 = new AlumnoComparable("Nombre2", "Apellido2", 16);
		CajaNegra c1= new CajaNegra();
		CajaNegra c2= new CajaNegra();		
		Integer [][] numeritos = {{8,3,5},{2,11,7},{4,1,9,6}};

		//compara segun el orden natural usando sorted
		Stream<String> st = Stream.of("Luis","Javier","Pepe");
		st.sorted((a,b)->a.length()-b.length()).forEach(System.out::println);

		//ordena segun el criterio de comparacion		
		Stream<AlumnoComparable> al = Stream.of(a1,a2);		
		al.sorted(Comparator.comparing(a->a.getNota())).forEach(b->System.out.println(b.getNota()));		

		Stream<CajaNegra> cajas = Stream.of(c1,c2);	
		cajas.sorted(Comparator.comparing(c->c.getNumCaja())).forEach(System.out::println);;
	


	}

}
