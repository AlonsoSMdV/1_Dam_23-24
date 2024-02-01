package CapituloJava09.Arrays_de_Objetos.Ejercicio05;

public class Articulo {
  private String codigo = "LIBRE";
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;

  public Articulo() {
    this.codigo = "LIBRE";
  }

  public Articulo(String c, String d, double pC, double pV, int s){
    this.codigo = c;
    this.descripcion = d;
    this.precioCompra = pC;
    this.precioVenta = pV;
    this.stock = s;
  }

  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }
  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }
  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }
  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    String cadena = "---------------------------------";
    cadena += "Código: " + codigo;
    cadena += "Descripción: " + descripcion;
    cadena += "Precio de compra: " + precioCompra;
    cadena += "Precio de venta: " + precioVenta;
    cadena += "Stock: " + stock;
    cadena += "---------------------------------";

    return cadena;
  }

}
