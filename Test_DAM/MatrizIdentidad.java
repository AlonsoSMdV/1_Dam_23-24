package Test_DAM;

import java.util.Scanner;

public class MatrizIdentidad {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Diga la anchura de la matriz");
    int ancho = sc.nextInt();
    int[][] matriz = new int[ancho][ancho];
    int diagonal = -1;
    for(int i = 0; i < ancho; i++){
        diagonal++;
        for(int j = 0; j < ancho; j++){
            if(j == i){
                matriz[i][j] = 1;
            }else{
                if(i == 0 || j == 0 || j == ancho-1 || i == ancho-1 || (i == diagonal && j == ancho-diagonal-1)){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                  
                }
            }
        }
    } 

    for(int i = 0; i < ancho; i++){
        for(int j = 0; j < ancho; j++){
            System.out.print(matriz[i][j]+" ");
        }
        System.out.println();
    }

    sc.close();
}
}
