package CapituloJava08;
import CapituloJava08.matematicas.*;
/**
 * Escribe un programa que pase de decimal a binario.
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    int nDecimal = 156;
    long binario = 1;
    while (nDecimal > 1) {
        binario = Ej11PegaPorDetras.pegaPorDetras(binario, nDecimal % 2);
        nDecimal = nDecimal / 2;
    }
    binario = Ej11PegaPorDetras.pegaPorDetras(binario, 1);
    binario = Ej06Voltea.voltea(binario);
    binario = Ej09QuitarPorDetras.quitarPorDetras(binario, 1);
    System.out.println(binario);
  }
}
