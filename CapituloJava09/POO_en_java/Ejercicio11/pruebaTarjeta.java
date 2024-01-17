package CapituloJava09.POO_en_java.Ejercicio11;

public class pruebaTarjeta {
  public static void main(String[] args) {
    TarjetaRegalo t1 = new TarjetaRegalo(100);
    TarjetaRegalo t2 = new TarjetaRegalo(120);
    System.out.println(t1);
    System.out.println(t2);
    t1.gasta(45.90);
    t2.gasta(5);
    t2.gasta(200);
    t1.gasta(3.55);
    System.out.println(t1);
    System.out.println(t2);
    TarjetaRegalo t3 = t1.fusionaCon(t2);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    TarjetaRegalo t4 = new TarjetaRegalo(200);
    TarjetaRegalo t5 = t3.fusionaCon(t4);
    System.out.println(t5);
    System.out.println(t4);
    System.out.println(t3);
    t5.gasta(400);

  }
}
