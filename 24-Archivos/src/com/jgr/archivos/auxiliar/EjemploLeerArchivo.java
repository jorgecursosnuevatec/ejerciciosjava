package com.jgr.archivos.auxiliar;


public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
