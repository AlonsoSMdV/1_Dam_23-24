package CapituloJava09.POO_en_java.Ejercicio15;

public class FichaDomino {
  private int lado1;
  private int lado2;
  public FichaDomino(){
    this.lado1 = (int) (Math.random() * 7);
    this.lado2 = (int) (Math.random() * 7);
  }
  public FichaDomino(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  FichaDomino voltea() {
    return new FichaDomino(lado2, lado1);
  }

  boolean encaja(FichaDomino f) {
    return (lado1 == f.lado1) || (lado1 == f.lado2) || (lado2 == f.lado1) || (lado2 == f.lado2);
  }

  boolean encajaEnFila(FichaDomino f){
    return lado2 == f.lado1;
  }
  
  @Override
  public String toString() {
    return "["+(lado1 == 0 ? " " : lado1)+"|"+(lado2 == 0 ? " " : lado2)+"]";
  }
}
