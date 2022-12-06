package com.jgr.defecto.paquete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ContadorPalabrasMio {

	public static void main(String[] args) {
		 String entrada = " en un lugar de la mancha en un un";
		 String[] divido = entrada.split(" ");//lo divido en palabras porque esta separado por espacios

		 Map<String, Integer>  palabrasRepetidas = new HashMap<String, Integer>();

		 //recorro el string y si no existe lo inserto y sumo al contador
		 for(String palabra:divido){
		     if(palabrasRepetidas.containsKey(palabra.toLowerCase())
		    		 &&!palabrasRepetidas.isEmpty()
		    		 &&!palabrasRepetidas.equals(" ")){
		         palabrasRepetidas.put(palabra,palabrasRepetidas.get(palabra.toLowerCase())+1);
		     }
		     else{palabrasRepetidas.put(palabra,1);}
		 }
		 
		 //lo ordeno por numero de ocurrencias que es lo que tengo en el valor,en la clave tengo la palabra
		 List<Entry<String, Integer>> lista = new ArrayList<>(palabrasRepetidas.entrySet());
		Collections.sort(lista, new Comparator<Entry<String, Integer>>() {
		    @Override
		    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		        return - o1.getValue().compareTo(o2.getValue()) ;
		    }
		});
		//lo recorro para sacar los valores

		 Iterator<Map.Entry<String, Integer>> iter = lista.iterator();
		 while(iter.hasNext()){
		     Map.Entry<String, Integer> item = iter.next();
		     String key = item.getKey();
		     int value = item.getValue();
		     System.out.println("la palabra->"+key+ " sale :"+value+ " veces");
		 }


//

	}

}
