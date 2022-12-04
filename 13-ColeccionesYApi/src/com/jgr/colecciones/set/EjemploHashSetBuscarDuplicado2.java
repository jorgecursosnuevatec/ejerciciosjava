package com.jgr.colecciones.set;

import java.util.HashSet;
import java.util.Set;

/**
 * The Class EjemploHashSetBuscarDuplicado2.
 *  HashSet-> no mantiene el orden,ni el de insercion,se puede usar comparable,sus elementos tienen que implementar hashcode
 */
public class EjemploHashSetBuscarDuplicado2 {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

    	String[] peces = { "Corvina", "Atún", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado" };

    	Set<String> unicos = new HashSet<>();
    	Set<String> duplicados = new HashSet<>();
    	for (String pez : peces) {
    		if (!unicos.add(pez)) {
    			duplicados.add(pez);
    		}
    	}
    	// de unicos elimina los que estan duplicados
    	unicos.removeAll(duplicados);

    	System.out.println("Unicos: " + unicos);
    	System.out.println("Duplicados: " + duplicados);
    }
}
