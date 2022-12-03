package com.jgr.genericos;

import java.util.HashMap;
import java.util.Map;

public class Lanzadora {

	public static void main(String[] args) {
		ClaseGenerica<Integer> clase = new ClaseGenerica(15); 

		clase.obtenerTipo();

		clase= new ClaseGenerica("Hola");
		clase.obtenerTipo();

		clase = new ClaseGenerica(123f);
		clase.obtenerTipo();

		Map<String, String> miMapa = new HashMap<>();
		miMapa.put("valor1", "Juan");
		miMapa.put("valor2", "Karla");
		miMapa.put("valor3", "Rosario");
		miMapa.put("valor3", "Carlos");

		clase = new ClaseGenerica(miMapa);
		clase.obtenerTipo();





	}

}
