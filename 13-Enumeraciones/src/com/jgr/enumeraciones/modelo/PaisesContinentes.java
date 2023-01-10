package com.jgr.enumeraciones.modelo;


/**
 * The Enum PaisesContinentes.
 * 
 * con name recuperariamos el nombre del contiente
 * con value recuperamos los valores de los paises puede tener cada continente
 * 
 */
public enum PaisesContinentes {
	 
 	/** The africa. */
 	AFRICA("Marruecos", "Senegal", "Tunez"),
	    
    	/** The europa. */
    	EUROPA("España", "Inglaterra", "Italia"),
	    
    	/** The asia. */
    	ASIA("China", "India", "Tailandia"),
	    
    	/** The america. */
    	AMERICA("Colombia", "Peru", "Mexico"),
	    
    	/** The oceania. */
    	OCEANIA("New Zelanda");

	    /** The paises. */
    	private final String[] paises;

	    /**
    	 * Instantiates a new paises continentes.
    	 * Para cada continente guarda los paises que hemos definido
    	 *
    	 * @param paises the paises
    	 */
    	PaisesContinentes(String... paises) {
	        this.paises = paises;
	    }

	    /**
    	 * Gets the paises.
    	 *
    	 * @return the paises
    	 */
    	public String[] getPaises() {
	        return paises;
	    }

	    /**
    	 * To string.
    	 *
    	 * @return the string
    	 */
    	@Override
	    public String toString() {
	        StringBuffer paises = new StringBuffer();
	        for(var pais: this.paises){
	            paises.append(pais).append(" ");
	        }
	        return "paises = " + paises.toString();
	    }
	}