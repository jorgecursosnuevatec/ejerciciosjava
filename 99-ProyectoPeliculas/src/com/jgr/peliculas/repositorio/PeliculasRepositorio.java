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
 */
public class PeliculasRepositorio implements IPeliculasRepositorio {

	@Override
	public boolean existe(String nombreRecurso) {
		var archivo = new File(nombreRecurso);
		return archivo.exists();
	}

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

	@Override
	public String buscar(String nombreRecurso, String buscar) throws ErrorLecturaDatos {
		var archivo = new File(nombreRecurso);
		String resultado = null;
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();
			var indice = 1;
			while (linea != null) {
				if (buscar != null && buscar.equalsIgnoreCase(linea)) {
					resultado = "Pelicula " + linea + " encontrada en el indice " + indice;
					break;
				}
				linea = entrada.readLine();
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

	@Override
	public void borrar(String nombreRecurso) {
		var archivo = new File(nombreRecurso);
		if (archivo.exists())
			archivo.delete();
		System.out.println("Se ha borrado el archivo");
	}

}
