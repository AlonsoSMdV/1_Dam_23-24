package CapituloJava06;
/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    int tirada1 = (int)( Math.random()*6+1);
    int tirada2 = (int)( Math.random()*6+1);
    int tirada3 = (int)( Math.random()*6+1);
    int suma = tirada1 + tirada2 + tirada3;
    System.out.println(tirada1+"\n" +tirada2+ "\n" +tirada3+ "\nSuma: " +suma);
  }
}
