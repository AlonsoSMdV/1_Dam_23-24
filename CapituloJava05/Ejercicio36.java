package CapituloJava05;
/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 */
import java.util.Scanner;
public class Ejercicio36 {
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
    System.out.print("Introduce un numero: ");
    long n = sc.nextInt();
    long volt = volteado(n);
    if(n == volt){
      System.out.println(n+" es capicuo");
    }else{
      System.out.println(n+" no es capicuo");
    }
    sc.close();
  }
}
