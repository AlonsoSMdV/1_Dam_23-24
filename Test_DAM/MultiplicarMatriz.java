package Test_DAM;

import java.util.Scanner;

public class MultiplicarMatriz {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ancho = 3; 

        int[][] matriz1 = new int[ancho][ancho];
        int[][] matriz2 = new int[ancho][ancho];
        int[][] auxiliar = new int[ancho][ancho];
        int total = 0;

        for(int i=0;i<ancho;i++){
            for(int j=0;j<ancho;j++){
                matriz1[i][j]=(int)(Math.random()*3+1);
                System.out.printf("%3d ",matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<ancho;i++){
            for(int j=0;j<ancho;j++){
                matriz2[i][j]=(int)(Math.random()*3+1);
                System.out.printf("%3d ",matriz2[i][j]);
            }
            System.out.println();
        }

        
        System.out.println();

        for(int i=0;i<ancho;i++){
            for(int j=0;j<ancho;j++){
                total=0;
                for(int k=0;k<ancho;k++){
                    total= total+ matriz1[i][k]*matriz2[k][j];
                }
                auxiliar[i][j]=total;
            }
        }

        for(int i=0;i<ancho;i++){
            for(int j=0;j<ancho;j++){
                System.out.printf("%3d ",auxiliar[i][j]);
            }
            System.out.println();
        }


        sc.close();
      }
}
