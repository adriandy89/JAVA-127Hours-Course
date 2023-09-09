package org.aguzman.archivos.ejemplos;

import org.aguzman.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "/media/adrian/DATA/JAVA/24-manejo_de_archivos/archivo/java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
