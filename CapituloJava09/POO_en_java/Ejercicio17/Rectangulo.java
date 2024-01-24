package CapituloJava09.POO_en_java.Ejercicio17;

public class Rectangulo {
  private int base;
  private int altura;
  private static int RectangulosCreados = 0;
  public Rectangulo(int b, int h) {
    this.altura = h;
    this.base = b;
    RectangulosCreados++;
  }

  public static int getRectangulosCreados() {
    return RectangulosCreados;
    
  }
  
  @Override
  public String toString() {
    String cadena = "";
    for (int i = 0; i < this.altura; i++) {
      for (int j = 0; j < this.base; j++) {
        cadena += "*";
      }
      cadena+="\n";
    }
    return cadena;
  }
}
