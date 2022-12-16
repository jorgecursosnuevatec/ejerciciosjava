package com.jgr.paquete.stream.lambda.expresiones;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Alumno;

/**
 * The Class ReferenciasMetodoExpresionLambda.
 * Las referencias a meytodos sustituyen las expresiones lambda
 * Sustituye a Expresiones Lambda
 * 
 * referencia a metodo estatico
 * s->String.valueOf(s)-----equivalente->String::valueOf(s)
 * 
 * 
 * referencia a metodo de objeto especifico
 * s->System.out.println(s)------equivalente->System.out::println
 * 
 * referencia a metodo de objeto arbitrario
 * (a,b)->a.equals(b)------equivalente->String::equals
 * 
 * referencia a constructor
 * a->new MiClase(a)-------equivalente->MiClase::new
 *
 */
public class ReferenciasMetodoExpresionLambda {
	public static void main(String[] args) {
		
		Alumno a3 = new Alumno("Nombre3", "Apellido3", 13);
		Alumno a1 = new Alumno("Nombre1", "Apellido1", 11);
		Alumno a4 = new Alumno("Nombre4", "Apellido4", 14);
		Alumno a2 = new Alumno("Nombre2", "Apellido2", 12);		
		
		
		Stream<String> st=Stream.of("esternocleidomastoideo","casa","comedor");
		Stream<String> st2=Stream.of("esternocleidomastoideo","casa","comedor");
		//original
		st.sorted((a,b)->a.length()-b.length()).forEach(s->System.out.println(s));
		//metodo estatico equivalente
		st2.sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
		
		
		Stream<Alumno> stAlumno = Stream.of(a3,a1,a2,a4);
		Stream<Alumno> stAlumno2 = Stream.of(a3,a1,a2,a4);
		stAlumno.sorted(Comparator.comparing(p->p.getNota())).forEach(p->System.out.println(p.getNombre()));
		//este seria una referncia a metodo arbitrario,vamos a sacar el nombre,hay que especificar cual
		stAlumno2.sorted(Comparator.comparing(Alumno::getNota)).forEach(p->System.out.println(p.getNombre()));

		Stream<Alumno> stAlumno3 = Stream.of(a3,a1,a2,a4);
		Map<Integer,String> mapa = stAlumno3.
				collect(Collectors.
						toMap(p->p.getIdAlumno(), p->p.getApellidos()));
		mapa.forEach((k,v)->System.out.println("clave->"+ k + " valor->"+v));
		
		//el equivalente seria metodo de objeto arbitrario
		Stream<Alumno> stAlumno4 = Stream.of(a3,a1,a2,a4);
		Map<Integer,String> mapa2 = stAlumno4.
				collect(Collectors.toMap(Alumno::getIdAlumno,Alumno::getApellidos));
		
		mapa2.forEach((k,v)->System.out.println("clave->"+ k + " valor->"+v));
	}

}
