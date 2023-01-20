package com.jgr.ejercicio.ciudades.modelo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ciudad {
	
	private String nombreCiudad;
	private String paisCiudad;
	private Double habitantesCiudad;
	private Double temperaturaMedia;
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		
		return nombreCiudad.equalsIgnoreCase(other.nombreCiudad) && paisCiudad.equalsIgnoreCase(other.paisCiudad);
		
	}
	
	

}
