package CapituloJava09.POO_en_java.Ejercicio05;

public class Pizza{
private static int TotalPedidas = 0;
private static int TotalServidas = 0;
private String tipo;
private String tamano;
private String estado;
  public Pizza(String t, String t2) {
    this.tipo =t;
    this.tamano = t2;
    this.estado = "pedida";
    Pizza.TotalPedidas++;
  }

  public String toString() {
    return "Pizza "+this.tipo+" "+this.tamano+", "+this.estado;
  }
  public static int getTotalPedidas() {
    return Pizza.TotalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.TotalServidas;
  }
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.TotalServidas++;
    }else{
      System.out.println("esa pizza ya se ha servido");
    }
  }
}