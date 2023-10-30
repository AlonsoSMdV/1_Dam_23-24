package CapituloJava05;
/**
 * Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar. Usa long en lugar de int donde sea necesario para admitir números
 * largos.
 */
import java.util.Scanner;
public class Ejercicio68 {
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
    System.out.print("Por favor, introduzca un numero: ");
    long n = sc.nextInt();
    long volt = volteado(n);
    long dislocado = 0;
    while(volt > 0){
      if((volt%10)%2 == 0){
        dislocado = ((volt%10) + 1) + (dislocado*10);
      }else{
        dislocado = ((volt%10) - 1) + (dislocado*10);
      }
      volt/=10;
    }
    System.out.println("Dislocando el "+n+" sale el "+dislocado);
    sc.close();
  }
}
