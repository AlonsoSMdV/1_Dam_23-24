package CapituloJava06;
/**
 * Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
 * partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
 * muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
 * 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
 * si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
 * suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
 * da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
 * entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
 * ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
 * pierde. Si sale otro número, tiene que seguir tirando.
 */
import java.util.Scanner;
public class Ejercicio31 {
  public static void main(String[] args) {
        System.out.println("█████████████████████████");
        System.out.println("█ █ C █ R █ A █ P █ S █ █");
        System.out.println("█████████████████████████");
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuánto dinero quiere apostar? ");
        int dinero = sc.nextInt();
        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);
        int suma = dado1 + dado2;
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma: " + suma);
        switch (suma) {
            case 7:
            case 11:
                System.out.println("¡Enhorabuena! ¡Ha ganado otros " + dinero + " €!");
                System.out.println("¡Ahora tiene " + dinero * 2 + " €!");
                break;
            case 2:
            case 3:
            case 12:
                System.out.println("Lo siento, ha perdido todo su dinero");
                break;
            default:
                System.out.print("Tiene que seguir tirando, debe conseguir el ");
                System.out.println(suma + " para ganar.");
                System.out.println("Si obtiene un 7, perderá la partida.");
                System.out.println("Pulse INTRO para tirar los dados.");
                sc.nextLine();
                boolean partidaTerminada = false;
                do {
                dado1 = (int) (Math.random() * 6 + 1);
                dado2 = (int) (Math.random() * 6 + 1);
                System.out.println("Dado 1: " + dado1);
                System.out.println("Dado 2: " + dado2);
                System.out.println("Suma: " + (dado1 + dado2));
                if ((dado1 + dado2) == suma) {
                    System.out.println("¡Enhorabuena! ¡Ha ganado otros " + dinero + " €!");
                    System.out.println("¡Ahora tiene " + dinero * 2 + " €!");
                    partidaTerminada = true;
                } else if ((dado1 + dado2) == 7) {
                    System.out.println("Lo siento, ha perdido todo su dinero");
                    partidaTerminada = true;
                } else {
                    System.out.println("Continúe jugando.");
                    System.out.println("Pulse INTRO para tirar los dados.");
                    sc.nextLine();
                }
            } while (!partidaTerminada);
        }
        sc.close();
    }
}
