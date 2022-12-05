package prueba;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PruebaHashMap {

	public static void main(String[] args) {

//        Map<String, Object> persona = new TreeMap<>();
//ordenamos		
//        Map<String, Object> persona = new TreeMap<>((a,b)->a.compareTo(b));
//ordenamos con comparator		
//        Map<String, Object> persona = new TreeMap<>(Comparator.naturalOrder());
//        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
//ordenamos por la longitud de la clave		
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
		        
        System.out.println("contiene elementos=" + !persona.isEmpty());
        persona.put("numero1", "1234");
        persona.put("numero2", "12345");
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);
        
        //OTRO MAP ,HASHMAP ANIDADO
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        //INSERTAMOS EN EL MAP OTRO DEL TIPO DIRECCION
        persona.put("direccion", direccion);
        
        //todo,sabemos que la clave es un string y lo que puede ser distinto es el valor,por eso es un object
        System.out.println("========================== entrySet lista TODO");
        for(Map.Entry<String, Object> par: persona.entrySet()){
 
            Object valor = par.getValue();
        	//SI EL VALOR QUE RECUPERA ES UN MAPA            
            if(valor instanceof Map){ 	
                String nom = (String) persona.get("nombre");
                //CONVERTIMOS EL MAP A 
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for(Map.Entry<String, String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            }
            else {
                System.out.println(par.getKey() + " => " + valor);
            }
        }
	}

}
