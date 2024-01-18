package CapituloJava09.POO_en_java.Ejercicio12;

public interface Prestable {
  /**
   * Presta un libro
   */
  void presta();
  /**
   * devuelve un libro
   */
  void devuelve();
  /**
   * Comprueba si el libro esta o no prestado
   * @return
   */
  boolean estaPrestado();
}
