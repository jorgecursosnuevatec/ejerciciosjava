package com.jgr.composite.patron;

import com.jgr.composite.patron.auxiliar.Archivo;
import com.jgr.composite.patron.auxiliar.Directorio;


/**
 * The Class EjemploComposite.
 * es de la categoria de estructurales,
 * construimos objetos complejos a partir de una serie de objetos mas simples con caracteristicas comunes
 * se usa la composicion recursiva y tienen una estructura en forma de arbol
 * En este caso es la clase componente la que tiene caracteristicas comunes entre directorio y archivo
  * un archivo es un componente que a su vez es contenido por directorio. En un directorio puede haber varios
 * archivos,esta compuesto de archivos
 * https://es.wikipedia.org/wiki/Composite_(patr%C3%B3n_de_dise%C3%B1o)
 */
public class EjemploComposite {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

        System.out.println(doc.mostrar(0));
    }
}
