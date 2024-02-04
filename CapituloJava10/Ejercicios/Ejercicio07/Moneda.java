package CapituloJava10.Ejercicios.Ejercicio07;

public class Moneda {
  private static String positions[] = {"cara", "cruz"};
  private static String quantities[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
  private String position;
  private String quantity;

  Moneda(){
    this.position = positions[(int)(Math.random()*2)];
    this.quantity = quantities[(int)(Math.random()*8)];
  }

  public String getPosition() {
    return position;
  }

  public String getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return this.quantity + " - " + this.position;
  }
}
