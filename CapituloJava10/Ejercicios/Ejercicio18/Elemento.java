package CapituloJava10.Ejercicios.Ejercicio18;

public class Elemento {
  private String producto;
  private double precio;
  private int cantidad;

  public Elemento(String producto, double precio, int cant){
    this.producto = producto;
    this.precio = precio;
    this.cantidad = cant;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return this.producto + " PVP: " + String.format("%.2f",this.precio) + " Unidades: " + this.cantidad 
    + " Subtotal: " + String.format("%.2f",this.precio * this.cantidad);
  }
}
