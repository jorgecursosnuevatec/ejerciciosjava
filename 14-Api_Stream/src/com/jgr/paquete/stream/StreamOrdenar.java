package com.jgr.paquete.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.AlumnoComparable;
import com.jgr.paquete.stream.modelo.CajaNegra;
import com.jgr.paquete.stream.modelo.Usuario;

public class StreamOrdenar {
public static void main(String[] args) {
		
		AlumnoComparable a3 = new AlumnoComparable("Nombre3", "Apellido3", 13);
		AlumnoComparable a1 = new AlumnoComparable("Nombre1", "Apellido1", 11);
		AlumnoComparable a4 = new AlumnoComparable("Nombre4", "Apellido4", 14);
		AlumnoComparable a2 = new AlumnoComparable("Nombre2", "Apellido2", 12);		
		

		List<AlumnoComparable> alumnos = new ArrayList<>(List.of(a1, a2, a3, a4));
		Stream<AlumnoComparable> cadena = alumnos.stream();
		Stream<AlumnoComparable> cadena2 = alumnos.stream();
		Stream<AlumnoComparable> cadena3 = alumnos.stream();
		List<AlumnoComparable> alumnosOrdenados;
		/*
		alumnosOrdenados = cadena
				.sorted((a, b) -> a.getNota().compareTo(b.getNota()))
				//.peek(System.out::println)
				.collect(Collectors.toList());		
		alumnosOrdenados.forEach(System.out::println);
		*/
		alumnosOrdenados=cadena2.sorted((a, b) -> a.getNota().compareTo(b.getNota())).peek(System.out::println)
		.collect(Collectors.toList());
		
		Stream<String> st=Stream.of("esternocleidomastoideo","casa","comedor");
		st.sorted((a,b)->a.length()-b.length()).forEach(s->System.out.println(s));
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Andrés", "Guzmán"));
		usuarios.add(new Usuario("Luci", "Martínez"));
		usuarios.add(new Usuario("Pepe", "Fernández"));
		usuarios.add(new Usuario("Cata", "Pérez"));
		usuarios.add(new Usuario("Lalo", "Mena"));
		usuarios.add(new Usuario("Exequiel", "Doe"));
		usuarios.add(new Usuario("Bruce", "Lee"));
		usuarios.add(new Usuario("Bruce", "Willis"));
		
		Stream<Usuario> usuarioStream = Stream.of(
				new Usuario("Andrés", "Guzmán"),
				new Usuario("Luci", "Martínez"),
				new Usuario("Pepe", "Fernández"),
				new Usuario("Cata", "Pérez"),
				new Usuario("Lalo", "Mena"),
				new Usuario("Exequiel", "Doe"),
				new Usuario("Bruce", "Lee"),
				new Usuario("Bruce", "Willis")
				);
		
		CajaNegra c1= new CajaNegra();
		CajaNegra c2= new CajaNegra();
		CajaNegra c3= new CajaNegra();
		
		Stream<CajaNegra> cajas = Stream.of(c3,c2,c1);		
		List<CajaNegra> cajasOrdenadas=
				cajas.sorted((a,b)->a.getNumCaja()-b.getNumCaja())
				.peek(System.out::println)
				.collect(Collectors.toList());
		cajasOrdenadas.forEach(System.out::println);
	

		//ordena segun el criterio de comparacion		
		Stream<AlumnoComparable> al = Stream.of(a1,a2);		
		al.sorted(Comparator.comparing(a->a.getNota())).forEach(b->System.out.println(b.getNombre()));	
		
		

	}
}