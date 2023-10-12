package CapituloJava04;
/**
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 */
import java.util.Scanner;

public class Ejercicio29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = sc.nextLine();
    String tipoPitufo = "";
    double precioComida = 0;
    double precioBebida = 0;
    switch (comida) {
      case "palmera":
      precioComida = 1.40;
      break;
        
      case "donut":
        precioComida = 1;
        break;

      case "pitufo":
      System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
      tipoPitufo = sc.nextLine();
        if (tipoPitufo.equals("aceite")) {
          precioComida = 1.20;
        }else{
          precioComida = 1.60;
        }
        break;
        
        default:
        break;
      }
      
      
      System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
      String bebida = sc.nextLine();
      switch (bebida) {
      case "zumo":
        precioBebida = 1.50;
        break;
    
      case "cafe":
        precioBebida = 1.20;
        break;
      default:
        break;
    }

    if (comida.equals("palmera")) {
      System.out.printf(comida+": %.2f €\n",precioComida);
    }else if (comida.equals("donut")) {
      System.out.printf(comida+": %.2f €\n",precioComida);
    }else if (comida.equals("pitufo")) {
      System.out.printf(comida+"con "+tipoPitufo+": %.2f €\n",precioComida);
    }

    if (bebida.equals("zumo")) {
      System.out.printf(bebida+": %.2f €\n",precioBebida);
    }else if (bebida.equals("cafe")) {
      System.out.printf(bebida+": %.2f €\n",precioBebida);
    }
    System.out.printf("Total desayuno: %.2f €",(precioBebida+precioComida));
    sc.close();
  }
}
