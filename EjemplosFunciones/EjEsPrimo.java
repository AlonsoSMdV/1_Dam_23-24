package EjemplosFunciones;

import java.util.Scanner;

public class EjEsPrimo {
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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Numero: ");
    int a = sc.nextInt();

    if (esPrimo(a)) {
      System.out.printf("%d es primo", a);
    } else {
      System.out.printf("%d no es primo", a);
    }
    sc.close();
  }
}
