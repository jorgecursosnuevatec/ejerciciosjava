package com.jgr.paquete.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AplanarArrayDosDimensionesYEliminarRepetidos {

    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(e -> System.out.println(e));
        
        //con funcion lambda
        Function<String[][], List<String>> flatten =
        		arr ->  Arrays.stream(arr).
        		flatMap(a -> Arrays.stream(a))
                .distinct()
                .collect(Collectors.toList());
        
        flatten.apply(lenguajes).forEach(e -> System.out.println(e));
    }
}
