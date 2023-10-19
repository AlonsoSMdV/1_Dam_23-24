package EjemplosFunciones;
import java.util.Scanner;
public class EjEsDivisor {
  public static boolean esDivisor(int a, int b){
    return (b % a) == 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Numero 1: ");
    int a = sc.nextInt();
    System.out.print("Numero 2: ");
    int b = sc.nextInt();

    if (esDivisor(a, b)) {
      System.out.printf("%d es divisor de %d", a, b);
    } else {
      System.out.printf("%d no es divisor de %d", a, b);
    }
    sc.close();
  }
}
