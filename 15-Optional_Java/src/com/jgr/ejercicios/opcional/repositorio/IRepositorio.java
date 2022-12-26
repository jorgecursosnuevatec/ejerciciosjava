package com.jgr.ejercicios.opcional.repositorio;

import java.util.Optional;

import com.jgr.ejercicios.opcional.modelo.Computador;

public interface IRepositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
