package ej3;

import com.google.gson.Gson;

import ej2.Persona;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerJsonEj3 {

    public static void main(String[] args) {

        // Creo una instancia de GSON
        Gson gson = new Gson();

        // Creo una persona
        Persona persona = new Persona("F", "U", 20);
        
        //string con el fichero
        String ruta ="datos_persona.json";

        // Obtengo el JSON de la persona
        String json = gson.toJson(persona);

        // Muestro el resultado
        System.out.println(json);

        // Escribo el fichero
        File fichero= new File(ruta);
        
        String salida = "";
        
        if(!fichero.exists()) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            bw.write(json);
            System.out.println("Fichero creado");
        } catch (IOException ex) {
            Logger.getLogger(LeerJsonEj3.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else {
        	  try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                  String linea;
                  while ((linea = br.readLine()) != null) {
                      salida += linea;
                      Persona persona2 = gson.fromJson(salida, Persona.class);
                      System.out.println("Leyendo->"+persona2);                      
                  }
                  
              } catch (FileNotFoundException ex) {
                  System.out.println(ex.getMessage());
              } catch (IOException ex) {
                  System.out.println(ex.getMessage());
              }
        }
        
        

    }

}
