package com.jgr.genericos;

import java.util.HashMap;
import java.util.Map;

public class LanzadoraFacil {

	public static void main(String[] args) {
		ClaseGenericaFacil<Integer> clase = new ClaseGenericaFacil(15); 

		clase.obtenerTipo();

		clase= new ClaseGenericaFacil("Hola");
		clase.obtenerTipo();

		clase = new ClaseGenericaFacil(123f);
		clase.obtenerTipo();

		Map<String, String> miMapa = new HashMap<>();
		miMapa.put("valor1", "Juan");
		miMapa.put("valor2", "Karla");
		miMapa.put("valor3", "Rosario");
		miMapa.put("valor3", "Carlos");

		clase = new ClaseGenericaFacil(miMapa);
		clase.obtenerTipo();





	}

}
