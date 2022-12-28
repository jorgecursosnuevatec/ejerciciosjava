package com.jgr.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The Class JavaNIO_Path_Paths_Files.
 * 
 * Una ruta relativa es la ruta a un archivo en la que se asume que el directorio 
 * de trabajo donde se ejecuta la aplicación y es más conocida como el directorio raíz.
 * 
 * Una ruta absoluta es la ruta de acceso completa a un archivo, 
 * incluido el nombre de la partición o disco en que se encuentra. 
 *  
 *  
 * Path->representa ruta a fichero o directorio
 * 
*  Path.getFileName->nombre del fichero/elemento del path
 * 
 * Path.toAbsolutePath->ruta completa del fichero/directorio desde donde estamos
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
 * Paths->para crear instancia de Path
 * 
 * Files->metodos estaticos para operar con ficheros/directorios
 * 
 */
public class JavaNIO_Path_Paths_Files {
	public static void main(String[] args) {
		
		Path p1= Path.of("user/mydata.txt");		
		System.out.println("p1->"+p1);
		
		
		Path p2= Path.of("/a/b");
		System.out.println("\np2->"+p2);
		//getFilename->nombre del ultimo elemento del path
		System.out.println("p2 nombre del ultimo elemento del path->"+p2.getFileName());
		
		//Path to absolutePath()->ruta completa del fichero o directorio desde el directorio actual
		Path p3 = Path.of("d:\\user\\mydata.txt");
		Path p4 = Path.of("datos.txt");
		//SI LE PASO LA RUTA SACA TODO
		System.out.println("\np3 AbsolutePath fichero si pasamos toda la ruta->"+p3.toAbsolutePath());
		//SI PASO EL FICHERO SACA RUTA COMPLETA DESDE EL DIRECTORIO ACTUAL
		System.out.println("p4 AbsolutePath desde directorio actual->"+p4.toAbsolutePath());
		
		//normalize() DEVUELVE EL PATH NORMALIZADO,resuelve las rutas relativas
		//. EL DIRECTORIO ACTUAL, .. SUBE UNO,estariamos en el mismo nivel en este caso		
		String url = "c:\\temp\\..\\data.txt";
		String url2 = "c:\\temp\\mydata.txt";
		String url3 = "c:\\temp\\..\\fichero.txt";
		String url4 = "new.txt";		
		p4= Paths.get(url);
		System.out.println("\nsin normalizar->"+p4);
		System.out.println("normalizado sube un directorio desde donde esta data->"+p4.normalize());
		
		//relativize(Path other) DEVUELVE la ruta relativa de other respecto al otro
		//navega desde p1 a p2,sube hasta temp,luego hasta d y desde ahi a fichero.txt
		//si uno es ruta absoluta y el otro no,devuelve excepcion		
		p1= Path.of(url2);		
		p2= Paths.get(url3);
		System.out.println("\nrelativize ruta desde origen hasta destino->"+p1.relativize(p2));
		
		//Path resolve-> resuelve una ruta frente a otra
		//añadiendo la ruta del segundo respecto a la del primero
		p1= Paths.get(url3);		
		p2= Paths.get(url4);		
		System.out.println("\nresolve resuelve ruta de destino hasta origen->"+p1.resolve(p2));
		
		//Path getNameCount()-> elementos del path,sin incluir el raiz
		p1= Path.of(url);		
		System.out.println("\ngetNameCount()-> cuenta elementos del path"+p1.getNameCount());
		
		//Path getName(int index)-> parte del path que ocupa esa posicion,empieza en 0
		p1= Path.of(url2);		
		System.out.println("\ngetName() parte del path que esta en la posicion 0->"+p1.getName(0));

		p1 = Path.of("\\user\\.\\..\\texto.txt"); // sube un directorio desde user,estaria en raiz
		p2 = Path.of("\\user\\..\\datos.txt");// sube un directorio desde user,estaria en raiz


		//como los dos estan en c, la direccion relativa de uno respecto a otro seria ..\fichero
		System.out.println("\ndireccion relativa de uno respecto al otro->"+p1.normalize().toAbsolutePath());
		System.out.println("resultado->"+p1.relativize(p2));
		
		
		//el resolve nos sacaria que los dos estan en el mismo directorio
		//si other es ruta absoluta se devuelve esa misma ruta
		p1 = Path.of("\\user\\.\\..\\texto.txt"); // sube un directorio desde user,estaria en raiz
		p2 = Path.of("new.txt");
		System.out.println("\nresuelve la ruta de other hasta el principal"+p1.resolve(p2));
		
		
		

	}

}
