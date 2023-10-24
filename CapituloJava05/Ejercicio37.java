package CapituloJava05;
/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 */
import java.util.Scanner;
public class Ejercicio37 {
  public static long volteado(long n){
    long nVolt = 0;
    while(n>0){
      nVolt = (n%10)+(nVolt*10);
      n/=10;
    }
    return nVolt;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long n = sc.nextLong();
    String palotes = "";
    long volt = volteado(n);
    long nPalotes = 0;
    while (volt > 0) {
      nPalotes = volt%10;
      for (int i = 0; i < nPalotes; i++) {
        palotes += "| ";
      }
      if (volt>10) {
        palotes += "- ";
      }else{
        palotes += "";
      }
      volt /= 10;
    }
    System.out.println("El "+n+" en decimal es el "+palotes+" en el sistema de palotes");
    sc.close();
  }
}
