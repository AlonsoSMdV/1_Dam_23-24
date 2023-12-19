package Test_DAM;
import java.util.Scanner;
public class ExamenBucles02 {

  public static long volteado(long n){
    long nVolt = 0;
    while(n>0){
      nVolt = (n%10)+(nVolt*10);
      n /= 10;
    }
    return nVolt;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero(mayor que 0): ");
    long n = sc.nextLong();
    long volt = volteado(n);
    long aux = volt;
    int cont = 0;
    int digitoMayor = -1;
    while (aux > 0) {
      cont++;
      aux/=10;
    }
    //Imprime los digitos del numero separados por celdas
    for (int i = 0; i < cont; i++) {
      System.out.print("----");
    }
    System.out.println();
    System.out.print("| ");
    for (int i = 0; i < cont; i++) {
      System.out.print(volt%10+" | ");
      if((volt%10) > digitoMayor){
        digitoMayor = (int)volt%10;
      }
      volt/=10;
    }
    System.out.println();
    for (int i = 0; i < cont; i++) {
      System.out.print("----");
    }
    //Imprime la grafica de los digitos con asteriscos
    System.out.println();
    volt = volteado(n); //Reinicia la variable del numero volteado
    long volt2 = 0;
    for (int i = 1; i <= digitoMayor; i++) {
      volt2 = volt;//Iguala la variable de volt2 a volt en cada iteracion
      System.out.print("| ");
      for (int j = 0; j < cont; j++) {
          int digito = (int) (volt2 % 10);//Variable digito igual al ultimo digito del numero volteado
          if (digito >= i) {//Si el digito es mayor o igual a la variable i(Incremental del primer bucle) 
                            //pinta un asterisco sino un espacio
              System.out.print("* | ");
          } else {
              System.out.print("  | ");
          }
          volt2 /= 10;//Se va eliminando los digitos del numero volteado uno a uno desde el final
      }
      System.out.println();
  }

    for (int i = 0; i < cont; i++) {
      System.out.print("----");
    }
    System.out.println();
    sc.close();
  }
}
