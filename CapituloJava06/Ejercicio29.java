package CapituloJava06;
/**
 * Realiza un programa que muestre la previsión del tiempo para mañana en
 * Málaga. Las temperaturas máxima y mínima se deben generar de forma
 * aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
 * últimas décadas para cada estación. La probabilidad de que esté soleado
 * o nublado en cada estación se proporciona a continuación. Obviamente, la
 * temperatura mínima deberá ser menor o igual que la temperatura máxima.
 */
import java.util.Scanner;
public class Ejercicio29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Primavera\n2. Verano\n3. Otoño\n4. Invierno");
    System.out.print("Seleccione la estacion del año(1 - 4): ");
    int est = sc.nextInt();
    int tempMin = 0;
    int tempMax = 0;
    int aux = 0;
    String cielo = "";
    switch (est) {
      case 1:
        System.out.println("Prevision del tiempo para mañana");
        System.out.println("----------------------------------");
        tempMin = (int)(Math.random()*16+15);
        tempMax = (int)(Math.random()*16+15);
        if(tempMin > tempMax){
          aux = tempMax;
          tempMax = tempMin;
          tempMin = aux;
        }
        System.out.println("Temperatura minima: "+tempMin+"ºC");
        System.out.println("Temperatura maxima: "+tempMax+"ºC");
        cielo = Math.random() <= 0.6? "Soleado" : "Nublado";
        System.out.println(cielo);
        break;

      case 2:
        System.out.println("Prevision del tiempo para mañana");
        System.out.println("----------------------------------");
        tempMin = (int)(Math.random()*26+20);
        tempMax = (int)(Math.random()*26+20);
        if(tempMin > tempMax){
          aux = tempMax;
          tempMax = tempMin;
          tempMin = aux;
        }
        System.out.println("Temperatura minima: "+tempMin+"ºC");
        System.out.println("Temperatura maxima: "+tempMax+"ºC");
        cielo = Math.random() <= 0.8? "Soleado" : "Nublado";
        System.out.println(cielo);
        break;

      case 3:
        System.out.println("Prevision del tiempo para mañana");
        System.out.println("----------------------------------");
        tempMin = (int)(Math.random()*21+10);
        tempMax = (int)(Math.random()*21+10);
        if(tempMin > tempMax){
          aux = tempMax;
          tempMax = tempMin;
          tempMin = aux;
        }
        System.out.println("Temperatura minima: "+tempMin+"ºC");
        System.out.println("Temperatura maxima: "+tempMax+"ºC");
        cielo = Math.random() <= 0.4? "Soleado" : "Nublado";
        System.out.println(cielo);
        break;

      case 4:
        System.out.println("Prevision del tiempo para mañana");
        System.out.println("----------------------------------");
        tempMin = (int)(Math.random()*26);
        tempMax = (int)(Math.random()*26);
        if(tempMin > tempMax){
          aux = tempMax;
          tempMax = tempMin;
          tempMin = aux;
        }
        System.out.println("Temperatura minima: "+tempMin+"ºC");
        System.out.println("Temperatura maxima: "+tempMax+"ºC");
        cielo = Math.random() <= 0.2? "Soleado" : "Nublado";
        System.out.println(cielo);
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
