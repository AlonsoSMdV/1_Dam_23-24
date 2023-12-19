package Test_DAM;
import java.util.Scanner;
public class RotarMatriz90 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int k=1;
    String seguir = "";
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = k++;
      }
    }

    
    do {
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
          System.out.print(matriz[i][j]+" ");
        }
        System.out.println();
      }
  
      int[][] auxiliar = new int[3][3];
      for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
  
            auxiliar[matriz.length-1-i][j] = matriz[i][j];
        }
    }
  
    for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz.length;j++){
  
            matriz[i][j]=auxiliar[i][j];
        }
    }
  System.out.println();
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
          System.out.print(matriz[i][j]+" ");
        }
        System.out.println();
      }
      
      System.out.println("Seguir?");
      seguir = sc.next();
    } while (seguir.equals("s"));
    sc.close();
  }
}
