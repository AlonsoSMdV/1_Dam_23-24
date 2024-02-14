package CapituloJava10.Ejercicios.Ejercicio18;

import java.util.ArrayList;

public class Carrito {
  ArrayList<Elemento> a = new ArrayList<>();

  public void agrega(Elemento e){
    boolean existeProducto = false;
    for (Elemento elem : a) {
      
      if(elem.getProducto().equals(e.getProducto())){
        elem.setCantidad(elem.getCantidad() + e.getCantidad());
        existeProducto = true;
      }
    }
    if(!existeProducto){
      a.add(e);
    }
  }

  public int numeroDeElementos() {
    return a.size();
  }

  public double importeTotal() {
    double total = 0;
    for (Elemento e : a) {
      total += e.getPrecio() * e.getCantidad();
    }
    return total;
  }

  @Override
  public String toString() {
    String cadena = "Contenido del carrito\n=====================\n";
    for (Elemento e : a) {
      cadena += e + "\n";
    }
    return cadena;
  }
}
