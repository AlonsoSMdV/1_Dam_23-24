package CapituloJava02;
/**
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
 * mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
 * de Java (con un solo println) ¿es posible?
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    char letra = 'A';
    char letra2 = 'B';
    String frase = "Las 2 primeras letras del abecedario son: ";
    System.out.println(frase+letra+" "+letra2);

    //Si se puede concatenando la cadena y los caracteres
  }
}
