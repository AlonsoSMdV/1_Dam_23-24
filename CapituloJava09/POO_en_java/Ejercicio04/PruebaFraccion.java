package CapituloJava09.POO_en_java.Ejercicio04;

public class PruebaFraccion {
  public static void main(String[] args) {
    Fraccion f1 = new Fraccion(-9,4);
    System.out.println(f1 + " x 8 = "+ f1.multiplica(8));
    System.out.println(f1 + " ^-1 = " + f1.invierte());
    Fraccion f2 = new Fraccion(7, 8);
    System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
    System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));
    Fraccion f3 = new Fraccion(450, -950);
    System.out.println(f3 + " = " + f3.simplifica());
}
}
