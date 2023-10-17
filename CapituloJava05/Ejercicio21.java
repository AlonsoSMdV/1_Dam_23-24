package CapituloJava05;
/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */

import java.util.Scanner;
public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int maxPar = 0;
    int sumaImpares = 0;
    int cuentaImpares = 0;
    int contador = 0;
    while (n > 0) {
      System.out.print("Introduce un numero: ");
      n = sc.nextInt();
      if (n > 0) {
        contador++;
        if (n%2==0) {
          if(n > maxPar){
            maxPar = n;
          }
        } else {
          sumaImpares+=n;
          cuentaImpares++;
        }
      }
        
    }
    System.out.println("Hay "+contador+" numeros, el maximo de los pares es "+maxPar+" y la mdeia de los impares es "+(sumaImpares/cuentaImpares));
    sc.close();
  }
}
