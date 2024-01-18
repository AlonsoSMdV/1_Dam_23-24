package CapituloJava09.POO_en_java.Ejercicio12;

public class Libro extends Publicacion implements Prestable {
  private boolean prestado = false;
  public Libro(String isbn, String titulo, int anio) {
    super(isbn, titulo, anio);
  }
  
  public void presta() {
    if (this.prestado) {
      System.out.println("Lo siento, ese libro ya está prestado");
    }else{
      this.prestado = true;
    }
  }
  
  public void devuelve() {
    this.prestado = false;
  }
  
  public boolean estaPrestado() {
    return this.prestado;
  }

  @Override
  public String toString() {
    return super.toString() + "("+(this.prestado ? "prestado" : "no prestado")+")";
  }
  
}
