package org.aguzman.archivos.ejemplos;

import org.aguzman.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "/media/adrian/DATA/JAVA/24-manejo_de_archivos/archivo/java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }
}
