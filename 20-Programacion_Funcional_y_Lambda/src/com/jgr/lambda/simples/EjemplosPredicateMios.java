package com.jgr.lambda.simples;

import java.util.ArrayList;
import java.util.List;

import com.jgr.lambda.simples.interfaz.modelo.Persona;


/**
 * The Class EjemplosPredicateMios.
 * 
 * https://mkyong.com/tag/functional-interface/
 * 
 */
public class EjemplosPredicateMios {

	
	public static void main(String[] args) {
			com.jgr.lambda.simples.interfaz.modelo.Persona person;
		
		List<com.jgr.lambda.simples.interfaz.modelo.Persona> personas = new ArrayList<>();
		
		for (int i = 0 ;i<3;i++) {
			person = new Persona("Nombre"+i);
			personas.add(person);
		}
		
	Persona p1 = personas.get(0);
		
		//ESTA ES UNA FUNCION PREDICATE
		personas
		.stream() //a stream
		.anyMatch(personita->personita.getNombrePersona().equalsIgnoreCase(p1.getNombrePersona()));
		
		//PREDICATE
		personas
		.removeIf(personita->personita.getNombrePersona().equalsIgnoreCase(p1.getNombrePersona()));
		
		
		//UNARYOPERATOR
		//Subinterfaz de Function donde el tipo de entrada coincide con el de devolución
		personas
		.replaceAll(personita->
		{
			Persona pS = new Persona();
			pS= personita;			
			pS.setNombrePersona(personita.getNombrePersona().toLowerCase());
			return pS;
		});
		
		
	}

}
