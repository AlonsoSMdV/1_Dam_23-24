package CapituloJava09.POO_en_java.Ejercicio03;

public class Canario extends Ave{
  public Canario(String s) {
    super(s);
  }
  /**
  * El pingüino se siente triste porque no puede volar.
  Programación orientada a objetos 180
  */
  @Override
    public void vuela() {
    System.out.println("No puedo volar");
  }
}
