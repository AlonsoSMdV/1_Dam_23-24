package CapituloJava06;
/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    int maximo = 100;
    int minimo = 199;
    double suma = 0;
    for (int i = 1; i <= 50; i++) {
      int n = (int)(Math.random()*99+100);
      if(n > maximo){
        maximo = n;
      }else if(n < minimo){
        minimo = n;
      }
      suma += n;
      System.out.print(n+" ");
    }
    System.out.println();
    System.out.println("Maximo: "+maximo);
    System.out.println("Minimo: "+minimo);
    System.out.printf("Media: %.2f",(double)(suma/50));
  }
}
