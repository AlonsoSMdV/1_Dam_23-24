package CapituloJava06;
/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    for (int i = 0; i < 14; i++) {
      int apuesta1 = (int)(Math.random()*6+1);
      int apuesta2 = (int)(Math.random()*6+1);
      int apuesta3 = (int)(Math.random()*6+1);
      switch (apuesta1) {
        case 1:
          System.out.print("| 1 | ");
          break;

        case 2:
          System.out.print("| 1 | ");
          break;

        case 3:
          System.out.print("| 1 | ");
          break;

        case 4:
          System.out.print("| X | ");
          break;

        case 5:
          System.out.print("| X | ");
          break;

        case 6:
          System.out.print("| 2 | ");
          break;
      
        default:
          break;
      }

      switch (apuesta2) {
        case 1:
          System.out.print("| 1 | ");
          break;

        case 2:
          System.out.print("| 1 | ");
          break;

        case 3:
          System.out.print("| 1 | ");
          break;

        case 4:
          System.out.print("| X | ");
          break;

        case 5:
          System.out.print("| X | ");
          break;

        case 6:
          System.out.print("| 2 | ");
          break;
      
        default:
          break;
      }

      switch (apuesta3) {
        case 1:
          System.out.print("| 1 | ");
          break;

        case 2:
          System.out.print("| 1 | ");
          break;

        case 3:
          System.out.print("| 1 | ");
          break;

        case 4:
          System.out.print("| X | ");
          break;

        case 5:
          System.out.print("| X | ");
          break;

        case 6:
          System.out.print("| 2 | ");
          break;
      
        default:
          break;
      }
      System.out.println();
    }
    int pleno = (int)(Math.random()*6+1);
    switch (pleno) {
      case 1:
          System.out.print("| 1 | ");
          break;

        case 2:
          System.out.print("| 1 | ");
          break;

        case 3:
          System.out.print("| 1 | ");
          break;

        case 4:
          System.out.print("| X | ");
          break;

        case 5:
          System.out.print("| X | ");
          break;

        case 6:
          System.out.print("| 2 | ");
          break;

      default:
        break;
    }
  }
}
