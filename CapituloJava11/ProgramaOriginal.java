package CapituloJava11;
//ESTE PROGRAMA ES SOLO UN EJEMPLO PARA EL EJERCICIO 5 DE FICHEROS Y PARA ESO VOY A HACER MUCHOS COMENTARIOS
import java.util.ArrayList;
/* ESTE ES OTRO COMENTARIO */
public class ProgramaOriginal {
  // UNO MAS JUSTO ANTES DEL MAIN
  public static void main(String[] args) {
    /* UN ARRAYLIST */
    ArrayList<String> a = new ArrayList<String>();
    //ADDS CON NOMBRES
    //JUAN
    a.add("Juan");
    /* MIGUEL */
    a.add("Miguel");
    //RODIRGO
    a.add("Rodrigo");
    /* ROCIO */
    a.add("Rocio");
    //SAMUEL
    a.add("Samuel");
    /* JOSE */
    a.add("Jose");
    //FIN DE LOS ADDS

    /*PRIMERO SYSTEM.OUT.PRINT */
    System.out.println("Contenido: ");
    //FOREACH
    for (String nombre : a) {
      /*SALIDA POR PANTALLA */
      System.out.println(nombre);
    }
    //FIN DEL FOR
  }//FIN DEL PROGRAMA
  //UNO MAS PORQUE SI
}
