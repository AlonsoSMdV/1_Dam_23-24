package CapituloJava05;
/**
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de
 * sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
 * durante el 2018, han recibido muchos pedidos del cartel que muestra el número
 * 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
 * usuario se le pedirán dos datos, la altura del cartel y el número de espacios
 * que habrá entre los números. La altura mínima es 5. La anchura de los números
 * siempre es la misma. La parte superior de los cincos también es siempre igual.
 * La parte inferior del 5 sí que varía en función de la altura.
 */import java.util.Scanner;
public class Ejercicio50 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int alt = sc.nextInt();
    System.out.print("Introduzca los espacios entre los numeros: ");
    int espacios = sc.nextInt();
    if(alt < 5){
      System.out.println("No es correcto");
    }else{
      for (int i = 1; i <= alt; i++) {
        if(i<=3){
          System.out.print("*");
          for(int j=1;j<=espacios;j++){
              System.out.print(" ");
          }
          if(i==1 || i==3 || i==alt){
              System.out.print("****");
          }else{
              System.out.print("*");
          }
          if(i==1 || i==3 || i==alt){
              for(int j=1;j<=espacios;j++){
                  System.out.print(" ");
              }
          }else{
              for(int j=1;j<=espacios;j++){
                  System.out.print(" ");
              }
              System.out.print("   ");
          }    
          if(i==1 || i==3 || i==alt){
              System.out.print("****");
          }else{
              System.out.print("*");
          }
          System.out.println("");
      }else{
          System.out.print("*");
          for(int j=1;j<=espacios;j++){
              System.out.print(" ");
          }
          if(i==alt){
              System.out.print("***");
          }else{
              System.out.print("   ");
          }
          System.out.print("*");
          for(int j=1;j<=espacios;j++){
              System.out.print(" ");
          }
          if(i==alt){
              System.out.print("***");
          }else{
              System.out.print("   ");
          }
          System.out.print("*");
          System.out.println("");
        } 
      }
    }
    sc.close();
  }
}
