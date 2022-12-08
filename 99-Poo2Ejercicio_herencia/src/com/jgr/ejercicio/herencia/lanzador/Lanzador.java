package com.jgr.ejercicio.herencia.lanzador;

import java.util.ArrayList;
import java.util.List;

import com.jgr.ejercicio.herencia.Cliente;
import com.jgr.ejercicio.herencia.Empleado;
import com.jgr.ejercicio.herencia.Persona;

public class Lanzador {

	public static void main(String[] args) {
		Persona per = new Persona();
		Empleado emp = new Empleado();
		Cliente cli = new Cliente();
		
		
		List<Persona> lista = new ArrayList<>();
	
		
		for (int i = 0;i<20;i++) {
			Persona p = new Persona();
			char s[] = "".toCharArray();
			
			p.setNombre("Nombre"+i);
			p.setEdad(i);
			p.setDireccion("Direccion"+i);
			p.setGenero(((i%2==0?"H":"M")).toCharArray()[0]);
			lista.add(p);
			
			if(i%2==0) {
				Empleado e = new Empleado(p,2000);
				lista.add(e);
			}
			else {
				Cliente c = new Cliente(p,true);
				lista.add(c);
			}
			
		}
		
		lista.forEach(System.out::println);
		
		

	}

}
