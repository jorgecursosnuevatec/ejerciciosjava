package com.jgr.genericos.otro.lanzadora;

import java.util.List;

import com.jgr.genericos.otro.modelos.Producto;
import com.jgr.genericos.otro.modelos.repositorio.Direccion;
import com.jgr.genericos.otro.modelos.repositorio.OrdenablePaginableCrudRepositorio;
import com.jgr.genericos.otro.modelos.repositorio.excepciones.AccesoDatoException;
import com.jgr.genericos.otro.modelos.repositorio.excepciones.LecturaAccesoDatoException;
import com.jgr.genericos.otro.modelos.repositorio.lista.ProductoListRepositorio;

public class LanzadoraProducto {
	 public static void main(String[] args) {

	        try {
	            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
	            repo.crear(new Producto("mesa", 50.52));
	            repo.crear(new Producto("silla", 18));
	            repo.crear(new Producto("lampara", 15.5));
	            repo.crear(new Producto("notebook", 400.89));

	            List<Producto> productos = repo.listar();
	            productos.forEach(System.out::println);
	            System.out.println("===== paginable =====");
	            List<Producto> paginable = repo.listar(1, 4);
	            paginable.forEach(System.out::println);

	            System.out.println("===== ordenar =====");
	            List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
	            for (Producto c : productosOrdenAsc) {
	                System.out.println(c);
	            }

	            System.out.println("===== editar =====");
	            Producto lamparaActualizar = new Producto("lampara escritorio", 23);
	            lamparaActualizar.setId(3);
	            repo.editar(lamparaActualizar);
	            Producto lampara = repo.porId(3);
	            System.out.println(lampara);
	            System.out.println(" ============= ");
	            repo.listar("precio", Direccion.ASC).forEach(System.out::println);
	            System.out.println("===== eliminar ======");
	            repo.eliminar(2);
	            repo.listar().forEach(System.out::println);
	            System.out.println("===== total ===== ");
	            System.out.println("Total registros: " + repo.total());
	        } catch (LecturaAccesoDatoException e) {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        } catch (AccesoDatoException e) {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        }
	    }
	}
