package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.jgr.prog.funcional.y.lambda.models.Persona;
import com.jgr.prog.funcional.y.lambda.models.Usuario;


/**
 * The Class InterfazPredicate.
 * Predicate. Establecimiento de condiciones

 * recibe un objeto/dato y devuelve un boolean
 * metodo abstracto test que realiza una comprobacion y devuelve un boolean
 * boolean test(T t)
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html
 * por ejemplo removeIf
 */
public class InterfazPredicate {
	
	
	public static void main(String[] args) {
		//implementación que comprueba una cadena 
		//y devuelve true si su longitud es mayor que 10
		Predicate<String> pr=a->a.length()>10;
		//uso
		if(pr.test("hola")){
		 System.out.println("aceptada");
		}else{
		 System.out.println("no aceptada");
		}
		
		
		//este metodo pregunta si es mayor que 10
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(11);
        System.out.println("r = " + r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("t2->"+t2.test("ROLE_ADMIN"));
        
        Predicate<String> t2b = role -> role.equals("ROLE_ADMIN");
        System.out.println("t2b->"+t2b.test("ROLE_USER"));
        
        Predicate<Integer> validaMayor = a->a>5;
        System.out.println("es mayor->" + validaMayor.test(4));
        
        

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
