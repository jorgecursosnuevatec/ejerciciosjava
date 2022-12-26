package com.jgr.paquete.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Usuario;

/**
 * The Class StreamParallel.
 * en un stream usamos el metodo parallel()
 * en una coleccion usamos parallelStream()
 * Cuidado que NO ORDENA,lo puede hacer si lo pasamos a secuencial antes de ordenarlos
 */
public class StreamParallel {
	public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andrés", "Guzmán"));
        lista.add(new Usuario("Luci", "Martínez"));
        lista.add(new Usuario("Pepe", "Fernández"));
        lista.add(new Usuario("Cata", "Pérez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        long t1 = System.currentTimeMillis();
 
        //es una lista,se usa stream().parallel()
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toLowerCase())
                .peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                    + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre.toUpperCase());
                    }
                    //return Stream.of("HA ENTRADO POR NULL");
                    return Stream.empty();
                    
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (t2 - t1));
        System.out.println(resultado);
        
        t1 = System.currentTimeMillis();
        
        //al ser stream se usa parallelStream()
        String salidaStream = lista
        		.parallelStream()        		
                .map(u -> u.toString().toLowerCase())
                .peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                    + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre.toUpperCase());
                    }
                    //return Stream.of("HA ENTRADO POR NULL");
                    return Stream.empty();
                    
                })
                .findAny().orElse("");
        
        t2 = System.currentTimeMillis();
        System.out.println("Tiempo total2: " + (t2 - t1));
        //esto es solo para que se ejecute
        salidaStream.hashCode();
        
        //NO ORDENA SI USAMOS EL PARALEL        
        List<Integer> listaEnteros=IntStream
   			 .iterate(1, i -> i + 1)
               .limit(100)
               .boxed()
               .collect(Collectors.toList());
        
       Stream<Integer> listaParesNOOrdenados =  listaEnteros
    		   .parallelStream()    		 
    		   .peek(n -> {
                   System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                   + " -numero " + n);
               })
              
    		   .filter(n->n%2==0);       
       System.out.println("\n NO ORDENADOS");
       listaParesNOOrdenados.sorted().forEach(p->System.out.println("numero->"+p));
  			 
       Stream<Integer> listaParesOrdenados =  listaEnteros
    		   .parallelStream()    		  
    		   .peek(n -> {
                   System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                   + " - numero" + n);
               })
             
    		   .sequential()
    		   .sorted()    		  
    		   .filter(n->n%2==0);   
       System.out.println("\n ****ORDENADOS******");
       
       listaParesOrdenados.forEach(p->System.out.println("numero->"+p));
       
       
    }
};