package com.refactoring.projects.project10;

import java.io.File;

public class FileManager {
//metodo encargado de procesar un archivo
//el metodo hace muchoas procesos
    public void procesarArchivo(String ruta) { 
        File archivo = new File(ruta);
        if (archivo.exists()) {
            System.out.println("Archivo encontrado: " + archivo.getName());
            long tamano = archivo.length();
            System.out.println("Tamaño: " + tamano + " bytes");
            //el numero puede seer una constante
            if (tamano > 1024 * 1024) {
                System.out.println("Archivo grande, comprimiendo...");
            }
feature/extract-method
            
            String extension = "";
            //nombre de la variable no tiene sentido
            int i = ruta.lastIndexOf('.');
            if (i > 0) {
                extension = ruta.substring(i + 1);

            String extension = obtenerExtension(ruta);
 develop
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
