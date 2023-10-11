package CapituloJava04;
/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados
 */
import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Base imponible: ");
    double base = sc.nextDouble();
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = sc.next();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromo = sc.next();

    int IVANumerico = 0;
    switch (tipoIVA) {
      case "general":
        IVANumerico = 21;
        break;

      case "reducido":
        IVANumerico = 10;
        break;

      case "superreducido":
        IVANumerico = 4;
        break;
    
      default:
        break;
    }
    double iva = base * IVANumerico/100;
    double precioSinDescuento = base + iva;
    double descuento = 0;
    switch (codigoPromo) {
      case "nopro":
        
        break;

      case "mitad":
        descuento = precioSinDescuento / 2;
        break;

      case "meno5":
        descuento = precioSinDescuento - 5;
        break;

      case "5porc":
        descuento = precioSinDescuento * (5/100);
        break;
    
      default:
        break;
    }
    double total = precioSinDescuento-descuento;
    System.out.printf("Base imponible %12.2f\n", base);
    System.out.printf("IVA (%2d%%) %17.2f\n", IVANumerico, iva);
    System.out.printf("Precio con IVA %12.2f\n", precioSinDescuento);
    System.out.printf("Cód. promo. (%5s) %7.2f\n", codigoPromo, (descuento-(descuento*2)));
    System.out.printf("TOTAL %21.2f", total);
    sc.close();
  }
}
