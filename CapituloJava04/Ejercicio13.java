package CapituloJava04;
/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 */
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduzca el primer número: ");
        int b = sc.nextInt();
        System.out.print("Introduzca el primer número: ");
        int c = sc.nextInt();
        if(a>b && b>c){
            System.out.print(a+", "+b+", "+c);
        }else if(a>c && c>b){
            System.out.print(a+", "+c+", "+b);
        }else if(b>a && a>c){
            System.out.print(b+", "+a+", "+c);
        }else if (b>c && c>a){
            System.out.print(b+", "+c+", "+a);
        }else if(c>a && a>b){
            System.out.println(c+", "+ a+", "+b);
        }else if(c>b && b>a){
            System.out.println(c+", "+b+", "+a);
        }
        sc.close();
    }
}
