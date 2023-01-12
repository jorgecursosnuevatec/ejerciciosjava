package com.jgr.java.io.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * The Class AccesoJDBC.

* DriverManager-> metodo estatico para conexion bbdd
* Connection->conexion bbdd
* Connection con = DriverManager.getConnection(String cadena,String user,String pwd)
* Connection con = DriverManager.getConnection(String cadena,Properties prop)
* la cadena es jdbc<subprotocolo> :subname
* el subprotocolo es el tipo de bbdd y el subname depende de la bbdd
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
*  El close es obligatorio,podemos hacerlo con un try con recursos o en el finally
*  
*/ 

public class AccesoJDBC {


	public static void main(String[] args) throws SQLException {
		
		var url = "jdbc:mysql://localhost:3306/prueba?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(url, "jorge", "jorge");
			Statement instruccion = conexion.createStatement();	           
			ResultSet resultado = instruccion.executeQuery(sql);
			while(resultado.next()){
				System.out.print("Id Persona: " + resultado.getInt("id_persona"));
				System.out.print(" Nombre: " + resultado.getString("nombre"));
				System.out.print(" Apellido: " + resultado.getString("apellido"));
				System.out.print(" Email: " + resultado.getString("email"));
				System.out.print(" Telefono: " + resultado.getString("telefono"));
				System.out.println("");
			}
			resultado.close();
			instruccion.close();
			conexion.close();
		}catch (SQLException ex) {
			ex.printStackTrace(System.out);
		}


		//resultSet con EXECUTE
		Connection conexion = DriverManager.getConnection(url, "jorge", "jorge");
		String sqlStatement1= "SELECT * from persona";
		Statement st= conexion.createStatement();
		st.execute(sqlStatement1);
		ResultSet rsGet=st.getResultSet();
		while (rsGet.next()) {
			System.out.println("SalidagetResultSet()->"+rsGet.getString("nombre"));
		}
		rsGet.close();
		st.close();
		conexion.close();



		//resultSet con EXECUTEQUERY
		Connection  conexion1 = DriverManager.getConnection(url, "jorge", "jorge");
		Statement st1= conexion1.createStatement();	        
		ResultSet rsExecute=st1.executeQuery(sqlStatement1);

		while(rsExecute.next()) {
			System.out.println("SalidaexecuteQuery()->"+rsExecute.getString("nombre"));
		} 
		rsExecute.close();
		st1.close();
		conexion1.close();

		//cargando variables de la query	        
		String sqlStatement2= "SELECT * from persona WHERE nombre=?";
		Connection  conexion2 = DriverManager.getConnection(url, "jorge", "jorge");
		PreparedStatement ps2= conexion2.prepareStatement(sqlStatement2);	        
		ps2.setString(1, "Carlos3");
		ResultSet rsExecute2=ps2.executeQuery();
		while(rsExecute2.next()) {
			System.out.println("SalidaexecuteQueryPREPAREDSTATEMENT()->"+rsExecute2.getString("nombre"));

		} 
		rsExecute2.close();
		ps2.close();
		conexion2.close();


	}

}
