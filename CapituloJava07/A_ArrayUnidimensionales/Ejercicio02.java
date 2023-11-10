package CapituloJava07.A_ArrayUnidimensionales;
/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    char[] simbolo = new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    System.out.println();
    System.out.print("Valor");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3s'"+simbolo[i]+"'", " ");
    }System.out.println();
    System.out.println("Los valores de los elementos no inicializados se inicializan solos a un simbolo vacio");
  }
}
