package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 */

import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la temperatura media que ha hecho en cada mes de este año");
    int[] tempMeses = new int[12];
    String[] meses = new String[12];
    meses[0] = "Enero";meses[1] = "Febrero";meses[2] = "Marzo";meses[3] = "Abril";
    meses[4] = "Mayo";meses[5] = "Junio";meses[6] = "Julio";meses[7] = "Agosto";
    meses[8] = "Septiembre";meses[9] = "Octubre";meses[10] = "Nobiembre";meses[11] = "Diciembre";
    for (int i = 0; i < 12; i++) {
      System.out.print(meses[i]+": ");
      int temperatura = sc.nextInt();
      tempMeses[i] = temperatura;
    }

    for (int i = 0; i < meses.length; i++) {
      System.out.printf("%-12s| Temperatura media: %-3d|", meses[i], tempMeses[i]);
      for (int j = 0; j < tempMeses[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
