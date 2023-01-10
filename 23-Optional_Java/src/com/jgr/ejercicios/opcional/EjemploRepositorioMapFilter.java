package com.jgr.ejercicios.opcional;

import com.jgr.ejercicios.opcional.modelo.*;
import com.jgr.ejercicios.opcional.repositorio.ComputadorRepositorio;
import com.jgr.ejercicios.opcional.repositorio.IRepositorio;

public class EjemploRepositorioMapFilter {
	public static void main(String[] args) {

		IRepositorio<Computador> repositorio = new ComputadorRepositorio();

		String f = repositorio.filtrar("asus").
				flatMap(Computador::getProcesador).
				flatMap(Procesador::getFabricante).
				filter(fab -> "intel".equalsIgnoreCase(fab.getNombre())).
				map(Fabricante::getNombre).
				orElse("Desconocido");

		System.out.println(f);

	}

}
