package CapituloJava09.POO_en_java.Ejercicio10;

public class Ameba {
  private int peso;
  public Ameba(){
    this.peso = 3;
  }
  public int getPeso() {
    return peso;
  }

  @Override
  public String toString() {
    return "Soy una ameba y peso " + this.peso + " microgramos.";
  }
  public void come(int n) {
    this.peso += n-1;
  }

  public void come(Ameba a) {
    this.peso += a.peso-1;
    a.peso = 0;
  }
  
}
