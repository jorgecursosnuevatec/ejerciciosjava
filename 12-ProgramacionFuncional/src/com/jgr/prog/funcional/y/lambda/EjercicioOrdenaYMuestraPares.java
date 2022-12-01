package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjercicioOrdenaYMuestraPares {

	
	public static void main(String[] args) {
	
		List<Integer> nums = List.of(10,25,33,80,12,4,55,8);
		
		List<Integer> datos = new ArrayList<>(nums);
		
		datos.removeIf(n->n%2!=0);//elimino impares
		//ahora ordeno de menor a mayor
		datos.sort((a,b)->b-a);
		
		
		//tambien podria ordenarse asi
		//datos.sort(Comparator.reverseOrder());
		
		datos.forEach(System.out::println);
		
		
		
	}

}
