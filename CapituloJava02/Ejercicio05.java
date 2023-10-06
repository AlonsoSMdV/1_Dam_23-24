package CapituloJava02;
/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    double pesetas = 50000;
    System.out.println("1 peseta son 0.0060€");
    System.out.println(pesetas+" pesetas son "+(pesetas*0.0060)+"€");
  }
}
