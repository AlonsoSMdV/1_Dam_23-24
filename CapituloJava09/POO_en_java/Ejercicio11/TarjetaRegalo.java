package CapituloJava09.POO_en_java.Ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {
  private double saldo;
  private String nTarjeta;
  private DecimalFormat formato = new DecimalFormat("0.00");
  public TarjetaRegalo(double s) {
    this.saldo = s;
    this.nTarjeta = "";
    for (int i = 0; i < 5; i++) {
      this.nTarjeta += (int)(Math.random() * 10);
    }
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  public double getSaldo() {
    return saldo;
  }

  public String toString() {
    return "Tarjeta Nº " + this.nTarjeta + " -- Saldo " + formato.format(this.getSaldo()) + "€";
  }

  public void gasta(double d) {
    if (d > this.getSaldo()) {
      System.out.println("No tiene suficiente saldo para gastar "+formato.format(d) + "€");
    }else{
      this.saldo -= d;
    }
  }

  public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    TarjetaRegalo tNueva = new TarjetaRegalo(this.getSaldo() + t.getSaldo());
    this.setSaldo(0);;
    t.setSaldo(0);;
    return tNueva;
  }
  
}
