package com.jgr.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.jgr.stream.modelo.GeneraDatos;

/**
 * The Class LanzadoraStream.
 */
public class LanzadoraStream {
	
	public static void main(String[] args) {		
		
		List<Integer> listaInteger = new ArrayList<Integer>();
		List<Double> listaDouble = new ArrayList<Double>();
		List<String> listaString = new ArrayList<String>();
		List<Date> listaDate = new ArrayList<Date>();
		
		
		GeneraDatos.getListaIntegerRango(5, -90, 90)
		.forEach(listaInteger::add);
		
		GeneraDatos.getListaStringChuck(10)
		.forEach(listaString::add);
		
		//listaDouble.forEach(n->System.out.println(n));
		GeneraDatos.getListaDoubleStreamRango(10,-1000, 2000)
		.forEach(listaDouble::add);;
		
		/*


		//Cuenta los numeros que hay en el array
		System.out.println("cuenta los numeros->"+listaInteger.stream().count());
		
		//Muestra los elementos
		listaString
				.com.jgr.stream()
				.forEachOrdered(n->System.out.println(n));
		
		//sin duplicados
		listaInteger.stream()
		.distinct()
		.forEach(n->System.out.println("\nsin duplicados numeros->"+n ));
		
		listaString.stream()
		.distinct()
		.forEach(n->System.out.println("\nsin duplicados String->"+n ));
		
		
		//devuelve los n primeros
		listaInteger.stream()
		.distinct()
		.limit(5)
		.forEach(n->System.out.println("\nsin duplicados numeros->"+n ))
		;
		
		//se salta los n primeros
		listaInteger.stream()
		.distinct()
		.skip(5)
		.forEach(n->System.out.println("\nsin duplicados numeros->"+n ));
		
		//saca los 7 primeros numeros sin contar duplicados		
		listaInteger.stream()
		.distinct()
		.limit(7)
		.forEach(n->System.out.println("numero->"+n));
		
		
		//ver si hay algun negativo
		listaInteger.stream().anyMatch(a->a<0);
		System.out.println("\nHay algun negativo->"+listaInteger.stream()
		.anyMatch(a->a<0));
		
		//cuantos son negativos
		System.out.println("\nCuantos negativos hay ->"+listaInteger.stream()
		.filter(a->a<0).count());
		
		//cuales son los negativos
		System.out.println("\nLista de numeros negativos ->"+
		listaInteger.stream()
		.peek(System.out::println)
		.filter(a->a<0)
		.peek(System.out::println)
		.collect(Collectors.toList())
		);
		
		//son todos pares
		System.out.println("\nSon todos pares ->"+
		listaInteger.stream()
		.allMatch(a->a%2==0));
		
		//ordenados
		System.out.println("\nOrdenados ->"+		
		listaInteger.stream()
		.sorted((a,b)->a-b)//comparamos los elementos entre si,como el metodo de la burbuja
		.collect(Collectors.toList()));
		
		//suma de los que son pares
		System.out.println("\nSuma de los que son par y positivos->"+
		listaInteger.stream()
		.filter(p->p%2==0&&p>0)//sacamos solo los pares y positivos
		.reduce(0,Integer::sum));	//0 es el acumulador, integer::sum es el metodo suar
		
		
		//saca el mayor de una lista
		System.out.println("\nEl mayor de una lista->"+
		listaInteger.stream()
		.reduce(0,(a,b)->a>b?a:b)); //0 es donde lo guarda, compara los numeros de 2en 2
		
		
		System.out.println("\nEl mayor de una lista->"+
		listaInteger.stream()
		.max((a,b)->a-b));
		
		System.out.println("\nEl menor de una lista->"+
				listaInteger.stream()
		.min((a,b)->a-b));

		
		//estadisticas 
		Stream<Integer> com.jgr.stream = listaInteger.stream();
		IntStream inStr = com.jgr.stream.mapToInt(a->a);
		IntSummaryStatistics stats = inStr.summaryStatistics();
		
		System.out.println("max: " + stats.getMax());
		System.out.println("min: " + stats.getMin());
		System.out.println("sum: " + stats.getSum());
		System.out.println("promedio: " + stats.getAverage());
		System.out.println("total: " + stats.getCount());

		
		//filtro de ocurrencias
		System.out.println("\nEl mayor de una lista->"+
				listaInteger.stream()
				.max((a,b)->a-b));
		
		//cuantos pares distintos hay en una lista
		System.out.println("\nCuantos pares distintos hay->"+
				listaDouble.stream()
				.distinct()
				.filter(n->n%2==0)
				.count());
		
		
		//nombres diferentes de menos de 6 caracteres hay
		List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");
		
		System.out.println("Nombres distintos de menos de 6 caracteres->"+		
		nombres.stream()
		.distinct()//distintos
		.filter(n->n.length()<6)//longitud menor de 6
		.count()); // los cuenta
		
		//nombres diferentes de menos de 6 caracteres hay
		String nombresString=("leche,atún,vino,patatas,leche,agua,vino,lechuga");
		
		System.out.println("\nCuenta los nombres distintos en un unico String->"+
		 Arrays.stream(nombresString.split(","))//divido el string con las comas
		.distinct()
		.filter(n->n.length()<6)
		.count());
		
		
		//busqueda primer producto que comienza por 'a',si no hay sacar msg		
		List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");
		
		System.out.println("\nBusqueda de elemento->"+
		nombres.stream()
		//.filter(n->n.substring(0, 1).contains("a"))//solo saco los que tienen a al principio
		.filter(n -> n.startsWith("a"))// solo saco los que tienen a al principio
		.findFirst()// busca el primero
		.orElse("Pues no hay"));
		
		
		//ORDENACION
		//ordenacion natural
		System.out.println("\nOrdenacion Natural"+
		listaDouble.stream()
		.sorted()
		.collect(Collectors.toList())
		);
		
		
		//sacamos el negativo mas pequeño
		
				listaDouble.stream()
				.filter(n->n<0)//negativos
				.sorted() //ordena
				.findFirst()//saca el primero
				.ifPresent(n->System.out.println("El mas pequeño es->"+n));//si existe saca esto		
				
		//sacar el negativo mas pequeño
		System.out.println("\nOrdenacion ASCENDENTE SOLO negativos->"+
				listaDouble.stream()
				.filter(n->n<0)
				.sorted(Comparator.comparing(a->a))
//				.sorted((a,b)->Double.compare(b, a))
				.collect(Collectors.toList()));

		*/
		
		//OBTENCION DE EXTREMOS
		
		//max saca el mayor,internamente ordena		
		listaDouble.stream()
		.peek(System.out::println)
		.max((a,b)->Double.compare(a, b))
		.ifPresent(n->System.out.println("El numero mayor es->"+n));

		
		//min saca el menor,internamente ordena		
		listaDouble.stream()
		.peek(System.out::println)
		.min((a,b)->Double.compare(a, b))		
		.ifPresent(n->System.out.println("El numero mas pequeño es->"+n));

		
		
		
	}

}
