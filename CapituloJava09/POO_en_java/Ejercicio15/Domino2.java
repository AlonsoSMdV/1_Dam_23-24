package CapituloJava09.POO_en_java.Ejercicio15;

public class Domino2 {
  public static void main(String[] args) {
    FichaDomino ficha[] = new FichaDomino[8];
    ficha[0] = new FichaDomino();
    for (int i = 1; i < 8; i++) {
      FichaDomino aux;
      do {
        aux = new FichaDomino();
      } while (!ficha[i-1].encajaEnFila(aux));
      ficha[i] = aux;
    }
    for (FichaDomino fichas : ficha) {
      System.out.print(fichas);
    }
  }
}
