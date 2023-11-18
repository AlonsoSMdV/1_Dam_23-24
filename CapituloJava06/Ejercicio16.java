package CapituloJava06;
/**
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 * perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    int contCorazon = 0;
    int contDiamante = 0;
    int contHerradura = 0;
    int contCampana = 0;
    int contLimon = 0;
    for (int i = 1; i <= 3; i++) {
      int figura = (int)(Math.random()*5+1);
      switch (figura) {
        case 1:
          System.out.print("Corazon ");
          contCorazon++;
          break;

        case 2:
          System.out.print("Diamante ");
          contDiamante++;
          break;

        case 3:
          System.out.print("Herradura ");
          contHerradura++;
          break;

        case 4:
          System.out.print("Campana ");
          contCampana++;
          break;

        case 5:
          System.out.print("Limón ");
          contLimon++;
          break;
      
        default:
          break;
      }
    }
    System.out.println();
    if (contCampana == 3 || contCorazon == 3 || contDiamante == 3 || contHerradura == 3 || contLimon == 3) {
      System.out.println("Enhorabuena, ha ganado 10 monedas");
    } else if(contCampana == 2 || contCorazon == 2 || contDiamante == 2 || contHerradura == 2 || contLimon == 2){
      System.out.println("Bien, ha recuperado su moneda\r");
    }else{
      System.out.println("Lo siento, ha perdido");
    }
  }
}
