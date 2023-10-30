package CapituloJava05;
/**
 * La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
 * para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
 * vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
 * debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
 * de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
 * no es un número impar mayor o igual que 3, el programa debe mostrar un
 * mensaje de error.
 */
import java.util.Scanner;
public class Ejercicio66 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la figura: ");
    int altura = sc.nextInt();
    if(altura%2 == 0 || altura < 3){
      System.out.println("La altura no es correcta");
    }else{
      for (int i = 1; i <= altura; i++) {
        for (int j = 1; j <= (altura+1)/2; j++) {
          if (j==i || j == altura-i+1 ) {
            System.out.print("*    *");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
    sc.close();
  }
}
