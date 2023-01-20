/**
 * 
 */
package com.jgr.ejercicio.ciudades.test.servicio;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;
import com.jgr.ejercicio.ciudades.modelo.Ciudad;
import com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl;
import com.jgr.ejercicio.ciudades.servicio.ICiudadService;

/**
 * @author manana
 *
 */
class CiudadServiceImplTest {
	
	private Faker fake;
	
	private final int limite =5;
	private Ciudad c1;
	private Ciudad c2;
	
	private List<Ciudad> ciudades;
	
	private ICiudadService ciudadService;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		ciudades= new ArrayList<Ciudad>();
		ciudadService = new CiudadServiceImpl();
		
		for (int i=0;i<limite;i++) {
			fake = new Faker();
			c1 = new Ciudad();
			c1.setNombreCiudad(fake.address().cityName());
			c1.setPaisCiudad(fake.address().country());
			c1.setHabitantesCiudad(fake.random().nextDouble());
			c1.setTemperaturaMedia(fake.number().randomDouble(2, -15, 50));
			ciudades.add(c1);			
		}
		
		
		c1 = new Ciudad();
		c1.setNombreCiudad("NombreCiudad");
		c1.setPaisCiudad("PaisCiudad");
		c1.setHabitantesCiudad(1.0);
		c1.setTemperaturaMedia(1.0);
		
//		com.jgr.ejercicio.ciudades.ciudades.forEach(System.out::println);
				

	}

	@Test
	void testAltaCiudad() {
		
		//lista de com.jgr.ejercicio.ciudades.ciudades debe estar vacia
		assertEquals(ciudadService.listaCiudades().size(),0,()->"El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser 0->"+
				ciudadService.listaCiudades().size());
		
		//debe haber al menos una ciudad
		ciudadService.altaCiudad(c1);				
		assertTrue(ciudadService.listaCiudades().size()==1,()->"El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser 1->"+
				ciudadService.listaCiudades().size());
		//no tiene que dejar dar de alta la misma
		ciudadService.altaCiudad(c1);				
		assertTrue(ciudadService.listaCiudades().size()==1,()->"El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser 1->"+
				ciudadService.listaCiudades().size());
		
	}

	/**
	 * Test method for {@link com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl#altaCiudades(java.util.List)}.
	 */
	@Test
	void testAltaCiudades() {
		
		//lista a cargar no debe estar vacia
		assertNotNull(ciudades,()->"No se han dado bien de alta las com.jgr.ejercicio.ciudades.ciudades en el foreach");

		//lista de com.jgr.ejercicio.ciudades.ciudades de la capa com.jgr.ejercicio.ciudades.servicio debe estar a cero
		assertEquals(ciudadService.listaCiudades().size(),0
				,()->"El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser 0->"+
				ciudadService.listaCiudades().size());
		
		ciudadService.altaCiudades(ciudades);
		
		//debe coincidir el numero de com.jgr.ejercicio.ciudades.ciudades dadas de alta		
		assertTrue(ciudades.size()==ciudadService.listaCiudades().size(),()->"El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser igual->"+
				ciudadService.listaCiudades().size() +" no es igual que los dados de alta->"+ciudades.size());
		
		//lo que hemos cargado debe ser igual que lo que recibimos
		assertEquals(this.ciudades,ciudadService.listaCiudades(),
				()->"No se han dado de alta las com.jgr.ejercicio.ciudades.ciudades correctamente");
		
				
	}

	/**
	 * Test method for {@link com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl#numCiudadesPais(java.lang.String)}.
	 */
	@Test
	void testNumCiudadesPais() {

		//lista a cargar no debe estar vacia
		assertNotNull(ciudades,()->"No se han dado bien de alta las com.jgr.ejercicio.ciudades.ciudades en el foreach");

		//lista de com.jgr.ejercicio.ciudades.ciudades de la capa com.jgr.ejercicio.ciudades.servicio debe estar a cero
		assertEquals(ciudadService.listaCiudades().size(),0
				,()->"El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser 0->"+
				ciudadService.listaCiudades().size());
		
		ciudadService.altaCiudades(ciudades);		
		assertTrue(ciudadService.numCiudadesPorPais("Neverland")==0,
				()->"Neverland no deberia existir como pais");
		
		ciudadService.altaCiudad(c1);
		assertTrue(ciudadService.numCiudadesPorPais(c1.getPaisCiudad())==1.0,
				()->"Neverland deberia existir como pais");
		
		
		
	}

	/**
	 * Test method for {@link com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl#buscaCiudadMasPoblada()}.
	 */
	@Test
	void testCiudadMasPoblada() {

		//lista de com.jgr.ejercicio.ciudades.ciudades de la capa com.jgr.ejercicio.ciudades.servicio debe estar a cero
		assertFalse(ciudadService.buscaCiudadMasPoblada().isPresent()
				,()->"No deberia haber nada->"+
						ciudadService.buscaCiudadMasPoblada().get());
		
		c2=c1;		
		c2.setNombreCiudad("Nombre de la ciudad c2");
		c2.setHabitantesCiudad(Double.MAX_VALUE);
		ciudadService.altaCiudad(c1);
		ciudadService.altaCiudad(c2);
		ciudadService.altaCiudades(ciudades);
		//deberia encontrar la ciudad c2
		assertEquals(c2,ciudadService.buscaCiudadMasPoblada().get(),
				()->"Deberia haber encontrado->"+c2 + " y no->"+ ciudadService.buscaCiudadMasPoblada().get());
		
		
	}

	/**
	 * Test method for {@link com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl#buscaCiudadPorNombreYPais(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testBuscaCiudadPorNombreYPais() {
		c2=c1;		
		c2.setNombreCiudad("Nombre de la ciudad c2");
		c2.setHabitantesCiudad(Double.MAX_VALUE);
		ciudadService.altaCiudad(c1);
		ciudadService.altaCiudad(c2);
		ciudadService.altaCiudades(ciudades);
		//deberia encontrar la ciudad c2
		

		assertEquals(c2,
				ciudadService.buscaCiudadPorNombreYPais(c2.getNombreCiudad(),
						c2.getPaisCiudad()).get(),
				()->"Deberia haber encontrado->"+c2 +
				" y no->"+ ciudadService.buscaCiudadPorNombreYPais(c2.getNombreCiudad(), c2.getPaisCiudad()).get());	}

	/**
	 * Test method for {@link com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl#buscaCiudadPorFiltro(java.util.function.Predicate)}.
	 */
	@Test
	void testBuscaCiudadPorFiltro() {
		
	ciudadService.altaCiudad(c1);
	
	//busco por nombre
	assertEquals(c1, 
			ciudadService
			.buscaCiudadPorFiltro(c->c.getNombreCiudad().equals(c1.getNombreCiudad())).get(),
			()->"Ciudad No encontrada"+c1);

	//busco por habitantes
	assertEquals(c1, 
			ciudadService
			.buscaCiudadPorFiltro(c->c.getHabitantesCiudad().equals(c1.getHabitantesCiudad())).get(),
			()->"Ciudad No encontrada"+c1);
	
	assertSame(c1, 
			ciudadService
			.buscaCiudadPorFiltro(c->c.getHabitantesCiudad().equals(c1.getHabitantesCiudad())).get(),
			()->"Ciudad No encontrada"+c1);
	
	
	//busco por pais
	assertEquals(c1, 
			ciudadService
			.buscaCiudadPorFiltro(c->c.getPaisCiudad().equals(c1.getPaisCiudad())).get(),
			()->"Ciudad No encontrada"+c1);
	
	//busco por temperatura
	assertEquals(c1, 
			ciudadService
			.buscaCiudadPorFiltro(c->c
					.getTemperaturaMedia()
					.equals(c1.getTemperaturaMedia()))
			.get(),
			()->"Ciudad No encontrada"+c1);
	
	//busco por todo
	Predicate<Ciudad> pred = c->(c.getTemperaturaMedia()
			.equals((c1.getTemperaturaMedia())))
			&&(c.getNombreCiudad()
					.equals((c1.getNombreCiudad())))
			&&(c.getPaisCiudad()
					.equals((c1.getPaisCiudad())))
			&&(c.getHabitantesCiudad()
					.equals((c1.getHabitantesCiudad())));
	
	c2=ciudadService.buscaCiudadPorFiltro(pred).get();

	
	assertEquals(c1, 
			ciudadService
			.buscaCiudadPorFiltro(pred).get()		
			,
			()->"Ciudad No encontrada"+c1);
	//doy de alta com.jgr.ejercicio.ciudades.ciudades,tb deberia encontrarla
	ciudadService.altaCiudades(ciudades);
	assertEquals(c1, 
			ciudadService
			.buscaCiudadPorFiltro(pred).get()		
			,
			()->"Ciudad No encontrada despues de dar de alta la lista"+c1);
	
	
	
	
	}

	/**
	 * Test method for {@link com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl#buscaCiudadMasFria()}.
	 */
	@Test
	void testBuscaCiudadMasFria() {
		
		//no hay nada dado de alta,lo sabemos con el ispresent
		assertFalse(ciudadService.buscaCiudadMasFria().isPresent()
				,()->"Pues no deberia haber nada");
		
		ciudadService.altaCiudad(c1);
		
		//de la lista de com.jgr.ejercicio.ciudades.ciudades busco la que se llama igual
		assertTrue(
		ciudadService.buscaCiudadPorFiltro(c->c.getNombreCiudad().equals(c1.getNombreCiudad()))
		.get()//otengo la temperatura media
		.equals(ciudadService.buscaCiudadMasFria().get()),()->"Pues no coincide la temperatura media"
		);
		
		//creo una nueva ciudad, y le pongo el valor mas bajo posible de temperatura
		c2=c1;
		
		c2.setNombreCiudad("NOMBRE CIUDAD PARA PRUEBAS");
		c2.setTemperaturaMedia(Double.MAX_VALUE);
		ciudadService.altaCiudad(c2);
		
	}
	@Test
	void testlistaCiudades() {
		
		// lista de com.jgr.ejercicio.ciudades.ciudades debe estar vacia
		assertEquals(ciudadService.listaCiudades().size(), 0,
				() -> "El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser 0->" + ciudadService.listaCiudades().size());

		// lista de com.jgr.ejercicio.ciudades.ciudades de la capa com.jgr.ejercicio.ciudades.servicio debe estar a cero
		assertEquals(ciudadService.listaCiudades().size(), 0,
				() -> "El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser 0->" + ciudadService.listaCiudades().size());

		ciudadService.altaCiudades(ciudades);

		// debe coincidir el numero de com.jgr.ejercicio.ciudades.ciudades dadas de alta
		assertTrue(ciudades.size() == ciudadService.listaCiudades().size(),
				() -> "El numero de com.jgr.ejercicio.ciudades.ciudades deberia ser igual->" + ciudadService.listaCiudades().size()
						+ " no es igual que los dados de alta->" + ciudades.size());

		// lo que hemos cargado debe ser igual que lo que recibimos
		assertEquals(this.ciudades, ciudadService.listaCiudades(),
				() -> "No se han dado de alta las com.jgr.ejercicio.ciudades.ciudades correctamente");
		
	}

}
