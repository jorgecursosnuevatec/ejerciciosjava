package com.jgr.prog.funcional.y.lambda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.prog.funcional.y.lambda.models.Usuario;

/**
 * The Class InterfazSupplier. Supplier<T> tiene el metodo get,no recibe
 * nada y devuelve un objeto
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html
 * 
 */
public class InterfazSupplier {

	// para extraccion de datos,como el generate de stream
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Arpit";
		System.out.println(supplier.get());

		// simula la conexion con una bbdd
		Supplier<Connection> sp = () -> {
			String cad = "cadena conexion";
			String user = "usuario";
			String pwd = "pasword";
			Connection con = null;
			try {
				con = DriverManager.getConnection(cad, user, pwd);
			} catch (SQLException e) {

				e.printStackTrace();
			}
			return con;
		};
		
		  Supplier<String> proveedor = () -> "Hola mundo lambda supplier";
	        System.out.println(proveedor.get());
		
		Connection cn = sp.get();

		Supplier<Usuario> creaUsuario = Usuario::new;
		Usuario usuario = creaUsuario.get();

		/*
		 
		 * 
		 * List<Integer> lista = new ArrayList<>();
		 * 
		 * long inicio = System.currentTimeMillis(); long termino = (long)
		 * (System.currentTimeMillis()+(5));
		 * 
		 * 
		 * do { System.out.println("entro en while-> "+ inicio + " / "+termino);
		 * 
		 * // no recibe nada y genera una serie de numeros aleatorios lista =
		 * Stream.generate( () -> (int) (Math.random() * 500 -
		 * 1)).limit(10).collect(Collectors.toList());
		 * 
		 * }while (System.currentTimeMillis()<termino) ;
		 * 
		 * lista.forEach(System.out::println);
		 * 
		 */
	}

}
