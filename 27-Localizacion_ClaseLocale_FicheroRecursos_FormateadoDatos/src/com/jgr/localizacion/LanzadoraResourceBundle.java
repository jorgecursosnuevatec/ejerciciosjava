package com.jgr.localizacion;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * The Class LanzadoraResourceBundle.
 * Para obtener el archivo de recursos de una localizacion usamos ResourceBundle
 * los textos los obtenemos con getString(String ResourceBundle)
 * 
 * http://bitsmi.com/2016/06/12/resourcebundle-localizacion-de-recursos/
 */
public class LanzadoraResourceBundle {
	public static void main(String[] args) {
		
		// Se obtiene el conjunto de recursos definidos como Messages para el idioma inglés (en)
		ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.UK);
		// Se obtiene la cadena de texto del conjunto de recursos a través de la clave asociada. En este caso, el valor será "car"
		String message = bundle.getString("messages.car");
		//Assert.assertEquals("car", message);		
		System.out.println("Car->"+message);		 
		// Una vez cargado el conjunto de recursos, se pueden obtener varias cadenas        
		message = bundle.getString("messages.house");
		//Assert.assertEquals("house", message);		
		System.out.println("House->"+message);
		
		//ahora en español
		ResourceBundle bundle2 = ResourceBundle.getBundle("Messages",new Locale("es"));
		String message2 = bundle2.getString("messages.car");
		System.out.println("Car->"+message2);
		
		
		System.out.println("Por defecto->"+Locale.getDefault());
		for (Locale local: Locale.getAvailableLocales()) {
			System.out.println("Disponibles-->"+local);
			
		}
	}

}
