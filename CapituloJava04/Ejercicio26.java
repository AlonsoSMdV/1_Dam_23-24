package CapituloJava04;
/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
 * jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 */
import java.util.Scanner;

public class Ejercicio26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Venta de entradas CineCampa");
    System.out.print("¿Cuántas entradas desea? ");
    int entradas = sc.nextInt();
    System.out.print("Día de la semana: ");
    String dia = sc.next();
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    boolean tieneTarjeta = (sc.next().equals("s"));
    int entradasIndivual = entradas;
    double precioEntradaIndividual = 8;
    int entradasDePareja = 0;
    double total = 0;
    double descuento = 0;
    double aPagar = 0;
    switch (dia) {
      case "miercoles":
        precioEntradaIndividual = 5;
        break;

      case "jueves":
        entradasDePareja = entradas / 2;
        entradasIndivual = entradas % 2;
        break;
    
      default:
        break;
    }
    total = precioEntradaIndividual * entradasIndivual;
    total += 11 * entradasDePareja;
    if(tieneTarjeta) {
      descuento = total * 0.1;
    }
    aPagar = total - descuento;
    System.out.println("\nAquí tiene sus entradas. Gracias por su compra.");
    if (entradasDePareja > 0) {
      System.out.printf("Entradas de pareja %11d\n", entradasDePareja);
      System.out.printf("Precio por entrada de pareja %6.2f €\n", 11.0);
    }
    if (entradasIndivual > 0) {
      System.out.printf("Entradas individuales %11d\n", entradasIndivual);
      System.out.printf("Precio por entrada individual %6.2f €\n", precioEntradaIndividual);
    }
    System.out.printf("Total %30.2f €\n", total);
    System.out.printf("Descuento %26.2f €\n", descuento);
    System.out.printf("A pagar %28.2f €\n", aPagar);
    sc.close();
    sc.close();
  }
}
