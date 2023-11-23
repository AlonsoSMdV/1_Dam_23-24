package CapituloJava07.B_ArrayBidimensionales;
/**
 * Realiza un programa que calcule la estatura media, mínima y máxima en
 * centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los países se deben mostrar utilizando el array de países (no se pueden escribir
 * directamente).
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    String[] pais = {"España", "Rusia", "Japón", "Australia"};
    int filas = 4;
    int columnas = 10;
    int[][] altura = new int[filas][columnas];
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        altura[i][j] = (int)(Math.random()*70+140);
      }
    }
    int maxAlt = 140;
    int minAlt = 210;
    double sumaAltura = 0;
    double media;
    System.out.printf("%64s\n", "MED MIN MAX");
    for (int i = 0; i < filas; i++) {
      sumaAltura = 0;
      maxAlt = 140;
      minAlt = 210;
      System.out.printf("%9s:", pais[i]);
      for (int j = 0; j < columnas; j++) {
        System.out.printf("%4d", altura[i][j]);
        if (altura[i][j] > maxAlt) {
          maxAlt = altura[i][j];
        }
        if (altura[i][j] < minAlt) {
          minAlt = altura[i][j];
        }
        sumaAltura+= altura[i][j];
      }
      media = sumaAltura/10;
      System.out.print(" |");
      System.out.printf("%4.0f%4d%4d", media, minAlt, maxAlt);
      System.out.println();
    }
  }
}
