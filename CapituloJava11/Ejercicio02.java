package CapituloJava11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
  public static void main(String[] args) {
    try {

      String path = "C:\\Users\\Alonsosmdv\\JAVA_PROJECTS\\1_Dam_23-24\\CapituloJava11\\";
      BufferedReader br = new BufferedReader(new FileReader(path + "primos.dat"));

      String linea = "";
      while (linea != null) {
        System.out.print(linea + "\n");
        linea = br.readLine();  
      }
      System.out.println();
      br.close();
    } catch (IOException e) {
      System.out.println("No se encuentra el archivo");
    }
  }
}
