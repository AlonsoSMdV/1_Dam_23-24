package CapituloJava04;
/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 */
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, a continuación indique tres notas de examen");
    System.out.print("Primera nota: ");
    double n1 = sc.nextDouble();
    System.out.print("Segunda nota: ");
    double n2 = sc.nextDouble();
    System.out.print("Tercera nota: ");
    double n3 = sc.nextDouble();

    double media = (n1+n2+n3)/3;
    if(media<5){
      System.out.printf("Tu nota media es de %.2f. INSUFICIENTE",media);
    }else if(media>=5 && media <6){
      System.out.printf("Tu nota media es de %.2f. SUFICIENTE",media);
    }else if(media>=6 && media <7){
      System.out.printf("Tu nota media es de %.2f. BIEN",media);
    }else if(media>=7 && media <9){
      System.out.printf("Tu nota media es de %.2f. NOTABLE",media);
    }else if(media>=9 && media <=10){
      System.out.printf("Tu nota media es de %.2f. SOBRESALIENTE",media);
    }
    sc.close();
  }
}
