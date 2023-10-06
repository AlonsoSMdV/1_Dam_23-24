package CapituloJava02;
/**
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    int x = 144;
    int y = 999;
    System.out.println("x = "+x);
    System.out.println("y = "+y);
    System.out.println("Suma = "+x+" + "+y+" = "+(x+y));
    System.out.println("Resta = "+x+" + "+y+" = "+(x-y));
    System.out.println("Multiplicación = "+x+" + "+y+" = "+(x*y));
    System.out.println("División = "+x+" + "+y+" = "+(double)(x/y));
  }
}
