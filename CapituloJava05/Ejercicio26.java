package CapituloJava05;
/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 */ 
import java.util.Scanner;
public class Ejercicio26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero: ");
    long n = sc.nextLong();
    System.out.print("A continuacion, introduzca un numero del cual desee buscar la posicion: ");
    int nBuscado = sc.nextInt();
    
    //Volteamos el numero para saber la posicion de cada numero si se contase de izquierda a derecha
    //EJ: 12345 el 1 es la posicion uno por lo que debemos voltear para que cuente bien las posiciones
    long nReves = 0;
    while(n>0){
      nReves = (n%10) + (nReves*10);
      n/=10;
    }

    long aux = 0;
    int cuentadigitos = 0;
    String posicion = "Posiciones:\n";
    while(nReves>0){
      aux = nReves % 10;
      cuentadigitos++;
      if(aux == nBuscado){
        posicion += cuentadigitos+"\n";
      }
      aux = 0;
      nReves/=10;
    }
    System.out.println(posicion);
    sc.close();
  }
}
