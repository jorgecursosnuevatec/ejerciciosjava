package com.jgr.clase.ejemplos.java.basico;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));            
            //ps.list(System.out);
          
            
            Iterator<?> it =  System.getProperties().propertyNames().asIterator();
            
            Map<String,String> listaProp = new HashMap<>();
            
            while (it.hasNext()) {
            	String clave = it.next().toString();
            	listaProp.put(clave,System.getProperty(clave));           	
            	
            }
            for (String clave:listaProp.keySet()) {
            	
            	System.out.println("clave->"+clave + "**valor->" + listaProp.get(clave) );
            }
            
            
            //ordenamos con stream,esto devuelve void
            listaProp.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())            
            .forEach(System.out::println)            
            ;
            
            Map<String,String> listaPropOrdenada=
            		listaProp.entrySet()
            		.stream()
            		.sorted(Map.Entry.comparingByKey())
            		.collect(
            				Collectors.toMap(Map.Entry::getKey, 
            						Map.Entry::getValue,
            						(viejo,nuevo)->viejo,LinkedHashMap::new)
            				);
            
            
                     
            //con un treeset
            SortedSet<String> ordenadoClave = new TreeSet<>(listaProp.keySet());
            SortedSet<String> ordenadoValor = new TreeSet<>(listaProp.values());
            
            
            
            
            
        } catch(Exception e){
            System.err.println("no existe el archivo = " + e);
            System.exit(1);
        }
    }
}
