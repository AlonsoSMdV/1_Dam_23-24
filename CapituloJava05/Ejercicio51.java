package CapituloJava05;
/**
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
 * (todos los que encuentre). Realiza un programa que muestre un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 */
import java.util.Scanner;
public class Ejercicio51 {

  public static long volteado(long n){
    long nVolt = 0;
    while(n>0){
      nVolt = (n%10)+(nVolt*10);
      n/=10;
    }
    return nVolt;
  }

  public static int cuentaDigitos(long n){
    int contador = 0;
    while(n > 0){
      n/=10;
      contador++;
    }
    return contador;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hay un gusano que se comera los numeros 8 y 0 ");
    System.out.print("Diga el numero ");
    long numero = sc.nextLong();
    long volteado = volteado(numero);
    int contador=cuentaDigitos(numero);
    
    long resultado = 0;
    for(int i=1;i<=contador;i++){
        if(volteado%10!=0 && volteado%10!=8){
            resultado = (volteado%10) + (resultado*10);
        }
        volteado/=10;
    }
    if(resultado == numero){
      System.out.println("El gusano no se comio ningun numero");
    }else{
      System.out.print("Después de haber sido comido por el gusano numérico se queda en "+resultado);
    }
    sc.close();
  }
}
