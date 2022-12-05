package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.jgr.prog.funcional.y.lambda.models.Persona;
import com.jgr.prog.funcional.y.lambda.models.Usuario;


/**
 * The Class EjemploInterfazPredicate.
 * recibe un dato y devuelve un boolean
 * metodo abstracto test que realiza una comprobacion y devuelve un boolean
 * boolean test(T t)
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html
 * por ejemplo removeIf
 */
public class EjemploInterfazPredicate {
	
	
	public static void main(String[] args) {
		
		Persona array []= {
				new Persona("Nombre3",66),new Persona("Nombre2",67),
				new Persona("Nombre1",66),new Persona("Nombre3",67)
		};
		
		
		List<Persona> lista = new ArrayList<>(Arrays.asList(array));
			//este es el predicate
		lista.removeIf(				
				p->p.getEdad()>66
				);
		lista.forEach(System.out::println);
		

        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(11);
        System.out.println("r = " + r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("t2->"+t2.test("ROLE_ADMIN"));
        
        Predicate<String> t2b = role -> role.equals("ROLE_ADMIN");
        System.out.println("t2b->"+t2b.test("ROLE_USER"));

        BiPredicate<String, String> t3 = String::equals;// (a, b) -> a.equals(b);        
        System.out.println("t3->"+t3.test("andres", "andres"));
        
        BiPredicate<Integer, Integer> t4 = (i, j) -> j > i;
        boolean r2 = t4.test(5, 10);
        System.out.println("t4->"+ r2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("maria");
        b.setNombre("cata");        
        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println("t5->"+ t5.test(a, b));
        
        a.setNombre("maria");
        a.setEdad(15);
        b.setNombre("maria");
        b.setEdad(15);
        
        BiPredicate<Usuario, Usuario> t6 = 
        		(ua, ub) -> (ua.getNombre().equals(ub.getNombre())&(ua.getEdad()==ub.getEdad()));
        System.out.println("t6->"+ t6.test(a, b));
		

	}

}
