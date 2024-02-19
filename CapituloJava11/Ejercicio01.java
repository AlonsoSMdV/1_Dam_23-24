package CapituloJava11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {
  public static void main(String[] args){
    String path = "C:\\Users\\Alonsosmdv\\JAVA_PROJECTS\\1_Dam_23-24\\CapituloJava11\\";
    int nPrimo = 0;
    String txt = "";
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(path+"primos.dat"));
      do {
        nPrimo = siguientePrimo(nPrimo);
        txt = (nPrimo == 499 ? nPrimo +"\n" : nPrimo + ", \n");
        bw.write(txt);
      } while (nPrimo < 499);
      bw.close();
    } catch (IOException e) {
      System.out.println("No se encuentra el archivo");
    }
  }


    public static boolean esPrimo(int n){
      boolean esPrimo = true;
      for (int i = 2; i < n; i++) {
        if(n%i!=0){
          esPrimo = true;
        }else{
          esPrimo = false;
          break;
        }
      }
      return esPrimo;
  }

  public static int siguientePrimo(int n){

    do{
        n++;
    }while(!esPrimo(n));

    return n;
}
}
