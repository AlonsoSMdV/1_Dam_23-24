package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 */
import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca 8 palabras:");
    String[] palabras = new String[8];
    int colores = 0;
    for (int i = 0; i < palabras.length; i++) {
      palabras[i] = sc.nextLine();
      if (palabras[i].equals("verde") || palabras[i].equals("rojo") || palabras[i].equals("azul") || palabras[i].equals("amarillo") || palabras[i].equals("naranja") || palabras[i].equals("rosa") || palabras[i].equals("negro") || palabras[i].equals("blanco") || palabras[i].equals("morado")) {
        colores++;
      }
    }

    System.out.println("Array original:\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    System.out.print("│");
    for (int i = 0; i < palabras.length; i++) {
      System.out.printf("%4d%4s│",i," ");
    }
    System.out.println();
    System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
    System.out.print("│");
    for (int i = 0; i < palabras.length; i++) {
      System.out.printf("%-8s│",palabras[i]);
    }
    System.out.println();
    System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    String[] arrayColores = new String[colores];
    int j = 0;
    String[] arrayNoColores = new String[8-colores];
    int k = 0;
    for (int i = 0; i < palabras.length; i++) {
      if (palabras[i].equals("verde") || palabras[i].equals("rojo") || palabras[i].equals("azul") || palabras[i].equals("amarillo") || palabras[i].equals("naranja") || palabras[i].equals("rosa") || palabras[i].equals("negro") || palabras[i].equals("blanco") || palabras[i].equals("morado")) {
        arrayColores[j] = palabras[i];
        j++;
      }else{
        arrayNoColores[k] = palabras[i];
        k++;
      }
    }
    k = 0;
    String[] resultado = new String[8];
    for (int i = 0; i < resultado.length; i++) {
      if (i < colores) {
        resultado[i] = arrayColores[i];
      }else{
        resultado[i] = arrayNoColores[k];
        k++;
      }
    }

    System.out.println("Array resultado:\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    System.out.print("│");
    for (int i = 0; i < palabras.length; i++) {
      System.out.printf("%4d%4s│",i," ");
    }
    System.out.println();
    System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
    System.out.print("│");
    for (int i = 0; i < palabras.length; i++) {
      System.out.printf("%-8s│",resultado[i]);
    }
    System.out.println();
    System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    sc.close();
  }
}
