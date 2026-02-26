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
            
            String extension = "";
            int i = ruta.lastIndexOf('.');
            if (i > 0) {
                extension = ruta.substring(i + 1);
            }
            System.out.println("Extensión: " + extension);
        }
    }
}
