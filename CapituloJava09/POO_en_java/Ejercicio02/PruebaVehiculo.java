package CapituloJava09.POO_en_java.Ejercicio02;

import java.util.Scanner;

public class PruebaVehiculo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    int km;
    Bicicleta Bici = new Bicicleta(7);
    Coche BMW = new Coche(2100);
    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        km = sc.nextInt();
        Bici.recorre(km);
        break;
      case 2:
        Bici.hazCaballito();
        break;
        case 3:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        km = sc.nextInt();
        BMW.recorre(km);
        break;
      case 4:
        BMW.quemaRueda();
        break;
      case 5:
        System.out.println("La bicicleta lleva recorridos ");
        System.out.println(Bici.getKilometrosRecorridos() + " Km");
        break;
      case 6:
        System.out.println("El coche lleva recorridos ");
        System.out.println(BMW.getKilometrosRecorridos() + " Km");
        break;
      case 7:
        System.out.println("Los vehículos llevan recorridos ");
        System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      } 
    } 
    sc.close();
  }
}
