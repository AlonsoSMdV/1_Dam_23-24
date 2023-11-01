package CapituloJava06;
/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n).
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    int palos = (int)(Math.random()*4+1);
    int numero = (int)(Math.random()*13+1);
    String carta = "";
    switch (numero) {
      case 1:
        carta += "A de ";
        break;

      case 2:
        carta += "2 de ";
        break;

      case 3:
        carta += "3 de ";
        break;

      case 4:
        carta += "4 de ";
        break;

      case 5:
        carta += "5 de ";
        break;

      case 6:
        carta += "6 de ";
        break;

      case 7:
        carta += "7 de ";
        break;

      case 8:
        carta += "8 de ";
        break;

      case 9:
        carta += "9 de ";
        break;

      case 10:
        carta += "10 de ";
        break;

      case 11:
        carta += "J de ";
        break;

      case 12:
        carta += "Q de ";
        break;

      case 13:
        carta += "K de ";
        break;

    
      default:
        break;
    }
    switch (palos) {
      case 1:
        carta += "picas";
        break;

      case 2:
        carta += "corazones";
        break;

      case 3:
        carta += "diamantes";
        break;

      case 4:
        carta += "tréboles";
        break;
    
      default:
        break;
    }
    
    System.out.println(carta);
  }
}
