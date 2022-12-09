package com.jgr.genericos.otro.modelos;

import java.util.Objects;

/**
 * The Class ClaseModelo. esta clase es para que la usemos en cliente y en
 * producto y cuando usemos la interfaz AbstractaListRepositorio tengamos el
 * getId.
 */
public class ClaseModelo {

	/** The id. */
	protected Integer id;

	/** The ultimo id. */
	private static int ultimoId;

	/**
	 * Instantiates a new base entity.
	 */
	public ClaseModelo() {
		this.id = ++ultimoId;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Equals.
	 *
	 * @param o the o
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ClaseModelo base = (ClaseModelo) o;
		return Objects.equals(id, base.id);
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
