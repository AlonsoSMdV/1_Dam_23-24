package CapituloJava11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio06 {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Uso del programa: FichEjercicio06 FICHERO PALABRA");
      System.exit(-1);
    }
        
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String palabra = args[1];
      String linea = "";
      int i = 0;
      int apareceEnTexto = 0;

      while ((linea = br.readLine()) != null) {
        while ((i = linea.indexOf(palabra)) != -1) {
          linea = linea.substring(i + palabra.length(), linea.length());
          apareceEnTexto++;
        }
      }

      System.out.println("La palabra " + palabra + " aparece " + apareceEnTexto + " veces en el fichero ");
      br.close();

    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
  }
}
