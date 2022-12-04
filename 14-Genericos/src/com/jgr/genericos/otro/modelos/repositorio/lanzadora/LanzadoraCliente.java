package com.jgr.genericos.otro.modelos.repositorio.lanzadora;

import java.util.List;

import com.jgr.genericos.otro.modelos.Cliente;
import com.jgr.genericos.otro.modelos.repositorio.Direccion;
import com.jgr.genericos.otro.modelos.repositorio.OrdenablePaginableCrudRepositorio;
import com.jgr.genericos.otro.modelos.repositorio.excepciones.AccesoDatoException;
import com.jgr.genericos.otro.modelos.repositorio.excepciones.EscrituraAccesoDatoException;
import com.jgr.genericos.otro.modelos.repositorio.excepciones.LecturaAccesoDatoException;
import com.jgr.genericos.otro.modelos.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import com.jgr.genericos.otro.modelos.repositorio.lista.ClienteListRepositorio;

// TODO: Auto-generated Javadoc
/**
 * The Class LanzadoraCliente.
 */
public class LanzadoraCliente {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		try {
			OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
			repo.crear(new Cliente("Jano", "Pérez"));
			repo.crear(new Cliente("Bea", "González"));
			repo.crear(new Cliente("Luci", "Martínez"));
			Cliente andres = new Cliente("Andrés", "Guzmán");
			repo.crear(andres);
			// repo.crear(andres);

			// repo.crear(null);

			List<Cliente> clientes = repo.listar();
			clientes.forEach(System.out::println);
			System.out.println("===== paginable =====");
			List<Cliente> paginable = repo.listar(1, 4);
			paginable.forEach(System.out::println);

			System.out.println("===== ordenar =====");
			List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
			for (Cliente c : clientesOrdenAsc) {
				System.out.println(c);
			}

			System.out.println("===== editar =====");
			Cliente beaActualizar = new Cliente("Bea", "Mena");
			beaActualizar.setId(2);
			repo.editar(beaActualizar);
			Cliente bea = repo.porId(2);
			System.out.println(bea);
			System.out.println(" ============= ");
			repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
			System.out.println("===== eliminar ======");
			repo.eliminar(3);
			repo.listar().forEach(System.out::println);
			System.out.println("===== total ===== ");
			System.out.println("Total registros: " + repo.total());
		} catch (RegistroDuplicadoAccesoDatoException e) {
			System.out.println("Registro Duplicado: " + e.getMessage());
			e.printStackTrace();
		} catch (LecturaAccesoDatoException e) {
			System.out.println("Lectura: " + e.getMessage());
			e.printStackTrace();
		} catch (EscrituraAccesoDatoException e) {
			System.out.println("Escritura: " + e.getMessage());
			e.printStackTrace();
		} catch (AccesoDatoException e) {
			System.out.println("Generica: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
