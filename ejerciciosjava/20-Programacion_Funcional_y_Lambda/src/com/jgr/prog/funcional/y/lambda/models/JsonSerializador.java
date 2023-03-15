package com.jgr.prog.funcional.y.lambda.models;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;



/**
 * The Class JsonSerializador.
 */
public class JsonSerializador {

    /**
     * Inicializar objeto. antes de capitalizar
     *
     * @param object the object
     */
    public static void inicializarObjeto(Object object){
        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser null!");
        }//aqui se obtienen metodos,no atributos
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m-> {
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException(
                                "Error al serializar, no se puede iniciar el objeto"
                        + e.getMessage());
                    }
                });
    }

    /**
     * Convertir json.
     *
     * @param object the object
     * @return the string
     */
    public static String convertirJson(Object object){

        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser null!");
        }
        inicializarObjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields();//los campos declarados en el objeto
        return Arrays.stream(atributos)//lo convertimos a stream
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class)) //de que clase quiero obtener anotaciones
                .map(f -> {
                    f.setAccessible(true);//para acceder a los atributos de producto,si no dice que estan protegidos
                    //si el nombre esta vacio le pasamos el nombre del campo,else el nombre de la anotacion
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = f.get(object);
                        if(f.getAnnotation(JsonAtributo.class).capitalizar() &&
                        valor instanceof String){
                            String nuevoValor = (String) valor;
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                            .map(palabra -> palabra.substring(0, 1).toUpperCase()
                            + palabra.substring(1).toLowerCase())
                            .collect(Collectors.joining(" "));

                            f.set(object, nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a json: " + e.getMessage());
                    }
                })
                .reduce("{" , (a,b) -> {
                    if("{".equals(a)){//la primera vez no añade "," despues del primer elemento de flujo
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }
}
