package CapituloJava04;

import java.util.Scanner;

/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha.
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Elija con que cáracter desea pintar la pirámide: ");
    String c = sc.next();
    System.out.print("Hacia donde desea que apunte el vertice de la pirámide(1. arriba, 2. abajo, 3. izquierda, 4. derecha): ");
    int dir = sc.nextInt();
    switch (dir) {
      case 1:
        System.out.println("    "+c);
        System.out.println("   "+c+c+c);
        System.out.println("  "+c+c+c+c+c);
        System.out.println(" "+c+c+c+c+c+c+c);
        System.out.println(c+c+c+c+c+c+c+c+c);
        break;

      case 2:
      System.out.println(c+c+c+c+c+c+c+c+c);
      System.out.println(" "+c+c+c+c+c+c+c);
      System.out.println("  "+c+c+c+c+c);
      System.out.println("   "+c+c+c);
      System.out.println("    "+c);
        break;

      case 3:
      System.out.println("        "+c);
        System.out.println("      "+c+" "+c);
        System.out.println("    "+c+" "+c+" "+c);
        System.out.println("  "+c+" "+c+" "+c+" "+c);
        System.out.println(c+" "+c+" "+c+" "+c+" "+c);
        System.out.println("  "+c+" "+c+" "+c+" "+c);
        System.out.println("    "+c+" "+c+" "+c);
        System.out.println("      "+c+" "+c);
        System.out.println("        "+c);
        break;

      case 4:
        System.out.println(c);
        System.out.println(c+" "+c);
        System.out.println(c+" "+c+" "+c);
        System.out.println(c+" "+c+" "+c+" "+c);
        System.out.println(c+" "+c+" "+c+" "+c+" "+c);
        System.out.println(c+" "+c+" "+c+" "+c);
        System.out.println(c+" "+c+" "+c);
        System.out.println(c+" "+c);
        System.out.println(c);
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
