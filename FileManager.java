package com.refactoring.projects.project10;

import java.io.File;

public class FileManager {

    public void procesarArchivo(String ruta) {
        File archivo = new File(ruta);
        if (archivo.exists()) {
            System.out.println("Archivo encontrado: " + archivo.getName());
            long tamano = archivo.length();
            System.out.println("Tamaño: " + tamano + " bytes");
            
            if (tamano > 1024 * 1024) {
                System.out.println("Archivo grande, comprimiendo...");
            }
            String extension = obtenerExtension(ruta);
            }
            System.out.println("Extensión: " + extension);
        }
        private String obtenerExtension(String ruta) {
     int indice = ruta.lastIndexOf('.');
    if (indice > 0) {
        return ruta.substring(indice + 1);
    }
    return "";
}
    }
}
