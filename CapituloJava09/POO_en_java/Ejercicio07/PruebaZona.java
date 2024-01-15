package CapituloJava09.POO_en_java.Ejercicio07;
import java.util.Scanner;
public class PruebaZona {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(250);
    Zona vip = new Zona(25);
    int opcion = 0;
    int opcion2 = 0;
    do {
      System.out.println("1. Mostrar número de entradas libres\n2. Vender entradas\n3. Salir\n");
      System.out.print("Opcion: ");
      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          System.out.println("Para la zona principal quedan "  + principal.getEntradasPorVender() + "\nPara la zona de compra-venta quedan " + compraVenta.getEntradasPorVender() + "\nPara la zona VIP quedan " + vip.getEntradasPorVender());
          break;
  
        case 2:
          System.out.println("Para que zona desea comprar:\n1. Zona principal\n2. Zona compra-venta\n3. Zona VIP");
          System.out.print("Opcion: ");
          opcion2 = sc.nextInt();
          System.out.print("Cuantas desea comprar: ");
          int n = sc.nextInt();
          switch (opcion2) {
            case 1:
              principal.vender(n);
              break;
  
            case 2:
              compraVenta.vender(n);
              break;
            
            case 3:
              vip.vender(n);
              break;
          
            default:
              break;
          }
          break;
      
        default:
          break;
      }
    } while (opcion != 3);
    sc.close();
  }
}
