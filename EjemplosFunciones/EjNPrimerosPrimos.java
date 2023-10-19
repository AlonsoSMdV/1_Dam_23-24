package EjemplosFunciones;
import java.util.Scanner;
public class EjNPrimerosPrimos {

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

  public static void nPrimerosPrimos(int n){
    int contador = 0;
    int i = 0;
    while (contador < n) {
      if (esPrimo(i)) {
        System.out.println(i+" ");
        contador++;
        i++;
      } else {
        i++;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    int n = sc.nextInt();
    nPrimerosPrimos(n);
    sc.close();
  }
}
