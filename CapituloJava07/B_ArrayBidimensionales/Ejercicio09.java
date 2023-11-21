package CapituloJava07.B_ArrayBidimensionales;
/**
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
 * 12 filas por 12 columnas y debe contener números generados al azar entre 0 y
 * 100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
 * con los números convenientemente alineados.
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    int[][] num = new int[12][12];

    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num.length; j++) {
        num[i][j] = (int)(Math.random()*101);
      }
    }
    System.out.println("Matriz original: ");
    System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│");
    for (int i = 1; i <= 12; i++) {
      System.out.printf("%5d│",i);
    }
    System.out.println();
    System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    for (int i = 0; i < num.length; i++) {
      System.out.print("│");
      for (int j = 0; j < num.length; j++) {
        System.out.printf(" %4d│",num[i][j]);
      }
      System.out.printf("%3d\n",(i+1));
      if (i == num.length-1) {
        
      }else{
        System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      }
    
    }
    System.out.println("└─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    int[][] resultado = new int[12][12];
    int capa;
    int aux1;
    int aux2;
    for (capa = 0; capa < 6; capa++) {
      // Se guarda el valor en la esquina superior derecha de la capa actual en 'aux1'.
      aux1 = num[capa][11 - capa];
      // Se realiza la rotación en sentido horario para la capa actual moviendo los 
      //valores en cada posición hacia la posición siguiente en la matriz 'resultado'.
      for (int j = 11-capa; j > capa; j--) {
        resultado[capa][j] = num[capa][j - 1];
      }
      // Se guarda el valor en la esquina inferior derecha de la capa actual en 'aux2'.
      aux2 = num[11-capa][11-capa];
      // Se realiza la rotación en sentido horario para la columna derecha de la capa actual.
      for (int j = 11 - capa; j > capa + 1;j--) {
        resultado[j][11-capa] = num[j-1][11-capa];
      }
      // Se actualiza la esquina inferior derecha de la capa actual con el valor almacenado en 'aux1'.
      resultado[capa+1][11-capa] = aux1;
      // Se guarda el valor en la esquina inferior izquierda de la capa actual en 'aux1'.
      aux1 = num[11-capa][capa];
      // Se realiza la rotación en sentido horario para la fila inferior de la capa actual.
      for (int j = capa; j < 11-capa; j++) {
        resultado[11-capa][j] = num[11-capa][j+1];
      }
      // Se actualiza la esquina inferior izquierda de la capa actual con el valor almacenado en 'aux2'.
      resultado[11-capa][11-capa-1]  = aux2;
      // Se realiza la rotación en sentido horario para la columna izquierda de la capa actual.
      for (int j = capa; j < 11-capa; j++) {
        resultado[j][capa] = num[j+1][capa];
      }
      // Se actualiza la esquina superior izquierda de la capa actual con el valor almacenado en 'aux1'.
      resultado[11-capa-1][capa] = aux1;
    }
    System.out.println("Matriz resultado: ");
    System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│");
    for (int i = 1; i <= 12; i++) {
      System.out.printf("%5d│",i);
    }
    System.out.println();
    System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    for (int i = 0; i < num.length; i++) {
      System.out.print("│");
      for (int j = 0; j < num.length; j++) {
        System.out.printf(" %4d│",resultado[i][j]);
      }
      System.out.printf("%3d\n",(i+1));
      if (i == num.length-1) {
        
      }else{
        System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      }
    
    }
    System.out.println("└─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
