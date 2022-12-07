package com.jgr.colecciones.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The Class HashSetAgregar. 
 * HashSet-> no mantiene el orden,ni el de
 * insercion,se puede usar comparable,sus elementos tienen que implementar
 * hashcode
 */
public class HashSetAgregar {

	
	public static void main(String[] args) {

		Set<String> hs = new HashSet<>();
		System.out.println(hs.add("uno"));
		System.out.println(hs.add("dos"));
		System.out.println(hs.add("tres"));
		System.out.println(hs.add("cuatro"));
		System.out.println(hs.add("cinco"));
		System.out.println(hs);

		boolean b = hs.add("tres");
		System.out.println("permite elementos duplicados = " + b);
		System.out.println(hs);		

	}

}
