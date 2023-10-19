package EjemplosFunciones;
import java.util.Scanner;
public class EjEsMultiplo {
  public static boolean esMultipo(int a, int b){
    return(a % b ) == 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Numero 1: ");
    int a = sc.nextInt();
    System.out.print("Numero 2: ");
    int b = sc.nextInt();

    if (esMultipo(a, b)) {
      System.out.printf("%d es multiplo de %d", a, b);
    } else {
      System.out.printf("%d no es multiplo de %d", a, b);
    }
    sc.close();
  }
}
