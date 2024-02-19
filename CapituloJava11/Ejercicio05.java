package CapituloJava11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio05 {
  public static void main(String[] args) {
    
    if (args.length != 2) {
      System.out.println("Uso del programa: S11Ejercicio05 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
      System.exit(-1);
    }
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
      String line = br.readLine();

      while(line != null){
          if(line.contains("//") || line.contains("/*")){
              bw.write("\n");                    
          }else{
              bw.write(line + "\n");                    
          }
          line = br.readLine();
      }

      bw.close();
      br.close();
  } catch (IOException io) {
  }
  }
}
