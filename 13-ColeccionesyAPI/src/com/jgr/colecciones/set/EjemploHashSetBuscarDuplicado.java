package com.jgr.colecciones.set;

import java.util.HashSet;
import java.util.Set;

/**
 * The Class EjemploHashSetBuscarDuplicado.
 *  HashSet-> no mantiene el orden,ni el de insercion,se puede usar comparable,sus elementos tienen que implementar hashcode
 */
public class EjemploHashSetBuscarDuplicado {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        for(String pez: peces){
            if(!unicos.add(pez)){
                System.out.println("Elemento Duplicado: " + pez);
            }
        }
        System.out.println(unicos.size() + " elementos no duplicados: " + unicos);
    }
}
