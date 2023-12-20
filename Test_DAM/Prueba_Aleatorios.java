package Test_DAM;
/**
 * JUEGO DE LAS 7 Y MEDIA
 */
import java.util.Scanner;
public class Prueba_Aleatorios {
  public static double valorCarta(int n, double NCarta){
    NCarta = 0;
    switch (n % 10) {
      case 0:
        NCarta += 1;
        break;
      case 1:
        NCarta += 2;
        break;
      case 2:
        NCarta += 3;
        break;
      case 3:
        NCarta += 4;
        break;
      case 4:
        NCarta += 5;
        break;
      case 5:
        NCarta += 6;
        break;
      case 6:
        NCarta += 7;
        break;
      case 7:
        NCarta += 0.5;
        break;
      case 8:
        NCarta += 0.5;
        break;
      case 9:
        NCarta += 0.5;
        break;
    
      default:
        break;
    }
    return NCarta;
  }
  public static void numeroCarta(int n){
    switch (n % 10) {
        case 0:
          System.out.print("As ");
          break;
          
        case 1:
          System.out.print("2 ");
          break;
          
        case 2:
          System.out.print("3 ");
          break;
          
        case 3:
          System.out.print("4 ");
          break;
        
        case 4:
          System.out.print("5 ");
          break;

        case 5:
          System.out.print("6 ");
          break;

        case 6:
          System.out.print("7 ");
          break;

        case 7:
          System.out.print("Sota ");
          break;

        case 8:
          System.out.print("Caballo ");
          break;

        case 9:
          System.out.print("Rey ");
          break;
      
        default:
          break;
      }
  }
  public static void palos(int n){
    switch (n / 10) {
        case 0:
          System.out.print("de oros ");
          break;
          
        case 1:
          System.out.print("de copas ");
          break;
          
        case 2:
          System.out.print("de espadas ");
          break;
          
        case 3:
          System.out.print("de bastos ");
          break;
      
        default:
          break;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String terminar = "";
    double sumaCarta = 0;
    double NCarta = 0;
    boolean CPUFin = false;
    int ganador = 0;
    System.out.println("TURNO DEL JUGADOR");
    do {
      int carta = (int)(Math.random()*40);
      numeroCarta(carta);
      NCarta = valorCarta(carta, NCarta);
      sumaCarta += NCarta;
      
      palos(carta);
      System.out.printf("\nSu puntuacion ahora mismo es de: %.1f\n",sumaCarta);
      System.out.print("Desea plantarse? ");
      terminar = sc.next();
      if (terminar.equals("si") || terminar.equals("Si")) {
        System.out.println("TURNO DE LA CPU");
        double sumaCartaCpu = 0;
        NCarta = 0;
        do {
          carta = (int)(Math.random()*40);
          numeroCarta(carta);
          NCarta = valorCarta(carta, NCarta);
          sumaCartaCpu += NCarta;
        
          palos(carta);
          System.out.printf("\nSu puntuacion ahora mismo es de: %.1f\n",sumaCartaCpu);
        } while ( sumaCartaCpu < 7.5 );
        if ((Math.abs(7.5 - sumaCarta)) > (Math.abs(7.5 - sumaCartaCpu)) || (sumaCartaCpu == 7.5 && sumaCarta != 7.5)) {
          ganador = 2;
        }else if ((Math.abs(7.5 - sumaCarta)) < (Math.abs(7.5 - sumaCartaCpu)) || (sumaCartaCpu != 7.5 && sumaCarta == 7.5)) {
          ganador = 1;
        }else if (sumaCartaCpu == 7.5 && sumaCarta == 7.5) {
          
        }
        if (sumaCartaCpu >= 7.5) {
          CPUFin = true;
          break;
        }
      }
      
    } while (CPUFin || terminar.equals("no"));
    if(ganador == 1) {
      System.out.println("GANA EL JUGADOR");
    }else if (ganador == 2) {
      System.out.println("GANA LA CPU");
    }else if (ganador == 0) {
      System.out.println("EMPATE");
    }
    sc.close();
  }
}
