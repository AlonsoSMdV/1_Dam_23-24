package Test_DAM;
import java.util.Scanner;
public class ExamenBucles01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe el mensaje que quieres enviar: ");
    String mensaje = sc.nextLine();
    int text = mensaje.length();
    int anchura = (text + 4)/2;
    if (anchura % 2 == 0) {
      anchura++;
    }
    for (int i = 1; i <= (anchura/2)+1; i++) {
      for (int j = 1; j <= anchura; j++) {
        if (i == 1 || j == 1 || i == anchura || j == anchura || j == i || j == anchura-i+1) {
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    for (int j = 0; j < anchura; j++) {
      System.out.print("* ");
    }
    System.out.println();
    int espacio = (anchura - text) / 2;
    System.out.print("* ");
    for (int i = 0; i < espacio - 1; i++) {
      System.out.print("  ");
    }
    System.out.print(mensaje);
    for (int i = 0; i < espacio - 1; i++) {
      System.out.print("  ");
    }
    System.out.println(" *");
    for (int j = 0; j < anchura; j++) {
      System.out.print("* ");
    }
    sc.close();
  }
}
