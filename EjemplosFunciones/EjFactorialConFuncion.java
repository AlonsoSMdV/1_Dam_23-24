package EjemplosFunciones;
import java.util.Scanner;
public class EjFactorialConFuncion {
  public static long factorial(int n){
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    return factorial;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int n = sc.nextInt();
    if(n<0){
      System.out.println("No existen los factoriales de numeros negativos");
    }else if(n == 0){
      System.out.println("0! = 1");
    }else{
      System.out.println(n+"! = "+factorial(n));
    }
    sc.close();
  }
}
