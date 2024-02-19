package CapituloJava11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Uso del programa: java .\\Ejercicio03.java FICHERO1.txt ");
    }
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      int pos = args.length;
      String ficheroDestino = (args[0].substring(0, pos) + "sort.txt");
      BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroDestino));
      ArrayList<String> palabras = new ArrayList<>();
      String linea = br.readLine();

      while (linea != null) {
        palabras.add(linea);
        linea = br.readLine();
      }
      br.close(); 
      Collections.sort(palabras);

      for (String p : palabras) {
        bw.write(p + "\n");
      }
      bw.close();
    } catch (IOException e) {
    }
  }
}
