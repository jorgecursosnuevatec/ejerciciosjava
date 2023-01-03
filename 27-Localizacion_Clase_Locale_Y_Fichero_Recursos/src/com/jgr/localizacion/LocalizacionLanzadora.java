package com.jgr.localizacion;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * The Class LocalizacionLanzadora.
 * Aplicaciones desarrolladas para multiples idiomas/localizaciones geograficas
 * los textos se guardan en archivos de recursos cargados dinamicamente en EJECUCION 
 * 
 * para cada idioma se crea un archivo .properties con parejas clave-valor
 * nombrearchivo_prefijo.properties
 * El codigo de prefijo segun la norma ISO 639-1
 * 
 *  Locale es la clase que se usa para establecer la localizacion/idioma
 *  
 *  Locale(String idioma)
 *  Locale(String idioma,String pais),Locale local1= new Locale("en","US");
 *  Se pueden usar las constantes Locale.Canada.....
 *  localizacion por defecto
 *  static void setDefault(Locale new Locale)
 *  static void setDefault(Locale.Categori category, Locale new Locale);
 *  
 */
public class LocalizacionLanzadora {

	public static void main(String[] args) {
		
		 Locale locDK = new Locale("da", "DK");  // Denmark
         
	        //En España a Dinamarca se le llama Dinamarca. 
	        System.out.println(locDK.getDisplayCountry());
	        // Dinamarca
	 
	         
	        //En Dinamarca al país se le llama Danmark.
	        System.out.println(locDK.getDisplayCountry(locDK));
	        // Danmark
	        
	        //En español el idioma de Dinamarca se dice danés.
	        System.out.println(locDK.getDisplayLanguage());
	        // danés
	         
	        //En Dinamarca danés se dice Dansk.
	        System.out.println(locDK.getDisplayLanguage(locDK));
	        // Dansk
	        
	     
            //Devuelve el código del idioma.
	        System.out.println( locDK.getLanguage() );
	        // da
	        
	        
	        //Ejemplos de Locale con fechas
	        Locale locF = new Locale(Locale.FRENCH.toString(),
	                Locale.FRANCE.toString());
	 
	        Locale locE = new Locale(Locale.ENGLISH.toString());
	 
	        DateFormat dfE = DateFormat.getDateInstance(DateFormat.FULL, locE);
	 
	        Calendar cF = Calendar.getInstance(locF);
	 
	        System.out.println(cF.getTime());
	        // Mon Feb 04 13:18:59 CET 2013
	 
	        System.out.println(dfE.format(new Date()));
	        // Monday, February 4, 2013
	        
	        
	        
	        
		
	}

}
