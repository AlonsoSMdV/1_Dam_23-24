package CapituloJava06;
/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    int contSuspensos = 0;
    int contSuficientes = 0;
    int contBienes = 0;
    int contNotables = 0;
    int contSobresalientes = 0;
    for (int i = 1; i <= 20; i++) {
      int nota = (int)(Math.random()*5+1);
      switch (nota) {
        case 1:
          System.out.print("Suspenso ");
          contSuspensos++;
          break;
      
        case 2:
          System.out.print("Suficiente ");
          contSuficientes++;
          break;

        case 3:
          System.out.print("Bien ");
          contBienes++;
          break;

        case 4:
          System.out.print("Notable ");
          contNotables++;
          break;

        case 5:
          System.out.print("Sobresaliente ");
          contSobresalientes++;
          break;
        default:
          break;
      }
    }
    System.out.println();
    System.out.println("Suspensos: "+contSuspensos+"\n"+"Suficientes: "+contSuficientes+"\n"+"Bienes: "+contBienes+"\n"+"Notables: "+contNotables+"\n"+"Sobresalientes: "+contSobresalientes+"\n");
  }
}
