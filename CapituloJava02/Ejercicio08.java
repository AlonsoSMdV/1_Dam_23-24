package CapituloJava02;
/**
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. 
 * Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    char l1 = 'M';
    char l2 = 'u';
    char l3 = 'n';
    char l4 = 'd';
    char l5 = 'o';
    String cadena = l1+""+l2+""+l3+""+l4+""+l5;
    System.out.println("Hola "+cadena);
  }
}
