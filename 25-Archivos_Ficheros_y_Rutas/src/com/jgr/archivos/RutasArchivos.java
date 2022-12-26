package com.jgr.archivos;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The Class RutasArchivos.
 * Path es una ruta a un fichero o directorio
 * Paths para crear instancias de Path
 * Files metodos estaticos para usar
 * 
 * Una ruta relativa es la ruta a un archivo en la que se asume que el directorio 
 * de trabajo dónde se ejecuta la aplicación y es más conocida como el directorio raíz.
 * 
 *  Una ruta absoluta es la ruta de acceso completa a un archivo, 
 *  incluido el nombre de la partición o disco en que se encuentra.
 *   
 * Path.getFileName->nombre del fichero/elemento del path
 * 
 * Path.toAbsolutePath-> ruta completa del fichero/directorio desde donde estamos
 * 
 * Path.normalize()-> quita el ..(subir el directorio) o el .(directorio actual)
 * convertiria "c:\\temp..\\..\\data.txt" en c:\data.txt,sube un nivel hasta el raiz
 * 
 * Path.relativize devuelve la ruta RELATIVA de uno respecto al otro,internamente lo normaliza
 * p1 Path.of("c:\\temp\\mydata.txt")
 * p2 Paths.get("c:\\temp\\..\\data.txt")->como sube un directorio la ruta seria c:\data
 * p1.relativize(p2)
 * devolveria ..\.\data.txt->porque p2 al subir un directorio estaria en c:\data 
 * 
 * Path.resolve-> resuelve una ruta respecto a otra
 * 
 * int Path.getNameCount->devuelve el numero de elementos del path
 * 
 * Path Path.getName(int index)->la parte del path que ocupa en el array que forma la ruta,empieza por 0
 * 
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
		Path p3 = Path.of("\\user\\mydata.txt");
		Path p4 = Path.of("datos.txt");
		//SI LE PASO LA RUTA SACA TODO
		System.out.println("p3 AbsolutePath->"+p3.toAbsolutePath());
		//SI PASO EL FICHERO SACA RUTA COMPLETA DESDE EL DIRECTORIO ACTUAL
		System.out.println("p4 AbsolutePath->"+p4.toAbsolutePath());
		
		//normalize() DEVUELVE EL PATH NORMALIZADO
		//. EL DIRECTORIO ACTUAL, .. SUBE UNO,estariamos en el mismo nivel en este caso
		
		String url = "\\temp\\..\\data.txt";
		String url2 = "\\temp\\mydata.txt";
		String url3 = "\\temp\\..\\fichero.txt";
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

		p1 = Path.of("\\user\\.\\..\\texto.txt"); // sube un directorio desde user,estaria en raiz
		p2 = Path.of("\\user\\..\\datos.txt");// sube un directorio desde user,estaria en raiz


		//como los dos estan en c, la direccion relativa de uno respecto a otro seria ..\fichero
		System.out.println("\n"+p1.normalize().toAbsolutePath());
		System.out.println("\n"+p1.relativize(p2));
		
		
		//el resolve nos sacaria que los dos estan en el mismo directorio
		p1 = Path.of("\\user\\.\\..\\texto.txt"); // sube un directorio desde user,estaria en raiz
		p2 = Path.of("new.txt");
		System.out.println("\n"+p1.resolve(p2));
		
		
		

	}

}
