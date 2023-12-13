package Test_DAM;

import java.util.Scanner;
public class PruebaArrays {
  public static void menu() {
    System.out.println("a. Izquierda");
    System.out.println("d. Derecha");
    System.out.println("s. Abajo");
    System.out.println("w. Arriba");
    System.out.println("p. Pintar");
    System.out.println("b. Borrar");
    System.out.println("m. Mover");
    System.out.println("ra. Rotar en sentido antihorario");
    System.out.println("rh. Rotar en sentido horario");
    System.out.println("eh. Espejo horizontal");
    System.out.println("ev. Espejo vertical");
    System.out.println("l. Limpiar tablero");
    System.out.println("q. Salir");
  }
  public static char[][] inicializarMatriz(char[][] matriz, int ancho){
    for (int i = 0; i < ancho; i++) {
      for (int j = 0; j < ancho; j++) {
        matriz[i][j] = ' ';
      }
    }
    return matriz;
  }
  public static void pintarMatriz(char[][] matriz, char cabezal, int cabezalX, int cabezalY, int ancho){
    for (int i = 0; i < ancho; i++) {
      for (int j = 0; j < ancho; j++) {
        if (i == 0 || i == ancho-1 ||j == 0 || j == ancho-1) {
          System.out.print("* ");
        }else if (i == cabezalX && j == cabezalY) {
          System.out.print(cabezal+" ");
        } else {
          System.out.print(matriz[i][j]+" ");
        }
      }
      System.out.println();
    }
  }
  public static char[][] rotarHorario(char[][] matriz,int ancho){
    char[][] matrizRotada = new char[ancho][ancho];
    for (int i = 0; i < matrizRotada.length; i++) {
      for (int j = 0; j < matrizRotada.length; j++) {
        matrizRotada[j][ancho-1-i] = matriz[i][j];
      }
    }
    for (int i = 0; i < matrizRotada.length; i++) {
      for (int j = 0; j < matrizRotada.length; j++) {
        matriz[i][j] = matrizRotada[i][j];
      }
    }
    return matriz;
  }
  public static char[][] rotarAntiHorario(char[][] matriz,int ancho){
    char[][] matrizRotada = new char[ancho][ancho];
    for (int i = 0; i < matrizRotada.length; i++) {
      for (int j = 0; j < matrizRotada.length; j++) {
        matrizRotada[ancho-1-j][i] = matriz[i][j];
      }
    }
    for (int i = 0; i < matrizRotada.length; i++) {
      for (int j = 0; j < matrizRotada.length; j++) {
        matriz[i][j] = matrizRotada[i][j];
      }
    }
    return matriz;
  }
  public static char[][] espejoVertical(char[][] matriz,int ancho){
    char[][] matrizEspejo = new char[ancho][ancho];
    for (int i = 0; i < matrizEspejo.length; i++) {
      for (int j = 0; j < matrizEspejo.length; j++) {
        matrizEspejo[ancho-1-i][j] = matriz[i][j];
      }
    }
    for (int i = 0; i < matrizEspejo.length; i++) {
      for (int j = 0; j < matrizEspejo.length; j++) {
        matriz[i][j] = matrizEspejo[i][j];
      }
    }
    return matriz;
  }
  public static char[][] espejoHorizontal(char[][] matriz,int ancho){
    char[][] matrizEspejo = new char[ancho][ancho];
    for (int i = 0; i < matrizEspejo.length; i++) {
      for (int j = 0; j < matrizEspejo.length; j++) {
        matrizEspejo[i][ancho-1-j] = matriz[i][j];
      }
    }
    for (int i = 0; i < matrizEspejo.length; i++) {
      for (int j = 0; j < matrizEspejo.length; j++) {
        matriz[i][j] = matrizEspejo[i][j];
      }
    }
    return matriz;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ancho = 11;
    int cabezalX = 5;
    int cabezalY = 5;
    char cabezal = 'M';
    int opcionCabezal = 0;
    String opcion = "";
    char[][] matrizOriginal = new char[ancho][ancho];
    inicializarMatriz(matrizOriginal, ancho);
    
    do {
      
      pintarMatriz(matrizOriginal, cabezal, cabezalX, cabezalY, ancho);
      menu();
      opcion = sc.next();
      switch (opcion) {
        case "a":
          cabezalY--;
          if (cabezalY == 0) {
            cabezalY++;
          }

          if (opcionCabezal == 2) {
            matrizOriginal[cabezalX][cabezalY] = ' ';
          }
          if (opcionCabezal == 1) {
            matrizOriginal[cabezalX][cabezalY] = 'X';
          }
          break;
        
        case "d":
          cabezalY++;
          if (cabezalY == 10) {
            cabezalY--;
          }

          if (opcionCabezal == 2) {
            matrizOriginal[cabezalX][cabezalY] = ' ';
          }
          if (opcionCabezal == 1) {
            matrizOriginal[cabezalX][cabezalY] = 'X';
          }
          break;
  
        case "s":
          cabezalX++;
          if (cabezalX == 10) {
            cabezalX--;
          }

          if (opcionCabezal == 2) {
            matrizOriginal[cabezalX][cabezalY] = ' ';
          }
          if (opcionCabezal == 1) {
            matrizOriginal[cabezalX][cabezalY] = 'X';
          }
          break;
  
        case "w":
          cabezalX--;
          if (cabezalX == 0) {
            cabezalX++;
          }

          if (opcionCabezal == 2) {
            matrizOriginal[cabezalX][cabezalY] = ' ';
          }
          if (opcionCabezal == 1) {
            matrizOriginal[cabezalX][cabezalY] = 'X';
          }
          break;
  
        case "p":
          cabezal = 'P';
          opcionCabezal = 1;
          matrizOriginal[cabezalX][cabezalY] = 'X';
          break;
  
        case "b":
          cabezal = 'B';
          opcionCabezal = 2;
          matrizOriginal[cabezalX][cabezalY] = ' ';
          break;
  
        case "m":
          cabezal = 'M';
          opcionCabezal = 0;
          break;
  
        case "ra":
          rotarAntiHorario(matrizOriginal, ancho);
          break;
  
        case "rh":
          rotarHorario(matrizOriginal, ancho);
          break;
  
        case "eh":
          espejoHorizontal(matrizOriginal, ancho);
          break;
  
        case "ev":
          espejoVertical(matrizOriginal, ancho);
          break;
  
        case "l":
          inicializarMatriz(matrizOriginal, ancho);
          break;
  
        case "q":
          break;
      
        default:
          break;
      }
    } while (!opcion.equals("q"));
    sc.close();
  }
}
