package Test_DAM;
import java.util.Scanner;
public class Prueba_Aleatorios02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-A-L-E-A-T-O-R-I-U-M-");
    System.out.println("Aleatorium pensara un numero entre los valores que decidas");
    System.out.print("Introduzca el valor minimo del intervalo: ");
    int min = sc.nextInt();
    System.out.print("Introduzca el valor maximo del intervalo: ");
    int max = sc.nextInt();
    System.out.println("-A-L-E-A-T-O-R-I-U-M-");
    if (max > min) {
      int intervaloMin = 0;
      int intervaloMax = 0;
      int salir = 0;
      do {
        
        do {
          intervaloMin = (int)(Math.random()*(max-min+1)+min);
          intervaloMax = (int)(Math.random()*(max-min+1)+min);
        } while (intervaloMax < intervaloMin);
        System.out.println("Estoy pensando un numero entre "+ intervaloMin +" y " + intervaloMax);
        int intentos = (int)(Math.log(intervaloMax-intervaloMin)/Math.log(2));
        System.out.println("Tienes " + intentos + " intentos");
        boolean acertado = true;
        int resultado = (int)(Math.random()*(intervaloMax-intervaloMin+1)+intervaloMin);
        System.out.println(resultado);
        do {
          
          if (intentos > 0) {
            System.out.print("Escribe el numero: ");
            int num = sc.nextInt();
            if (num > resultado) {
            System.out.println("Te has pasado");
            intentos--;
            }else if (num < resultado) {
              System.out.println("Te has quedado corto");
              intentos--;
            }else if (num == resultado) {
              acertado = false;
              System.out.println("ENHORABUENA!!! Has acertado el numero era "+resultado);
            }
          }else{
            acertado = false;
            System.out.println("Has superado los intentos maximos\nEl numero era: "+resultado);
          }
          
        } while (acertado);
        System.out.println("Elige una opcion\n1. Seguir jugando\n2. Salir del juego");
        System.out.print("Opcion: ");
        salir = sc.nextInt();
      } while (salir != 2);
      System.out.println("Gracias por jugar a -A-L-E-A-T-O-R-I-U-M-");
    }else{
      System.out.println("Los valores estan mal colocados");
    }
    sc.close();
  }
}