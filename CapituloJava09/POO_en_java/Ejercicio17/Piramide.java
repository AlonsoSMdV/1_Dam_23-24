package CapituloJava09.POO_en_java.Ejercicio17;

public class Piramide {
  private int altura;
  private static int PiramidesCreadas = 0;
  public Piramide(int h) {
    this.altura = h;
    PiramidesCreadas++;
  }

  public static int getPiramidesCreadas() {
    return PiramidesCreadas;
  }
  
  @Override
  public String toString() {
    String cadena = "";
    for (int i = 1; i <= this.altura; i++) {
      for (int j = i; j < this.altura; j++) {
        cadena+=" ";
      }
      for (int j = 1; j <= i*2-1; j++) {
        cadena+="*";
      }
      cadena+="\n";
    }
    return cadena;
  }
}
