package CapituloJava10.Ejercicios.Ejercicio13;

import java.util.Objects;

public class Articulo {
  private String codigo = "LIBRE";
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;

  public Articulo(String co) {
    this.codigo = co;
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

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 59 * hash + Objects.hashCode(this.codigo);
    return hash;
  }

    @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Articulo other = (Articulo) obj;
    if (!Objects.equals(this.codigo, other.codigo)) {
      return false;
    }
    return true;
  }

}
