package CapituloJava09.POO_en_java.Ejercicio12;

public class Revista extends Publicacion{
  private int nrevista;
  public Revista(String isbn, String t, int publi, int n) {
    super(isbn, t, publi);
    this.nrevista = n;
  }

  public int getNrevista() {
    return nrevista;
  }
}
