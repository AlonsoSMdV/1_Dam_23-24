package CapituloJava06;
/**
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    int n = 0;
    int maximoPar = -100;
    int minimoImpar = 199;
    double suma = 0;
    for (int i = 1; i <= 50; i++) {
      n = (int)(Math.random()*301-100);
      System.out.print(n+" ");
      suma += n; 
      if(n > maximoPar && n % 2 == 0){
        maximoPar = n;
      }else if(n < minimoImpar && n % 2 != 0){
        minimoImpar = n;
      }
    }
    System.out.println();
    System.out.println("El mmaximo de los pares es "+maximoPar+" y el minimo de los impares es "+minimoImpar);
    System.out.printf("la media es %.2f",(suma/50));
  }
}
