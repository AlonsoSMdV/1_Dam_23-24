package CapituloJava04;
/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 */

import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("MINICUESTIONARIO(Responde a estas preguntas con V(verdadero) o F(falso))");
    int puntuación = 0;
    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?\n1) int\n2) double\n3) float");
    int respuesta1 = sc.nextInt();
    if(respuesta1 == 2){
      puntuación++;
    }
    System.out.println("2.¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos\n1) XML\n2) SELECT\n3) SQL");
    int respuesta2= sc.nextInt();
    if(respuesta2 == 3){
      puntuación++;
    }
    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...\n1) href\n2) a\n3) link");
    int respuesta3 = sc.nextInt();
    if(respuesta3 == 2){
      puntuación++;
    }
    System.out.println("4.  ¿En qué directorio se encuentran los archivos de configuración de Linux?\n1) /etc\n2) /config\n3) /cfg");
    int respuesta4 = sc.nextInt();
    if(respuesta4 == 1){
      puntuación++;
    }
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?1) RAM\n2) EPROM\n3) ROM");
    int respuesta5 = sc.nextInt();
    if(respuesta5 == 1){
      puntuación++;
    }
  
    System.out.println("La puntuación obtenida es de "+puntuación+" puntos");
    sc.close();
  }
}

