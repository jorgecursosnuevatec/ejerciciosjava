package prueba;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		List<Double> listaDouble3 =
				DoubleStream //NO es un stream,no funcionan igual
				.generate(() -> (double) Math.random() * 100)//genera numero aleatorio
//				.peek(p->System.out.println("antes del filtro->"+p))
				.boxed()//lo convierte a stream para que luego podamos pasarlo a lista
				.limit(500)				
				.collect(Collectors.toList())//lo convertimos a lista
				;//
		
		listaDouble3.addAll(DoubleStream //NO es un stream,no funcionan igual
				.generate(() -> (double) Math.random() * 100)//genera numero aleatorio
//				.peek(p->System.out.println("antes del filtro->"+p))
				.boxed()//lo convierte a stream para que luego podamos pasarlo a lista
				.limit(500)				
				.collect(Collectors.toList())//lo convertimos a lista
				);
		
		
		for (int i=0;i<listaDouble3.size()-1;i++) {
			
			if (listaDouble3.get(i)>listaDouble3.get(i+1)) {
				System.out.println("Desordenado->"+ 
			listaDouble3.get(i) +"<"
			+listaDouble3.get(i+1) + " posic->"+i);
			}
		}
		
		List<Double> listaDouble4 = listaDouble3
				.parallelStream()
				.sorted()
				.sequential()				
				.collect(Collectors.toList());
		
	for (int i=0;i<listaDouble4.size()-1;i++) {
			
			if (listaDouble4.get(i)>listaDouble4.get(i+1)) {
				System.out.println("Desordenado 4 ->"+ 
						listaDouble4.get(i) +"<"
			+listaDouble4.get(i+1) + " posic->"+i);
			}

	}

}}
