package com.jgr.archivos;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The Class RutasArchivos.
 */
public class RutasArchivos {

	
	public static void main(String[] args) {
		
		Path p1= Path.of("user/mydata.txt");		
		System.out.println("p1->"+p1);
		
		Path p2= Path.of("/a/b");
		System.out.println("p2->"+p2);
		//getFilename->nombre del ultimo elemento del path
		System.out.println("p2 nombre->"+p2.getFileName());
		
		//Path to absolutePath()->ruta completa del fichero o directorio
		Path p3 = Path.of("d:\\user\\mydata.txt");
		Path p4 = Path.of("datos.txt");
		//SI LE PASO LA RUTA SACA TODO
		System.out.println("p3 AbsolutePath->"+p3.toAbsolutePath());
		//SI PASO EL FICHERO SACA RUTA COMPLETA DESDE EL DIRECTORIO ACTUAL
		System.out.println("p4 AbsolutePath->"+p4.toAbsolutePath());
		
		//normalize() DEVUELVE EL PATH NORMALIZADO
		//. EL DIRECTORIO ACTUAL, .. SUBE UNO,estariamos en el mismo nivel en este caso
		
		String url = "D:\\temp\\..\\data.txt";
		String url2 = "D:\\temp\\mydata.txt";
		String url3 = "D:\\temp\\..\\fichero.txt";
		String url4 = "new.txt";
		
		p4= Paths.get(url);
		System.out.println("sin normalizar->"+p4);
		System.out.println("\nnormalizado->"+p4.normalize());
		
		//relativize(Path other) DEVUELVE la ruta relativa de other respecto al otro
		//navega desde p1 a p2,sube hasta temp,luego hasta d y desde ahi a fichero.txt
		
		p1= Path.of(url2);		
		p2= Paths.get(url3);
		System.out.println("\nrelativize->"+p1.relativize(p2));
		
		//Path resolver-> resuelve una ruta frente a otra
		p1= Paths.get(url);		
		p2= Paths.get(url4);		
		System.out.println("\nresolve->"+p1.resolve(p4));
		
		//Path getNameCount()-> elementos del path,sin incluir el raiz
		p1= Path.of(url);		
		System.out.println("\ngetNameCount()->"+p1.getNameCount());
		
		//Path getName(int index)-> parte del path que ocupa esa posicion,empieza en 0
		p1= Path.of(url2);		
		System.out.println("\ngetName()->"+p1.getName(0));

	}

}
