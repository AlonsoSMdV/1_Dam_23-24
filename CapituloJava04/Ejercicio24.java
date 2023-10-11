package CapituloJava04;
/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 *        • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 *          de proyecto), los días que ha estado de viaje visitando clientes durante el
 *          mes y su estado civil (1 - Soltero, 2 - Casado).
 *        • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 *          si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 *          respectivamente.
 *        • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 *          concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
 *          un 25% en caso de estar soltero y un 20% en caso de estar casado
 */
import java.util.Scanner;
public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("1 - Programador junior\n2 - Prog. senior\n3 - Jefe de proyecto\nIntroduzca el cargo del empleado (1 - 3): ");
    int puesto = sc.nextInt();
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int dias = sc.nextInt();
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estado = sc.nextInt();
    
    double sueldo = 0;
    switch (puesto) {
      case 1:
        sueldo = 950;
        break;
      case 2:
        sueldo = 1200;
        break;
      case 3:
        sueldo = 1600;
        break;
    
      default:
        break;
    }

    double sueldoDietas = dias * 30;
    double sueldoBruto =sueldo + sueldoDietas;

    double irpfEstado = 0;
    switch (estado) {
      case 1:
        irpfEstado = 25;
        break;

      case 2:
        irpfEstado = 20;
        break;
    
      default:
        break;
    }
    double IRPF = (sueldoBruto * irpfEstado) / 100;

    System.out.println("┌────────────────────────────────────────┐");
    System.out.printf("│Sueldo base   %25.2f │\n", sueldo);
    System.out.printf("│Dietas ( %d viajes)   %18.2f │\n",dias,sueldoDietas);
    System.out.println("├────────────────────────────────────────┤");
    System.out.printf("│Sueldo bruto    %23.2f │\n",sueldoBruto);
    System.out.printf("│Retención IRPF (%.0f%%)    %15.2f │\n",irpfEstado,IRPF);
    System.out.println("├────────────────────────────────────────┤");
    System.out.printf("│Sueldo neto    %24.2f │\n", (sueldoBruto-IRPF));
    System.out.println("└────────────────────────────────────────┘");
    sc.close();
  }
}
