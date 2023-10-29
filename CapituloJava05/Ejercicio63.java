package CapituloJava05;
/**
 * Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
 * una al lado de la otra y separadas por un espacio en su base.
 */
import java.util.Scanner;
public class Ejercicio63 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura de la primera piramide: ");
    int altura1 = sc.nextInt();
    System.out.print("Introduzca la altura de la segunda piramide: ");
    int altura2 = sc.nextInt();
    int posicion=0;

    if(altura1>altura2){
        posicion=1;
    }
    if(altura1<altura2){
        posicion=2;
    }
    if(altura1==altura2){
        posicion=3;
    }
    int difPiramides = 0;
    switch(posicion){
        case 1:

        difPiramides=altura1-altura2;

            for(int i=1;i<=altura1;i++){
              //solo la primera piramide
              for(int j=1;j<=altura1-i;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
              }
              //Cuando i iguale la dferencia entre alturas  empieza a pintar las dos piramides
              if(i>difPiramides){
                for(int j=1;j<=altura1-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=altura2-i+difPiramides+1;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(i-difPiramides)*2-1;j++){
                  System.out.print("*");
                }
              }
              System.out.println("");
            }

        break;
        case 2:
        difPiramides=altura2-altura1;
        int alturaAux=altura2;
        for(int i=1;i<=altura2;i++){

            if(i<=altura2-altura1){
              for(int j=1;j<altura1*2-1+(alturaAux*2)/2+1;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
              }
              System.out.println("");
              alturaAux--;
            }else{
              for(int j=1;j<=altura1-i+difPiramides;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=(i-difPiramides)*2-1;j++){
                System.out.print("*");
              }
              for(int j=1;j<=altura1-i+difPiramides+1;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=altura1-i+difPiramides;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
              }
              System.out.println("");
            }
          }
        break;

        case 3:
          for(int i=1;i<=altura1;i++){
            for(int j=1;j<=altura1-i;j++){
              System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
              System.out.print("*");
            }
            for(int j=1;j<=altura1-i;j++){
              System.out.print(" ");
            }
            for(int j=1;j<=altura1-i;j++){
              System.out.print(" ");
            }
            System.out.print(" ");//para separarlas
            for(int j=1;j<=i*2-1;j++){
              System.out.print("*");
            }
            System.out.println("");
          }
        break;
    }
    sc.close();
  }
}
