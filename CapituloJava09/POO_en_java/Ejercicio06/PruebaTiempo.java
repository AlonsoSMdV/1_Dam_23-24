package CapituloJava09.POO_en_java.Ejercicio06;

public class PruebaTiempo {
  public static void main(String[] args) {
    Tiempo t1 = new Tiempo(1, 25, 57);
    Tiempo t2 = new Tiempo(4, 38, 27);
    System.out.println(t1.suma(t2));
    System.out.println(t2.resta(t1));
  }
}
