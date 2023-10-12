package CapituloJava04;
/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
 */
import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int alto = sc.nextInt();
    System.out.print("Ahora introduzca el ancho: ");
    int ancho = sc.nextInt();
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String bordado = sc.next();
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    int dimension = alto * ancho;
    double costeDimension = dimension *  0.01;
    double escudo = 2.50;
    double gastoEnvio = 3.25;
    double total;
    System.out.printf("Bandera de %d cm2: %.2f €\n",dimension,costeDimension);

    if(bordado.equals("s")){
      System.out.printf("Con escudo: %12.2f €\n",escudo);
      total = costeDimension+escudo+gastoEnvio;
    }else{
      escudo=0;
      System.out.printf("Sin escudo: %12.2f €\n",escudo);
      total = costeDimension+gastoEnvio;
    }
    System.out.printf("Gastos de envío: %7.2f €\n",gastoEnvio);
    System.out.printf("Total: %17.2f €\n",total);



    sc.close();
  }
}
