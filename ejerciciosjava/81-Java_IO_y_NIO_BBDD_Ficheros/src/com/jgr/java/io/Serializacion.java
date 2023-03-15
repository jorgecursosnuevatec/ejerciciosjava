package com.jgr.java.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.jgr.java.io.modelo.PersonaSerializable;

/**
 * The Class Serializacion.
 * interfaz de java IO
 * Lo hace la maquina virtual, se transforma en unos y ceros para enviarlo 
 * NO CONTIENE METODOS OJO!!!!
 * las clases envoltorio, String y coleccion ya lo implementan
 * los parametros definidos como TRANSIENT no salen
 * 
 * para escribirlo usamos FileOutputStreamEjemplo y ObjectOutputStream para escribirlo
 * para leerlo usamos FileInputStream y ObjetctInputStream para leerlo. OJO QUE HAY QUE CONTROLAR EOFException
 */
public class Serializacion {

	public static void main(String[] args) {
		

		int limite = 5;

		PersonaSerializable per = new PersonaSerializable();

		List<PersonaSerializable> personas = new ArrayList<PersonaSerializable>();

		for(int i=0;i<limite;i++) {

			per = new PersonaSerializable();
			per.setApellido("Apellidos"+i);
			per.setEmail("email@mail"+i+"@correo.com");
			per.setNombre("Nombre"+i);
			per.setTelefono(""+i+i+i+i);
			personas.add(per);			

		}

		String ruta=".\\PersonaSerializable.txt";

		//ESCRITURA DE FICHEROS
		try(FileOutputStream fos= new FileOutputStream(ruta);
				ObjectOutputStream oos= new ObjectOutputStream(fos);){			
			for(PersonaSerializable persona:personas) {
				oos.writeObject(persona);				
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//LECTURA
		//IMPORTANTE QUE NO DA FIN DE FICHERO,HAY QUE CONTROLAR EOFException
		try(FileInputStream fis= new FileInputStream(ruta);
				ObjectInputStream ois= new ObjectInputStream(fis);){		
			PersonaSerializable personaLeida = (PersonaSerializable) ois.readObject();
			for(;;) {
				System.out.println("\nPersona leida->"+personaLeida);
				personaLeida = (PersonaSerializable) ois.readObject();
			}

		} catch (EOFException exc) {
			System.out.println("*****Hemos llegado al fin fichero********");			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
