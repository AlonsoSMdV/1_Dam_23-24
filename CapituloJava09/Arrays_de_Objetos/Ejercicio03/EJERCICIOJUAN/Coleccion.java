package CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN;


public class Coleccion implements CRUD {
  private Disco[] discos;
  public Coleccion(){
    discos = new Disco[100];
  }
  public Disco anadirDisco(Disco disco) {
    for (int i = 0; i <= discos.length; i++) {
      if (discos[i] != null) {
        discos[i] = disco;
      }
    }
    return disco;
  }

  public Disco modificaDisco(String codigo, String nombre, String autor, String genero, int duracion) {
    Disco disco = null;
    for (int i = 0; i < discos.length; i++) {
      if(codigo == discos[i].getCodigo()){
        if (!nombre.equals("")) {
          discos[i].setTitulo(nombre);
        }
        if (!autor.equals("")) {
          discos[i].setAutor(autor);
        }
        if (!genero.equals("")) {
          discos[i].setGenero(genero);
        }
        if (duracion != 0) {
          discos[i].setDuracion(duracion);
        }
        
      }
    }
    return disco;
  }

  public Disco borraDisco(String codigo) {
    Disco disco = null;
    for (int i = 0; i < discos.length; i++) {
      if(codigo == discos[i].getCodigo()){
        disco = discos[i];
        discos[i] = null;
      }
    }
    return disco;
  }

  public Disco[] listaDiscos() {
    Disco[] _discos = new Disco[discos.length];
    for (int i = 0; i < _discos.length; i++) {
      _discos[i] = new Disco(discos[i].getAutor(), discos[i].getTitulo(), discos[i].getGenero(), discos[i].getDuracion()); 
    }
    return discos;
  }
  
}
