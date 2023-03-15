package com.jgr.ejercicio.ciudades.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;

import com.jgr.ejercicio.ciudades.modelo.Ciudad;


// TODO: Auto-generated Javadoc
/**
 * The Class CiudadServiceImpl.
 */
public class CiudadServiceImpl implements ICiudadService{


	/** The lista ciudades. */
	private List<Ciudad> listaCiudades;

	/**
	 * Instantiates a new ciudad service impl.
	 */
	public CiudadServiceImpl() {

		this.listaCiudades= new ArrayList<Ciudad>();
	}


	/**
	 * Alta ciudad.
	 *
	 * @param ciudad the ciudad
	 * @return the optional
	 */
	public Optional<Ciudad> altaCiudad(Ciudad ciudad) {

		Ciudad nueva = null;
		
//		System.out.println("Ciudad existe->" + listaCiudades.contains(ciudad));
		if (!listaCiudades.contains(ciudad)){
			listaCiudades.add(ciudad);
			nueva= ciudad;
		}
		return Optional.ofNullable(nueva);
	}
	
	/**
	 * Alta ciudades.
	 *
	 * @param ciudadesNuevas the ciudades nuevas
	 * @return lista ciudades
	 */
	public List<Ciudad> altaCiudades(List<Ciudad> ciudadesNuevas) {
		
		//para cada elemento de la lista llamo a alta ciudad

		ciudadesNuevas.forEach(n->this.altaCiudad(n));
		return this.listaCiudades;
	}


	/**
	 * Num ciudades pais.
	 *
	 * @param pais the pais
	 * @return the int
	 */
	@Override
	public long numCiudadesPorPais(String pais) {

		return listaCiudades.stream()
				.filter(c->c.getPaisCiudad().equalsIgnoreCase(pais))
				.count()
				;
	}


	/**
	 * Ciudad mas poblada.
	 *
	 * @return the optional
	 */
	@Override
	public Optional<Ciudad> buscaCiudadMasPoblada() {

		return listaCiudades.stream()
				.max((a,b)->Double.compare(a.getHabitantesCiudad(), b.getHabitantesCiudad()));
	}



	/**
	 * Busca ciudad por nombre Y pais.
	 *
	 * @param nomCiudad the nom ciudad
	 * @param nomPais the nom pais
	 * @return the optional
	 */
	@Override
	public Optional<Ciudad> buscaCiudadPorNombreYPais(String nomCiudad, String nomPais) {

		return listaCiudades.stream()
				.filter(c->c.getNombreCiudad().equalsIgnoreCase(nomCiudad)
						&&c.getPaisCiudad().equalsIgnoreCase(nomPais))
				.findFirst()
				;
	}
	
	/**
	 * Busca ciudad por filtro.
	 *
	 * @param condicion the condicion
	 * le paso un predicate como filtro que contenga las condiciones por las que quiero filtrar
	 * ej->ciudadService
	 *			.buscaCiudadPorFiltro(c->c.getNombreCiudad().equals(c1.getNombreCiudad())).get(),
	 *	   ej->
	 *	   Predicate<Ciudad> pred = c->(c.getTemperaturaMedia()
	 *			.equals((c1.getTemperaturaMedia())))
	 *			&&(c.getNombreCiudad()
	 *					.equals((c1.getNombreCiudad())))
	 *			&&(c.getPaisCiudad()
	 *					.equals((c1.getPaisCiudad())))
	 *			&&(c.getHabitantesCiudad()
	 *					.equals((c1.getHabitantesCiudad())));
	 *	c2=ciudadService.buscaCiudadPorFiltro(pred).get();	
	 * @return the optional
	 */
	@Override
	public Optional<Ciudad> buscaCiudadPorFiltro(Predicate<Ciudad> condicion) {
		
		Ciudad ciudad = new Ciudad();
		
		for (Ciudad s : listaCiudades) {
			if (condicion.test(s)) {
//				System.out.println("\n b buscaCiudadPorFiltro->"+s);
				ciudad = s;				
			}
		}
		return Optional.ofNullable(ciudad);
		
	}

	/**
	 * Busca ciudad mas fria.
	 *
	 * @return the optional
	 */
	@Override
	public Optional<Ciudad> buscaCiudadMasFria() {
		return listaCiudades.stream()
				.min((a,b)->Double.compare(a.getTemperaturaMedia(), b.getTemperaturaMedia()))	;

	}


	/**
	 * Lista ciudades.
	 *
	 * @return the list
	 */
	@Override
	public List<Ciudad> listaCiudades() {
		
		return this.listaCiudades;
	}


	/**
	 * Obtiene total paises.
	 *
	 * @return the long
	 */
	@Override
	public long obtieneTotalPaises() {
		
		return listaCiudades
				.stream()
				.map(c->c.getPaisCiudad())
				.distinct()
				.count()
				;
	}


	/**
	 * Borra ciudad por nombre.
	 *
	 * @param nombre the nombre
	 */
	@Override
	public void borraCiudadPorNombre(String nombre) {		
		this.listaCiudades.removeIf(c->c.getNombreCiudad().equalsIgnoreCase(nombre));
	}


	/**
	 * Temperatura media pais.
	 *
	 * @param nombrePais the nombre pais
	 * @return the OptionalDouble
	 */
	@Override
	public OptionalDouble temperaturaMediaPais(String nombrePais) {
		
		return listaCiudades.stream()
				.filter(c->c.getPaisCiudad().equalsIgnoreCase(nombrePais))
				.mapToDouble(c->c.getTemperaturaMedia())
				.average()
				;
	}
	

}
