package EjemplosFunciones;
import java.util.Scanner;
public class EjercicioEJ01 {
  public static Scanner sc = null;
  /**
   * iniciar
   * inicia el Scanner para leer desde teclado
   */
  public static void inicializa(){
    sc = new Scanner(System.in);
  }
  /**
   * cierra el Scanner para liberar recuersos
   */
  public static void finaliza(){
    sc.close();
  }

  public static void mostrarMenu(){
    System.out.println("Elija una opcion:");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Salir");
  }

  public static int pedirOpcion(){
    System.out.print("Introduzca una opcion: ");
    return sc.nextInt();
  }

  public static int suma(int n1, int n2){
    int suma = n1 + n2;
    return suma;
  }

  public static int resta(int n1, int n2){
    int resta = n1 - n2;
    return resta;
  }

  public static void main(String[] args) {
    inicializa();
    mostrarMenu();
    int opcion = pedirOpcion();
    int a, b;
    switch (opcion) {
      case 1:
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d + %d = %d\n",a,b,suma(a, b));
        break;

      case 2:
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d + %d = %d\n",a,b,resta(a, b));
        break;

      case 3:

        System.out.println("Hasta luego");
        break;
    
      default:
        break;
    }
    
    finaliza();
  }
}
