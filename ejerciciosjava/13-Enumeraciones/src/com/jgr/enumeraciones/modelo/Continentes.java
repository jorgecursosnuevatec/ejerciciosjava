package com.jgr.enumeraciones.modelo;


/**
 * The Enum Continentes.
 */
public enum Continentes {
	 
 	/** The africa. */
 	AFRICA(53),
	    
    	/** The europa. */
    	EUROPA(46),
	    
    	/** The asia. */
    	ASIA(44),
	    
    	/** The america. */
    	AMERICA(34),
	    
    	/** The oceania. */
    	OCEANIA(14);
	    
	    /** The paises. */
    	private final int paises;
	    
	    /**
    	 * Instantiates a new continentes.
    	 *
    	 * @param paises the paises
    	 */
    	Continentes(int paises){
	        this.paises = paises;
	    }
	    
	    /**
    	 * Gets the paises.
    	 * 
    	 *
    	 * @return the paises
    	 */
    	public int getPaises(){
	        return this.paises;
	    }
	    
	}

