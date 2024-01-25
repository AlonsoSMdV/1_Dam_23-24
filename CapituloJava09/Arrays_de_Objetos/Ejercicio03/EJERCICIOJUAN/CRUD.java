package CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN;


public interface CRUD {
  public Disco anadirDisco(Disco discos);
  public Disco modificaDisco(String codigo, String nombre, String autor, String genero, int duracion);
  public Disco borraDisco(String codigo);
  public Disco[] listaDiscos();
}
