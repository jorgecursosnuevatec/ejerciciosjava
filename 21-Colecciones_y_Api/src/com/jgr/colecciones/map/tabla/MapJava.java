package com.jgr.colecciones.map.tabla;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The Class MapJava.
 * interface MAP, no de Collection como las otras
 * HashMapEjemplo-> usa el algoritmo Hash lo necesita,no admite duplicados
 * LinkedHashMap-> extiende de HashMapEjemplo,usa clave-valor
 * TreeMapEjemplo-> es un mapa ordenado
 * la informacion se guarda en formato clave-valor
 * 
 */
public class MapJava {

	
	public static void main(String[] args) {
		List<String> miLista = new ArrayList<String>();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Viernes");
		imprimir(miLista);

		Set<String> miSet = new HashSet<String>();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Viernes");
		imprimir(miSet);

		Map<String, String> miMapa = new HashMap<String, String>();
		miMapa.put("valor1", "Lunes");
		miMapa.put("valor2", "Martes");
		miMapa.put("valor3", "Miercoles");
		miMapa.put("valor4", "Jueves");
		miMapa.put("valor5", "Viernes");
		miMapa.put("valor6", "Sabado");
		miMapa.put("valor7", "Domingo");

		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
		

	}

	/**
	 * Imprimir.
	 *
	 * @param coleccion the coleccion
	 */
	public static void imprimir(Collection coleccion) {
		System.out.println("****************************");
		coleccion.forEach(elemento -> {
			System.out.println("elemento = " + elemento);
		});

		coleccion.getClass().getCanonicalName();
		System.out.println(coleccion.getClass().getName());
		System.out.println(coleccion.getClass().getSimpleName());
		

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
	}

}
