package CapituloJava04;
/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 * de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 * la nota media anterior.
 */
import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nota del primer control: ");
    double n1 = sc.nextDouble();
    System.out.print("Nota del segundo control: ");
    double n2 = sc.nextDouble();
    double media = (n1 + n2)/2;
    
    if(media >= 5){
      System.out.println("Tu nota de Programación es "+media);
    }else{
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recu = sc.next();
      if(recu.equals("apto")){
        System.out.println("Tu nota de Programación es 5");
      }else{
        System.out.println("Tu nota de Programación es "+media);
      }
    }
    sc.close();
  }
}
