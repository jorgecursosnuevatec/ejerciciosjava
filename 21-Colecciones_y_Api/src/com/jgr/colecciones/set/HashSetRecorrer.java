package com.jgr.colecciones.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.jgr.colecciones.modelo.Alumno;

// TODO: Auto-generated Javadoc
/**
 * The Class HashSetRecorrer.
 *  HashSet-> no mantiene el orden,ni el de insercion,se puede usar comparable,sus elementos tienen que implementar hashcode
 */
public class HashSetRecorrer {
	 
 	/**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 */
 	public static void main(String[] args) {

	        Set<Alumno> sa = new HashSet<>();
	        // List<Alumno> sa = new LinkedList<>();
	        sa.add(new Alumno("Pato", 5));
	        sa.add(new Alumno("Cata", 6));
	        sa.add(new Alumno("Luci", 4));
	        sa.add(new Alumno("Jano", 7));
	        sa.add(new Alumno("Andres", 3));
	        sa.add(new Alumno("Zeus2", 2));
	        sa.add(new Alumno("Zeus", 2));
	        sa.add(new Alumno("Lucas", 2));
	        sa.add(new Alumno("Lucas", 2));//esta repetido solo sale uno
	        sa.add(new Alumno("Lucas", 4));
	        System.out.println(sa);

	        /*System.out.println("Utilizando un for clásico");
	        for(int i = 0 ; i<sa.size(); i++){
	            Alumno a = sa.get(i);
	            System.out.println(a.getNombre());
	        }*/
	        
	        System.out.println("Iterando usando un foreach");
	        for(Alumno a: sa){
	            System.out.println(a.getNombre());
	        }

	        System.out.println("Iterando usando while y iterator");
	        Iterator<Alumno> it = sa.iterator();
	        while(it.hasNext()){
	            Alumno a = it.next();
	            System.out.println(a.getNombre());
	        }

	        System.out.println("Iterando usando Stream forEach");
	        sa.forEach(System.out::println);
	    }
	}
