package com.jgr.ejercicios.opcional.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.jgr.ejercicios.opcional.modelo.Computador;
import com.jgr.ejercicios.opcional.modelo.Fabricante;
import com.jgr.ejercicios.opcional.modelo.Procesador;

/**
 * The Class ComputadorRepositorio.
 */
public class ComputadorRepositorio implements IRepositorio<Computador> {
    
    /** The data source. */
    private List<Computador> dataSource;

    /**
     * Instantiates a new computador repositorio.
     */
    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus ROG", "Strix G512");
        asus.setProcesador(proc);
        dataSource.add(asus);
        dataSource.add(new Computador("MacBook Pro", "MVVK2CI"));
    }

    /**
     * Filtrar.
     *
     * @param nombre the nombre
     * @return the optional
     */
    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();//el findFirst devuelve un optional
        
        //DEVUELVE UN OPTIONAL CON EL VALOR O VACIO DEPENDIENDO DE SI LO ENCUENTRA O NO
        /*for(Computador c: dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }

}
