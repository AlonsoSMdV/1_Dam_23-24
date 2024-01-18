package CapituloJava09.POO_en_java.Ejercicio12;

public abstract class Publicacion {
  private String ISBN;
  private String titulo;
  private int anoPublicacion;

  public Publicacion(String isbn, String t, int publi){
    this.ISBN = isbn;
    this.titulo = t;
    this.anoPublicacion = publi;
  }
  public int getAnoPublicacion() {
    return anoPublicacion;
  }

  public String getISBN() {
    return ISBN;
  }


  public String getTitulo() {
    return titulo;
  }

  @Override
    public String toString() {
        return "ISBN: " + this.getISBN() + ", título: " + this.getTitulo() + ", año de publicación: " + this.getAnoPublicacion();
    }

}
