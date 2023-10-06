package CapituloJava02;
/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    double euros = 50;
    System.out.println("1€ son 166.386 pesetas");
    System.out.println(euros+"€ son "+(euros*166.386)+" pesetas");
  }
}
