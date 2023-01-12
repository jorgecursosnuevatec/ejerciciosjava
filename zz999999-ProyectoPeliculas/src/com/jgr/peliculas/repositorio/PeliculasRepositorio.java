package com.jgr.peliculas.repositorio;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.jgr.peliculas.excepciones.ErrorAccesoDatos;
import com.jgr.peliculas.excepciones.ErrorEscrituraDatos;
import com.jgr.peliculas.excepciones.ErrorLecturaDatos;
import com.jgr.peliculas.modelo.Pelicula;


/**
 * The Class PeliculasRepositorio.
 * AÑADIDA LIBRERIA GSON-2.2.2.jar de GOOGLE para escribir/leer ficheros en formato json
 */
public class PeliculasRepositorio implements IPeliculasRepositorio {

	/**
	 * Existe.
	 *
	 * @param nombreRecurso the nombre recurso
	 * @return true, if successful
	 */
	@Override
	public boolean existe(String nombreRecurso) {
		var archivo = new File(nombreRecurso);
		return archivo.exists();
	}

	/**
	 * Listar.
	 *
	 * @param nombreRecurso the nombre recurso
	 * @return the list
	 * @throws ErrorLecturaDatos the error lectura datos
	 */
	@Override
	public List<Pelicula> listar(String nombreRecurso) throws ErrorLecturaDatos {
		var archivo = new File(nombreRecurso);
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();
			while (linea != null) {
				var pelicula = new Pelicula(linea);
				peliculas.add(pelicula);
				linea = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			throw new ErrorLecturaDatos("Excepcion al listar peliculas:" + ex.getMessage());
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new ErrorLecturaDatos("Excepcion al listar peliculas:" + ex.getMessage());
		}
		return peliculas;
	}

	/**
	 * Escribir.
	 *
	 * @param pelicula the pelicula
	 * @param nombreRecurso the nombre recurso
	 * @param anexar the anexar
	 * @throws ErrorEscrituraDatos the error escritura datos
	 */
	@Override
	public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws ErrorEscrituraDatos {
		var archivo = new File(nombreRecurso);
		try {
			var salida = new PrintWriter(new FileWriter(archivo, anexar));
			salida.println(pelicula.toString());
			salida.close();
			System.out.println("Se ha escrito informacion al archivo: " + pelicula);
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new ErrorEscrituraDatos("Excepcion al escribir peliculas:" + ex.getMessage());
		}
	}

	/**
	 * Buscar.
	 *
	 * @param nombreRecurso the nombre recurso
	 * @param buscar the buscar
	 * @return the string
	 * @throws ErrorLecturaDatos the error lectura datos
	 */
	@Override
	public String buscar(String nombreRecurso, String buscar) throws ErrorLecturaDatos {
		var archivo = new File(nombreRecurso);
		String resultado = null;
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();
			var indice = 1;
			System.out.println("buscando"+buscar);
			System.out.println("leido"+linea);
			String nomPeli=formatear(linea);
			while (linea != null) {
				if (buscar != null && buscar.equalsIgnoreCase(nomPeli)) {
					resultado = "Pelicula " + linea + " encontrada en el indice " + indice;
					break;
				}
				linea = entrada.readLine();
				nomPeli=formatear(linea);
				indice++;
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			throw new ErrorLecturaDatos("Excepcion al buscar pelicula:" + ex.getMessage());
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new ErrorLecturaDatos("Excepcion al buscar pelicula:" + ex.getMessage());
		}

		return resultado;
	}

	/**
	 * Crear.
	 *
	 * @param nombreRecurso the nombre recurso
	 * @throws ErrorAccesoDatos the error acceso datos
	 */
	@Override
	public void crear(String nombreRecurso) throws ErrorAccesoDatos {
		var archivo = new File(nombreRecurso);
		try {
			var salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new ErrorAccesoDatos("Excepcion al crear archivo:" + ex.getMessage());

		}
	}

	/**
	 * Borrar.
	 *
	 * @param nombreRecurso the nombre recurso
	 */
	@Override
	public void borrar(String nombreRecurso) {
		var archivo = new File(nombreRecurso);
		if (archivo.exists())
			archivo.delete();
		System.out.println("Se ha borrado el archivo");
	}

	/**
	 * Formatear.
	 *el formato en que se escribe es [idPelicula=1, nombre=Pelicula0]
	 *
	 * @param entrada the entrada
	 * @return the string
	 */
	public String formatear(String entrada) {
		String retorno="";
		
		//dividimos el string en trozos separados por =
		String[] partes = entrada.split("=");
		System.out.println("0->"+partes[0]);
		System.out.println("1->"+partes[1]);
		System.out.println("2->"+partes[2]);
		//aqui tenemos esto Pelicula0]
		String[] salida= partes[2].split("]");
		System.out.println("parte0->"+partes[0]);
		
		System.out.println(salida[0].getClass());
		
		
		return salida[0];
		
	}
	
}
