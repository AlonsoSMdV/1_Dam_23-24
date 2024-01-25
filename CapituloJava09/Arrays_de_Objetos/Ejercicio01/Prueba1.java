package CapituloJava09.Arrays_de_Objetos.Ejercicio01;
import java.util.Scanner;
public class Prueba1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Gatos gatos[] = new Gatos[4];
    for (int i = 0; i < gatos.length; i++) {
      gatos[i]= new Gatos();
      System.out.print("Nombre: ");
      gatos[i].setNombre(sc.nextLine());
      System.out.print("Color: ");
      gatos[i].setColor(sc.nextLine());
      System.out.print("Sexo: ");
      gatos[i].setSexo(sc.nextLine());
    }
    System.out.println();
    System.out.println("Datos de los gatos:");
    System.out.println();
    for (int i = 0; i < gatos.length; i++) {
      System.out.println(gatos[i].getNombre() + ", " + gatos[i].getColor() + ", " + gatos[i].getSexo() );
    }
    sc.close();
  }
}
