package com.jgr.paquete.stream;

import java.util.Arrays;
import java.util.List;

import com.jgr.paquete.stream.modelo.Producto;

public class CalcularImporteListaYSumarlo {
	public static void main(String[] args) {

		List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5), new Producto(4.99, 2));
		double sum = facturas.
				stream().
				map(p -> p.getCantidad() * p.getPrecio()).reduce(0d, Double::sum);
		System.out.println(sum);

		// otra manera

		double suma = facturas.stream().
				mapToDouble(x -> x.getCantidad() * x.getPrecio()).sum();

		System.out.println(suma);

	}

}
