package CapituloJava05;
/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando los
 * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 * int donde sea necesario para admitir números largos.
 */
import java.util.Scanner;
public class Ejercicio34 {
  public static long volteado(long n){
    long nVolt = 0;
    while(n>0){
      nVolt = (n%10)+(nVolt*10);
      n/=10;
    }
    return nVolt;
  }

  public static int cuentaDigitos(long n){
    int contador = 0;
    while(n > 0){
      n/=10;
      contador++;
    }
    return contador;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número: ");
    long n1 = sc.nextLong();
    long volt1 = volteado(n1);
    System.out.print("Introduzca otro numero: ");
    long n2 = sc.nextLong();
    long volt2 = volteado(n2);
    int contador = cuentaDigitos(n1);
    long par = 0;
    long impar = 0;
    for (int i = 0; i < contador; i++) {
      if ((volt1%10)%2==0) {
        par = (volt1%10) + (par*10);
        volt1 /=10;
      }else{
        impar = (volt1%10) + (impar*10);
        volt1 /=10;
      }

      if ((volt2%10)%2==0) {
        par = (volt2%10) + (par*10);
        volt2 /=10;
      }else{
        impar = (volt2%10) + (impar*10);
        volt2 /=10;
      }
    }
    System.out.println("El número formado por los dígitos pares es "+par);
    System.out.println("El número formado por los dígitos impares es "+impar);
    sc.close();
  }
}
