package com.jgr.paquete.stream.finales.e.intermedios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class TransformacionYAplanamiento 
 * devuelven otro com.jgr.stream segun el criterio aplicado
 * -flatMap
 */
public class StreamIntermedioTransformacionYAplanamiento {
	public static void main(String[] args) {


		List<List<String>> datos = Arrays.asList(
				Arrays.asList("Luis","Javier","Pepe"),
				Arrays.asList("LUIS","JAVIER","PEPE")				
				);

		System.out.println(
				datos.stream()
				.flatMap(l->l.stream().map(s->s.length()))
				.count()
				);

		//aplano lista con programacion funcional		
		String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

		//con funcion lambda
		Function<String[][], List<String>> flatten =
				arr ->  Arrays.stream(arr).
				flatMap(a -> Arrays.stream(a))
				.distinct()
				.collect(Collectors.toList());

				flatten.apply(lenguajes).forEach(e -> System.out.println(e));
				//la misma lista,pero con flatmap        
				Stream<String[]> nombres2 = Arrays.stream(lenguajes);
				System.out.println(nombres2.flatMap(a->Arrays.stream(a)).collect(Collectors.toList()));


				//sacamos el mayor del array bidimensional
				Integer [][] numeritos = {{8,3,5},{2,11,7},{4,1,9,6}};
				/*
        for (int i=0;i<numeritos.length;i++) {
        	System.out.println("\nfila->"+i);
        	for (int j=0;j<numeritos[i].length;j++) {
        		System.out.println("columna->"+ "*" + i + "*"+ j +"valor->"+ numeritos[i][j]);


        	}
        }
				 */
				System.out.println(
						Arrays.stream(numeritos). //lo convierto a com.jgr.stream
						flatMap(a->Arrays.stream(a))//cada array a com.jgr.stream,lo aplano a 1 dimension
						//.reduce(0, (ac, e) -> ac > e? ac: e))//comparo y saco el mayor
						.max((a,b)->a-b) //compara y saca el mayor
						) ;

				Optional<Integer> resultado=Arrays.stream(numeritos). //lo convierto a com.jgr.stream
						flatMap(a->Arrays.stream(a))//cada array a com.jgr.stream,lo aplano a 1 dimension
						//.reduce(0, (ac, e) -> ac > e? ac: e))//comparo y saco el mayor
						.max((a,b)->a-b); //compara y saca el mayor
						
				//Solucion del profesor
				System.out.println(
						Arrays.stream(numeritos). //lo convierto a com.jgr.stream
						flatMap(a->Arrays.stream(a)).//cada array a com.jgr.stream,lo aplano a 1 dimension
						mapToInt(n->n).//transformarlo a intStream
						max().//sacamos el mayor
						getAsInt());



	}

}
