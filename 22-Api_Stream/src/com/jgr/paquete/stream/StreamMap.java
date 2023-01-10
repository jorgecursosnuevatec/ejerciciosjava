package com.jgr.paquete.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.AlumnoComparable;

/**
 * The Class StreamMap.
 * LOS STREAM SOLO SE PUEDEN USAR UNA VEZ,LUEGO DA ERROR SI SE INTENTA ACCEDER
 * MAP->Para transformar y operar con ellos
 * PEEK->Para visualizar los datos
 * Collectors.toList->para convertir en lista
 */
public class StreamMap {

	public static void main(String[] args) {
		
		AlumnoComparable al1 = new AlumnoComparable("nombre1","apellidos1", 1);
		AlumnoComparable al2 = new AlumnoComparable("nombre2","apellidos2", 2);
		AlumnoComparable al3 = new AlumnoComparable("nombre3","apellidos3", 3);
		AlumnoComparable al4 = new AlumnoComparable("nombre4","apellidos4", 4);
		
		//en la salida alterna sysout,luego antes de convertir y luego despues de convertir
		Stream<?> alumnos = Stream.of(al1,al2,al3,al4)
				.peek(e->System.out.println("antes->"+e))
				//recupera la lista y podemos operar con ella
				.map(al->{
				al.setNombre(al.getNombre().toUpperCase()+" sumado");
				al.setNota((int) (al.getNota()*2.5));
				return al;
				})
				.peek(e->System.out.println("despues->"+e));
				
		alumnos.forEach(System.out::println);
		
		//cambiarmos a mayusculas usando un metodo de referencia
		
		String[] cadenas = {"CADENA1","CADENA2","CADENA3","CADENA4"};
		
		Stream<String> cadenasStream= Stream.of(cadenas).
				map(String::toUpperCase);
		
		//si lo dejo da error cuando intenta convertirlo a lista
		//cadenasStream.forEach(System.out::println); 
		
		List<String> cadenasLista = cadenasStream.collect(Collectors.toList());
		
		
		//
		
		
	}

}
