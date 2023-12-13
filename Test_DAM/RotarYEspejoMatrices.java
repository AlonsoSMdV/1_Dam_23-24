package Test_DAM;

public class RotarYEspejoMatrices {
  public static void pintarMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

  public static int[][] rotarHorario(int[][] matriz,int ancho){
    int[][] matrizRotada = new int[ancho][ancho];
    for (int i = 0; i < matrizRotada.length; i++) {
      for (int j = 0; j < matrizRotada.length; j++) {
        matrizRotada[j][ancho-1-i] = matriz[i][j];
      }
    }
    return matrizRotada;
  }
  public static int[][] rotarAntiHorario(int[][] matriz,int ancho){
    int[][] matrizRotada = new int[ancho][ancho];
    for (int i = 0; i < matrizRotada.length; i++) {
      for (int j = 0; j < matrizRotada.length; j++) {
        matrizRotada[ancho-1-j][i] = matriz[i][j];
      }
    }
    
    return matrizRotada;
  }
  public static int[][] espejoVertical(int[][] matriz,int ancho){
    int[][] matrizEspejo = new int[ancho][ancho];
    for (int i = 0; i < matrizEspejo.length; i++) {
      for (int j = 0; j < matrizEspejo.length; j++) {
        matrizEspejo[ancho-1-i][j] = matriz[i][j];
      }
    }
    return matrizEspejo;
  }
  public static int[][] espejoHorizontal(int[][] matriz,int ancho){
    int[][] matrizEspejo = new int[ancho][ancho];
    for (int i = 0; i < matrizEspejo.length; i++) {
      for (int j = 0; j < matrizEspejo.length; j++) {
        matrizEspejo[i][ancho-1-j] = matriz[i][j];
      }
    }
    return matrizEspejo;
  }
  public static void main(String[] args) {
    int ancho = 3;
    int k= 1;
    int[][] matriz = new int[ancho][ancho];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = k;
        k++;
      }
    }
    pintarMatriz(matriz);
    int[][] matrizHorario = rotarHorario(matriz, ancho);
    pintarMatriz(matrizHorario);
    int[][] matrizAntiHorario = rotarAntiHorario(matriz, ancho);
    pintarMatriz(matrizAntiHorario);
    int[][] matrizEspejoV = espejoVertical(matriz, ancho);
    pintarMatriz(matrizEspejoV);
    int[][] matrizEspejoH = espejoHorizontal(matriz, ancho);
    pintarMatriz(matrizEspejoH);

  }
}
