/**
 * 
 */
package com.jgr.ejercicio.ciudades.test.servicio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

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
		c1.setNombreCiudad("NombreCiudadInicial");
		c1.setPaisCiudad("PaisCiudad");
		c1.setHabitantesCiudad(1.0);
		c1.setTemperaturaMedia(1.0);

	}

	@Test
	@Order(3)
	@DisplayName("Prueba de alta ciudad")
	void testAltaCiudad() {
		
		//lista de ciudades debe estar vacia
		assertEquals(ciudadService.listaCiudades().size(),0,
				()->"El numero de ciudades deberia ser 0->"+
				ciudadService.listaCiudades().size());
		
		//debe haber al menos una ciudad
		ciudadService.altaCiudad(c1);				
		assertTrue(ciudadService.listaCiudades().size()==1,
				()->"El numero de ciudades deberia ser 1->"+
				ciudadService.listaCiudades().size());
		
		//no tiene que dejar dar de alta la misma
		ciudadService.altaCiudad(c1);				
		assertTrue(ciudadService.listaCiudades().size()==1,
				()->"El numero de ciudades deberia ser 1->"+
				ciudadService.listaCiudades().size());
		
		//damos de alta otra ciudad distinta,debe guardarse tambien
		c2= new Ciudad("NombreCiudad2","PaisCiudad",1000.0,-99.0);		
		ciudadService.altaCiudad(c2).get();		
		assertTrue(ciudadService.listaCiudades().size()==2
				,()->"El numero de ciudades deberia ser 2->"+
				ciudadService.listaCiudades().size());
	}

	/**
	 * Test method for {@link com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl#altaCiudades(java.util.List)}.
	 */
	@Test
	@DisplayName("Prueba de alta de un array de ciudades")
	void testAltaCiudades() {
		
		//lista a cargar no debe estar vacia
		assertNotNull(ciudades,
				()->"No se han dado bien de alta las ciudades en el foreach");
		
		//lista de servicio no debe ser nula
		assertNotNull(ciudadService.listaCiudades(),
				()->"No se han dado bien de alta las ciudades en el foreach");

		//lista de ciudades de la capa servicio debe estar a cero
		assertEquals(ciudadService.listaCiudades().size(),0
				,()->"El numero de ciudades deberia ser 0->"+
				ciudadService.listaCiudades().size());

		//debe coincidir el numero de ciudades dadas de alta
		ciudadService.altaCiudades(ciudades);
		assertTrue(ciudades.size()==ciudadService.listaCiudades().size(),
				()->"El numero de ciudades deberia ser igual->"+
				ciudadService.listaCiudades().size() +" no es igual que los dados de alta->"+ciudades.size());
		
		//lo que hemos cargado debe ser igual que lo que recibimos
		assertEquals(this.ciudades,ciudadService.listaCiudades(),
				()->"No se han dado de alta las ciudades correctamente");
		
		//damos de alta otra lista de ciudades,no debe darse de alta ninguno porque ya existen todos
		ciudadService.altaCiudades(ciudades);
		assertTrue(ciudades.size()==ciudadService.listaCiudades().size(),
				()->"El numero de ciudades deberia ser igual->"+
				ciudadService.listaCiudades().size() +" no es igual que los dados de alta->"+ciudades.size());
	}

	/**
	 * Test method for {@link com.jgr.ejercicio.ciudades.servicio.CiudadServiceImpl#numCiudadesPais(java.lang.String)}.
	 */
	@Test
	@DisplayName("Numero de ciudades por pais")
	void testNumCiudadesPais() {

		//lista a cargar no debe estar vacia
		assertNotNull(ciudades,()->"No se han dado bien de alta las ciudades en el foreach");

		//lista de ciudades de la capa servicio debe estar a cero
		assertEquals(ciudadService.listaCiudades().size(),0
				,()->"El numero de ciudades deberia ser 0->"+
				ciudadService.listaCiudades().size());
		
		//damos de alta la lista de 
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
	@DisplayName("Busqueda de la ciudad ms poblada")
	void testCiudadMasPoblada() {

		//lista de ciudades de la capa servicio debe estar a cero
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
	@DisplayName("Busqueda de ciudad por nombre y pais")
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
	@DisplayName("Busqueda por filtro predicate")
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
	//doy de alta ciudades,tb deberia encontrarla
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
	@DisplayName("Busqueda de la ciudad mas fria")
	void testBuscaCiudadMasFria() {
		
		//no hay nada dado de alta,lo sabemos con el ispresent
		assertFalse(ciudadService.buscaCiudadMasFria().isPresent()
				,()->"Pues no deberia haber nada");
		
		ciudadService.altaCiudad(c1);
		
		//de la lista de ciudades busco la que se llama igual
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
	@DisplayName("Lista de ciudades")
	void testlistaCiudades() {
		
		// lista de ciudades no debe ser nula
		assertNotNull(ciudadService.listaCiudades(),
				() -> "La lista no deberia ser nula->" + ciudadService.listaCiudades().size());

		// lista de ciudades de la capa servicio debe estar a cero
		assertEquals(ciudadService.listaCiudades().size(), 0,
				() -> "El numero de ciudades deberia ser 0->" + ciudadService.listaCiudades().size());

		ciudadService.altaCiudades(ciudades);

		// debe coincidir el numero de ciudades dadas de alta
		assertTrue(ciudades.size() == ciudadService.listaCiudades().size(),
				() -> "El numero de ciudades deberia ser igual->" + ciudadService.listaCiudades().size()
						+ " no es igual que los dados de alta->" + ciudades.size());

		// lo que hemos cargado debe ser igual que lo que recibimos
		assertEquals(this.ciudades, ciudadService.listaCiudades(),
				() -> "No se han dado de alta las ciudades correctamente");
		
	}
	
	@Test
	@DisplayName("Compara iguales")
	void testEquals(){
		
		c2=c1;
		assertTrue(c1.equals(c2),
				()->"Deberian ser iguales->"+ c1.toString()+ "/"+ c2.toString());
		
		c2.setNombreCiudad("Nombre cambiado");
		
		//este si es verdad, porque apuntan a la misma direccion de memoria
		assertTrue(c1.equals(c2),
		()->"NO Deberian ser iguales C1->"+ c1.toString()+ "/C2->"+ c2.toString());
		
	}
	
	@Test
	@DisplayName("Borra Ciudad Por Nombre")
	void testborraCiudadPorNombre(){
		
		// debe coincidir el numero de ciudades dadas de alta
		ciudadService.altaCiudades(ciudades);
		assertTrue(ciudades.size() == ciudadService.listaCiudades().size(),
				() -> "El numero de ciudades deberia ser igual->" + ciudadService.listaCiudades().size()
						+ " no es igual que los dados de alta->" + ciudades.size());
		
		//doy de alta un pais nuevo y verifico que lo ha dado de alta
		c1.setNombreCiudad("NOMBRE CIUDAD NUEVA");
		c1.setNombreCiudad("NOMBRE PAIS NUEVO");
		ciudadService.altaCiudad(c1);		
		assertTrue(ciudades.size()+1 == ciudadService.listaCiudades().size(),
				() -> "El numero de ciudades deberia ser igual->" + ciudadService.listaCiudades().size()
						+ " no es igual que los dados de alta->" + ciudades.size());
		
		//lo borro, ahora tiene que haber el mismo numero de registros que antes de darla de alta
		ciudadService.borraCiudadPorNombre(c1.getNombreCiudad());
		assertTrue(ciudades.size() == ciudadService.listaCiudades().size(),
				() -> "El numero de ciudades deberia ser igual->" + ciudadService.listaCiudades().size()
						+ " no es igual que los dados de alta->" + ciudades.size());
		//no debemos encontrarlo
		assertFalse(ciudadService.buscaCiudadPorNombreYPais(c1.getNombreCiudad(), c1.getPaisCiudad()).isPresent(),
				() -> "No deberia existir" + ciudadService.buscaCiudadPorNombreYPais(c1.getNombreCiudad(), c1.getPaisCiudad()).get()
				);
				
	}
	
	@Test
	@DisplayName("Obtiene total de paises")
	void testobtieneTotalPaises() {
		// lista a cargar no debe estar vacia
		assertNotNull(ciudades, 
				() -> "No se han dado bien de alta las ciudades en el foreach");

		// lista de servicio no debe ser nula
		assertNotNull(ciudadService.listaCiudades(), 
				() -> "No se han dado bien de alta las ciudades en el foreach");

		// lista de ciudades de la capa servicio debe estar a cero
		assertEquals(ciudadService.listaCiudades().size(), 0,
				() -> "El numero de ciudades deberia ser 0->" + ciudadService.listaCiudades().size());
		
		//como no hay nada debe devolver cero
		assertEquals(ciudadService.obtieneTotalPaises(), 0.0,
				() -> "El numero de paises distintos deberia ser 0->" + ciudadService.obtieneTotalPaises());

		//ahora debe devolver una
		ciudadService.altaCiudad(c1);
		assertEquals(ciudadService.obtieneTotalPaises(), 1.0,
				() -> "El numero de paises distintos deberia ser 1->" + ciudadService.obtieneTotalPaises());
		
		//ahora debe devolver dos
		c2= new Ciudad();
		c2.setHabitantesCiudad(1.0);
		c2.setNombreCiudad("NombreCiudadtestobtieneTotalPaises");
		c2.setPaisCiudad("PaisciudadtestobtieneTotalPaises");
		c2.setTemperaturaMedia(99.0);
		ciudadService.altaCiudad(c2);		
		assertEquals(ciudadService.obtieneTotalPaises(), 2.0,
				() -> "El numero de paises distintos deberia ser 2->" + ciudadService.obtieneTotalPaises());

	}
		@Test
		@DisplayName("Temperatura media pais")
		void testemperaturaMediaPais(){
			
			c1.setTemperaturaMedia(1.0);
			ciudadService.altaCiudad(c1);
			assertEquals(ciudadService.temperaturaMediaPais(c1.getPaisCiudad()).getAsDouble(), 1.0,
					() -> "La temperatura media deberia ser 1->" + ciudadService.temperaturaMediaPais(c1.getPaisCiudad()).getAsDouble());
			
			
		

	}
	
	@Test
    @EnabledOnJre(JRE.JAVA_9)
	@DisplayName("Ejecuta en java 9")
    void onJava9() {
        System.out.println("Run this on Java 9");
    }
	
	@Test
	@EnabledOnJre({JRE.JAVA_11, JRE.JAVA_17})
	@DisplayName("Ejecuta en java 11 O 17")
	void onJava17() {
		System.out.println("Run this on Java 17");
	}

    @Test
    @EnabledOnJre({JRE.JAVA_12, JRE.JAVA_13})
	@DisplayName("Ejecuta en java 12 y 13 ")
    void onJava12OrJava13() {
        System.out.println("Run this on Java 12 or Java 13");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_9)
    @DisplayName("NO ejecuta en java 9")
    void notOnJava9() {
        System.out.println("Do not run this on Java 9");
    }
    
    @Test
    @EnabledIfEnvironmentVariable(named = "PROCESSOR_IDENTIFIER", matches = ".*Intel64 Family 6.*")
    void onIntel64() {
        System.out.println("Run this on Intel6 Family 6 only.");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "8")
    void onProcessor8() {
        System.out.println("Run this if it has 8 processors.");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "CURRENT_ENV", matches = ".*development.*")
    void notOnDeveloperPC() {
        System.out.println("Do not run this if env variables 'CURRENT_ENV' matches .*development.* ");
    }

    //variables de entorno
    @Test
    void printEnvironmentProperties() {
        Map<String, String> env = System.getenv();
        env.forEach((k, v) -> System.out.println(k + ":" + v));
    }
   


}
