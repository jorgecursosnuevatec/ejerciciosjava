package com.jgr.colecciones.listas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.jgr.colecciones.modelo.Alumno;


/**
 * The Class LinkedListEjemplo.
 * * LINKED LIST->listas enlazadas,es mas rapido que la lista para modificaciones,tarda mas en buscar aleatoria
     * 				trabaja con pilas/colas
 */
public class LinkedListEjemplo {
    
    /**
     * The main method.
	 *	LINKED LIST->listas enlazadas,es mas rapido que la lista para modificaciones,tarda mas en buscar aleatoria
     * 				trabaja con pilas/colas     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("está vacía = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Primero = " + enlazada.peekFirst());//no lanza excepcion
        System.out.println("Último = " + enlazada.getLast());
        System.out.println("Último = " + enlazada.peekLast());//no lanza excepcion
        System.out.println("Indice 2 = " + enlazada.get(2));

        Alumno zeus = enlazada.pop();
        enlazada.pollLast();
        enlazada.pollFirst();
        enlazada.pop();
        
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        enlazada.addLast(a);
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));
        
        enlazada.addLast(new Alumno("Atenea", 6));
        enlazada.addFirst(new Alumno("Otra1", 6));
        enlazada.add(new Alumno("Otra2", 6));
        
        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        
        //con este podemos ir adelante y hacia atras
        ListIterator<Alumno> li = enlazada.listIterator();

        while(li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("=================== Previous");
        while(li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
        
    }
}
