package com.jgr.ejercicio.mundopc.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Orden {

	private int idOrden;
	private List<Computadora> lista;
	private Computadora computadora;

	private int contadorOrdenes;
	
	private int contadorComputadoras;
	private int maxComputadoras = 25;
	private static int totOrdenes;
	private static int totPc;

	public Orden() {
		lista = new ArrayList<>();
	}
	
	public Orden(List<Computadora> lista) {
		super();
		if (lista == null) {
			lista = new ArrayList<>();
		}

		this.lista = lista;
	}


	public Orden(Computadora computadora) {

		this.computadora = computadora;
		if (lista == null) {
			lista = new ArrayList<>();
		}
		lista.add(computadora);

	}
	public void agregarComputadora(Computadora computadora) {
		
		this.computadora = computadora;
		if (lista == null) {
			lista = new ArrayList<>();
		}
		lista.add(computadora);
		
	}
	
	public Optional<Computadora> mostrarOrdenPedido(Computadora computadora) {
		
		return lista.stream().filter(c->computadora.equals(c)).findAny();
		
		
		
	}

	
}
