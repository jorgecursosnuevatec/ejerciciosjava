package com.jgr.genericos.otro.modelos.repositorio;

/**
 * The Interface OrdenablePaginableCrudRepositorio.
 *
 * @param <T> the generic type
 */
public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
                        PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {
}
