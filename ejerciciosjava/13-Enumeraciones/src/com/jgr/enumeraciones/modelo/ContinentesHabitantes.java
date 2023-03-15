package com.jgr.enumeraciones.modelo;


/**
 * The Enum Continentes.
 */
public enum ContinentesHabitantes {
	 
 	/** The africa. */
 	AFRICA(53,"1 persona"),
	    
    	/** The europa. */
    	EUROPA(46,"2 persona"),
	    
    	/** The asia. */
    	ASIA(44,"3 persona"),
	    
    	/** The america. */
    	AMERICA(34,"4 persona"),
	    
    	/** The oceania. */
    	OCEANIA(14,"5 persona");
	    
	    /** The paises. */
    	private final int paises;
    	private final String habitantes;
	    
	    /**
    	 * Instantiates a new continentes.
    	 *
    	 * @param paises the paises
    	 */
    	ContinentesHabitantes(int paises,String habitantes){
	        this.paises = paises;
	        this.habitantes=habitantes;
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
    	public String getHabitantes(){
    		return this.habitantes;
    	}
	    
	}

