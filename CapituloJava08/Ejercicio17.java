package CapituloJava08;
import CapituloJava08.matematicas.*;
/**
 * Escribe un programa que pase de binario a decimal.
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    int nBinario = 10011011;
    int nDecimal = 0;
    int nBinarioAux = nBinario;
    int cont = Ej05Digitos.digitos(nBinario);
    for (int i = 0; i < cont; i++) {
      int digBinario = nBinarioAux%10;
      nDecimal += (Ej04Potencia.potencia(2, i)) * digBinario;
      nBinarioAux/=10;
    }
    System.out.println("El numero binario "+nBinario+" es el "+nDecimal+" en decimal");
  }
}
