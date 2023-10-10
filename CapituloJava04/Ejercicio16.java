package CapituloJava04;
/**
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
 * está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
 * con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
 * puntos. Las preguntas contestadas con falso no suman puntos. A continuación
 * se listan las preguntas del test.
 */
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("TEST DE la INFIDELIDAD");
    System.out.println("Contesta a estas preguntas con verdadero(V) o falso(F) para saber si tu para te es infiel o no");
    String respuesta;
    int puntos = 0;
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("9. Has notado que últimamente se perfuma más");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuesta = sc.nextLine();
    if(respuesta.equals("V")||respuesta.equals("v")){
      puntos=puntos + 3;
    }

    System.out.print(puntos);
    if(puntos <= 10){
      System.out.println(" ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }else if(puntos >10 && puntos <23){
      System.out.println(" Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }else if(puntos >22 && puntos <31){
      System.out.println(" Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
    sc.close();
  }
}
