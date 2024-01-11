package CapituloJava09.POO_en_java.Ejercicio03;

public class Ave extends Animal {
  public Ave(String s) {
    super(s);
  }

  /**
  * Hace que el ave se limpie.
  */
  public void aseate() {
    System.out.println("Me estoy limpiando las plumas");
  }
  /**
  * Hace que el ave levante el vuelo.
  */
  public void vuela() {
    System.out.println("Estoy volando");
  }
}
