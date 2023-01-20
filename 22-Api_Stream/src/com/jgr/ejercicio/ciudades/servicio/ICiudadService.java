package com.jgr.ejercicio.ciudades.servicio;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.jgr.ejercicio.ciudades.modelo.Ciudad;




/**
 * The Interface ICiudadService.
 */
public interface ICiudadService {
	
	
/**
 * Alta ciudad.
 *
 * @param ciudad the ciudad
 * @return the optional
 */
//1->añadir ciudad,no se permiten ciudades repetidas (clave ciudad+pais)
	public Optional<Ciudad> altaCiudad(Ciudad ciudad);
	
/**
 * Alta ciudades.
 *
 * @param ciudades the ciudades
 * @return the list
 */
//2->añadir ciudades,no se permiten ciudades repetidas (clave ciudad+pais)
	public List<Ciudad> altaCiudades(List<Ciudad> ciudades);

/**
 * Num ciudades pais.
 *
 * @param pais the pais
 * @return the long
 */
//2->numero ciudades en un pais	
	public long numCiudadesPorPais(String pais);
	
	
// * 3->ciudad mas poblada	
	
	/**
 * Ciudad mas poblada.
 *
 * @return the optional
 */
public Optional<Ciudad> buscaCiudadMasPoblada();
	
//	 * 4-buscar ciudad por nombre y pais	
	
	/**
 * Busca ciudad por nombre Y pais.
 *
 * @param nomCiudad the nom ciudad
 * @param nomPais the nom pais
 * @return the optional
 */
public Optional<Ciudad> buscaCiudadPorNombreYPais(String nomCiudad, String nomPais);

/**
 * Busca ciudad mas fria.
 *
 * @return the optional
 */
//* 5-ciudad mas fria
public Optional<Ciudad> buscaCiudadMasFria();

/**
 * Busca ciudad por filtro.
 *
 * @param condicion the condicion
 * @return the optional
 */
//busca ciudad por filtro
public Optional<Ciudad> buscaCiudadPorFiltro(Predicate<Ciudad> condicion);

/**
 * Lista de todas las ciudades
 * @return lista ciudades
 */
//lista de ciudades 
public List<Ciudad> listaCiudades();



	
}
