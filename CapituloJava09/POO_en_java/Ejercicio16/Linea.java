package CapituloJava09.POO_en_java.Ejercicio16;

public class Linea {
  private Punto inicio;
  private Punto fin;
  public Linea(Punto p1, Punto p2) {
    this.inicio = p1;
    this.fin = p2;
  }
  
  @Override
  public String toString() {
    return "Línea formada por los puntos "+inicio+" y "+fin+"";
  }
}
