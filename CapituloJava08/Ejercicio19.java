package CapituloJava08;

import CapituloJava08.matematicas.*;
import java.util.Scanner;
/**
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long numeroIntroducido = 666;
    System.out.println("1 - Binario a Decimal");
    System.out.println("2 - Binario a Octal");
    System.out.println("3 - Binario a Hexadecimal");
    System.out.println("4 - Octal a Binario");
    System.out.println("5 - Octal a Decimal");
    System.out.println("6 - Octal a Hexadecimal");
    System.out.println("7 - Decimal a Binario");
    System.out.println("8 - Decimal a Octal");
    System.out.println("9 - Decimal a Hexadecimal");
    System.out.println("10 - Hexadecimal a Binario");
    System.out.println("11 - Hexadecimal a Octal");
    System.out.println("12 - Hexadecimal a Decimal");
    System.out.println("Elige una opcion");
    int opcion = sc.nextInt();
    System.out.print("Introduzca el número que quiere convertir: ");
    String numeroIntroducidoString = sc.next();
    if (opcion < 10) {
        numeroIntroducido = Long.parseLong(numeroIntroducidoString);
    }
    String resultado = "";
    switch (opcion) {
      case 1:
        resultado = Long.toString(binarioDecimal(numeroIntroducido));
        break;

      case 2:
        resultado = Long.toString(binarioOctal(numeroIntroducido));
        break;

      case 3:
        resultado = binarioHexadecimal(numeroIntroducido);
        break;

      case 4:
        resultado = Long.toString(octalBinario(numeroIntroducido));
        break;

      case 5:
        resultado = Long.toString(binarioDecimal(octalBinario(numeroIntroducido)));
        break;

      case 6:
        resultado = binarioHexadecimal(octalBinario(numeroIntroducido));
        break;

      case 7:
        resultado = Long.toString(decimalBinario(numeroIntroducido));
        break;

      case 8:
        resultado = Long.toString(binarioOctal(decimalBinario(numeroIntroducido)));
        break;

      case 9:
        resultado = binarioHexadecimal(decimalBinario(numeroIntroducido));
        break;

      case 10:
        resultado = Long.toString(hexadecimalBinario(numeroIntroducidoString));
        break;

      case 11:
        resultado = Long.toString(binarioOctal(hexadecimalBinario(numeroIntroducidoString)));
        break;

      case 12:
        resultado = Long.toString(binarioDecimal(hexadecimalBinario(numeroIntroducidoString)));
        break;
    
      default:
        break;
    }

    System.out.println(resultado);
    sc.close();
  }

  public static long binarioDecimal(long binario){
    long nDecimal = 0;
    long nBinarioAux = binario;
    int cont = Ej05Digitos.digitos(binario);
    for (int i = 0; i < cont; i++) {
      long digBinario = nBinarioAux%10;
      nDecimal += (Ej04Potencia.potencia(2, i)) * digBinario;
      nBinarioAux/=10;
    }
    return nDecimal;
  }
  public static long binarioOctal(long binario){
    long octal = 1;
        while (binario > 0) {
            octal = octal * 10 + (binarioDecimal(binario % 1000));
            binario = binario / 1000;
        };
        octal = Ej11PegaPorDetras.pegaPorDetras(octal, 1);
        octal = Ej06Voltea.voltea(octal);
        octal = Ej09QuitarPorDetras.quitarPorDetras(octal, 1);
        octal = Ej10QuitarPorDelante.quitarPorDelante(octal, 1);
      return octal;
  }
  public static String binarioHexadecimal(long binario){
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
    while (binario > 0) {
        hexadecimal = digitosHexa.charAt((int)binarioDecimal(binario % 10000)) + hexadecimal;
        binario = binario / 10000;
    };
    return hexadecimal;
  }
  public static long octalBinario(long octal){
    long binario = 0;
        for (int i = 0; i < Ej05Digitos.digitos(octal); i++) {
            binario = binario * 1000 + decimalBinario(Ej07digitoN.digitoN((int) octal, i));
        }
        return binario;
  }
    public static long decimalBinario(long decimal){
    long binario = 1;
    while (decimal > 1) {
        binario = Ej11PegaPorDetras.pegaPorDetras(binario, (int)decimal % 2);
        decimal = decimal / 2;
    }
    binario = Ej11PegaPorDetras.pegaPorDetras(binario, 1);
    binario = Ej06Voltea.voltea(binario);
    binario = Ej09QuitarPorDetras.quitarPorDetras(binario, 1);
    return binario;
  }
  public static long hexadecimalBinario(String hexadecimal){
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
    for (int i = 0; i < hexadecimal.length(); i++) {
        binario = binario * 10000 + decimalBinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
    }
    return binario;
  }
}
