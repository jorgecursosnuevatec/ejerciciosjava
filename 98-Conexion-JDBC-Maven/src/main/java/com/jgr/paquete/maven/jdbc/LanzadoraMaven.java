package com.jgr.paquete.maven.jdbc;

import java.util.List;

import com.jgr.paquete.maven.jdbc.modelo.Persona;
import com.jgr.paquete.maven.jdbc.repositorio.PersonaDAO;


/**
 * The Class LanzadoraMaven.
 * conectando con jdbc con MAVEN
 * DriverManager-> metodo estatico para conexion bbdd
 * Connection->conexion bbdd
 * Connection con = DriverManager.getConnection(String cadena,String user,String pwd)
 * Connection con = DriverManager.getConnection(String cadena,Properties prop)
 * la cadena es jdbc<subprotocolo> :subname
 * ej->jdbc:mysql://localhost:3306/mydata
 * 	   jdbc:oracle:thin@localhost:1521/servicedata  	
 * 
 * 
 * 
 * Statement->consultas sql
 *	Cuando nosotros construimos una consulta normal de JDBC utilizamos un Statement, 
 *	este Statement o sentencia lo que se encarga es de definir una consulta SQL a ejecutar contra 
 *	el motor de la base de datos
 *	ej->
 *		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root","root"); 
 *		String nombre="pepe"; 
 *		String consulta = "select * from Persona where nombre='"+nombre+"'";
 *		Statement st = conexion.createStatement();
 *		st.execute(consulta);
 *	    ResultSet rs = st.getResultSet();
 *
 * 		String inserta ="insert into tabla(col1,col2) values(?,?)";
 * 		PreparedStatement st = con.prepareStatement(inserta);
 * 		st.setInt(1,20);
 * 		st.setString("nombre");
 * 		ResultSet rs = st.executeQuery(inserta);
 * 
 * 
 *	Para sentencias sencillas que solo vamos a usar una vez. Ejemplo típico son la creación o update de
 * 	las tablas cuando arrancamos	nuestra aplicación o algún SELECT al inicio de 
 * 	la aplicación para verificar algo, como el número de versión de las tablas
 *	para cada consulta SQL que construimos contra la base de datos se construye un plan de ejecución
 * 	en el que la base de datos decide como esa consulta se ejecuta.
 * 	es adecuada para consultas DDL como  CREATE , ALTER y DROP
 *	no se puede usar para almacenar y recuperar archivos y matrices
 *
 *
 * PreparedStatement->alternativa a statement,precompila consultas SQL
 * ej->
 * 		String consulta = "select * from Persona where nombre = ? ";
 * 		Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "root"); 
 * 		PreparedStatement ps= conexion.prepareStatement(consulta); 
 * 		ps.setString(1, "pepe");
 * 		ResultSet rs = ps.executeQuery();
 * 		
 
 * 		
 *  la base de datos genera un hash para el plan de ejecución ambas consultas
 * 	devuelven el mismo hash y comparten el plan de ejecución
 *  evitando que nos inyecten SQL ya que al parametrizar la consulta el API de JDBC nos
 *  protege contra las este tipo de ataques.
 *  La SQL se escribe con un String, pero poniendo ? en el lugar donde van las variables. Algo como
 *	«INSERT INTO tabla(nombre) VALUES (?)»
 * Tiene métodos para vincular varios tipos de objetos , incluidos archivos y matrices.
 *  
 * 
 * ResultSet->tratamiento resultados
 * 
 * CallableStatement->hereda de PreparedStatement,
 * Tiene una sintaxis propia, no SQL, para la llamada a procedimientos y funciones de base de datos.
 * debemos ponerlo entre llaves
 * {call un_procedimiento (?,?) }
 * {? = call una_funcion (?,?,?} 
 *  
 *  DESDE JDBC4 NO HACE FALTA cargar el Driver el Class.forName("com.mysql.jdbc.Driver"), es decir desde
 *  java 6;
 *  
 */
public class LanzadoraMaven {

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

