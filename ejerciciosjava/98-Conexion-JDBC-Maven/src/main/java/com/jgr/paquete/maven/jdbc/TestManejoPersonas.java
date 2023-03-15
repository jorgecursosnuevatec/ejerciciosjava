package main.java.com.jgr.paquete.maven.jdbc;

import java.util.List;

import main.java.com.jgr.paquete.maven.jdbc.modelo.Persona;
import main.java.com.jgr.paquete.maven.jdbc.repositorio.PersonaDAO;



public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando un nuevo objeto de tipo Persona
        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "554456587");
        personaDao.insertar(personaNueva);
        Persona personaNueva2 = new Persona("personaNueva1", "Esparza", "cesparza@mail.com", "554456587");
        personaDao.insertar(personaNueva);
        Persona personaNueva3 = new Persona("personaNueva2", "Esparza", "cesparza@mail.com", "554456587");
        personaDao.insertar(personaNueva);
        Persona personaNueva4 = new Persona("personaNueva3", "Esparza", "cesparza@mail.com", "554456587");
        personaDao.insertar(personaNueva);

        //Modificar un objeto de persona existente
        Persona personaModificar = new Persona(999, "Juan Carlos", "Esparza", "jcesparza@mail.com", "554456587");
        personaDao.actualizar(personaModificar);

        //Eliminar un registro
        Persona personaEliminar = new Persona(999);
        personaDao.eliminar(personaEliminar);
/*        
        //Listado Persona
        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        */
    }
}
