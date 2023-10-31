package CapituloJava06;
/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    int palos = (int)(Math.random()*4+1);
    int numero = (int)(Math.random()*10+1);
    String carta = "";
    switch (numero) {
      case 1:
        carta += "As de ";
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
        carta += "Sota de ";
        break;

      case 9:
        carta += "Caballo de ";
        break;

      case 10:
        carta += "Rey de ";
        break;

    
      default:
        break;
    }
    switch (palos) {
      case 1:
        carta += "bastos";
        break;

      case 2:
        carta += "espadas";
        break;

      case 3:
        carta += "copas";
        break;

      case 4:
        carta += "oros";
        break;
    
      default:
        break;
    }
    System.out.println(carta);
  }
}
