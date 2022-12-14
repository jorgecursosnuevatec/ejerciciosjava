package com.jgr.paquete.maven.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.jgr.paquete.maven.jdbc.modelo.Persona;
import com.jgr.paquete.maven.jdbc.repositorio.PersonaDAO;


/**
 * The Class Lanzadora.
 * conectando con jdbc con MAVEN
 */
public class Lanzadora {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	
	  public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        List<Persona> personas = personaDao.seleccionar();
//        for(Persona persona: personas){
//            System.out.println("persona = " + persona);
//        }
        
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}

