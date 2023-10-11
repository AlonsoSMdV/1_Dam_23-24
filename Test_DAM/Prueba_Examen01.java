package Test_DAM;

import java.util.Scanner;
public class Prueba_Examen01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("PRIMER USUARIO");
    System.out.print("Introduzca el nombre del primer usuario: ");
    String nombre1 = sc.nextLine();
    System.out.print("Introduzca los apellidos del primer usuario: ");
    String apellidos1 = sc.nextLine();
    System.out.print("Introduzca la edad del primer usuario: ");
    int edad1 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca la altura(en metros) del primer usuario: ");
    double altura1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el peso del primer usuario: ");
    double peso1 = Double.parseDouble(sc.nextLine());
    double IMC1 = peso1/Math.pow((altura1),2);

    System.out.println();
    System.out.println("SEGUNDO USUARIO");
    System.out.print("Introduzca el nombre del segundo usuario: ");
    String nombre2 = sc.nextLine();
    System.out.print("Introduzca los apellidos del segundo usuario: ");
    String apellidos2 = sc.nextLine();
    System.out.print("Introduzca la edad del segundo usuario: ");
    int edad2 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca la altura(en metros) del segundo usuario: ");
    double altura2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el peso del segundo usuario: ");
    double peso2 = Double.parseDouble(sc.nextLine());
    double IMC2 = peso2/Math.pow(altura2,2);
    
    System.out.println("*************************************************************************************");
    System.out.printf("|  %-15s  |  %-23s|  %-6s|  %-8s|  %-6s|  %-6s|\n","Nombre","Apellidos","Edad","Altura","Peso","IMC");
    System.out.printf("|  %-15s  |  %-23s|  %-6d|  %-8.2f|  %-6.2f|  %-6.2f|\n",nombre1,apellidos1,edad1,altura1,peso1,IMC1);
    System.out.printf("|  %-15s  |  %-23s|  %-6d|  %-8.2f|  %-6.2f|  %-6.2f|\n",nombre2,apellidos2,edad2,altura2,peso2,IMC2);
    System.out.println("*************************************************************************************");
    if (IMC1 > IMC2) {
      System.out.println(nombre1+" "+apellidos1+" tiene más IMC");
    }else{
      System.out.println(nombre2+" "+apellidos2+" tiene más IMC");
    }
    System.out.println("*************************************************************************************");
    sc.close();
  }
}
