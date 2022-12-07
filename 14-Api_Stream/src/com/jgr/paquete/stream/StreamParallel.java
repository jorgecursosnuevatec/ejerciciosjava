package com.jgr.paquete.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import com.jgr.paquete.stream.modelo.Usuario;

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
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
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
                        return Stream.of(nombre);
                    }
                    return Stream.of(null);
                    
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (t2 - t1));
        System.out.println(resultado);
    }
}