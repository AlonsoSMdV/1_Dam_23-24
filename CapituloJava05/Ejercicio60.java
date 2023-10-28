package CapituloJava05;
/**
 * Escribe un programa que pinte por pantalla un par de calcetines, de los que
 * se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
 * El usuario debe introducir la altura. Suponemos que el usuario introduce una
 * altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
 * que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
 */
import java.util.Scanner;
public class Ejercicio60 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de los calcetines: ");
    int altura = sc.nextInt();
    if (altura < 4) {
      System.out.println("No son correctos los datos introducidos");
    } else {
      for (int i = 1; i <= altura; i++) {
      if(i < altura - 1){
        System.out.println("***      ***");
      }else{
        System.out.println("*******  *******");
      }
    }
    }
    sc.close();
  }
}
