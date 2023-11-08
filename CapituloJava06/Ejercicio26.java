package CapituloJava06;
/**
 * Realiza un programa que pinte una tableta de turrón con un bocado realizado de
 * forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
 * da alrededor del turrón, obviamente no se puede dar un bocado por en medio
 * de la tableta
 */
import java.util.Scanner;
public class Ejercicio26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la anchura de la tableta: ");
    int ancho = sc.nextInt();
    System.out.print("Introduzca la altura de la tableta: ");
    int alto = sc.nextInt();
    int ladoMordisco = (int)(Math.random()*4+1);
    int x = 0;
    int y = 0;

    switch (ladoMordisco) {
      case 1:
        x = (int)(Math.random()*ancho+1);
        for (int i = 1; i <= alto; i++) {
          for (int j = 1; j <= ancho; j++) {
            if (i == 1 && j == x) {
              System.out.print(" ");
            }else{
              System.out.print("*");
            }
          }
          System.out.println();
        }
        break;

      case 2:
        y = (int)(Math.random()*alto+1);
        for (int i = 1; i <= alto; i++) {
          for (int j = 1; j <= ancho; j++) {
            if (i == y && j == ancho) {
              System.out.print(" ");
            }else{
              System.out.print("*");
            }
          }
          System.out.println();
        }
        break;

      case 3:
      x = (int)(Math.random()*ancho+1);
        for (int i = 1; i <= alto; i++) {
          for (int j = 1; j <= ancho; j++) {
            if (i == alto && j == x) {
              System.out.print(" ");
            }else{
              System.out.print("*");
            }
          }
          System.out.println();
        }
        break;

      case 4:
        y = (int)(Math.random()*alto+1);
        for (int i = 1; i <= alto; i++) {
          for (int j = 1; j <= ancho; j++) {
            if (i == y && j == alto) {
              System.out.print(" ");
            }else{
              System.out.print("*");
            }
          }
          System.out.println();
        }
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
