package CapituloJava09.POO_en_java.Ejercicio13;

import java.text.DecimalFormat;

public class CuentaCorriente {
  private double saldo;
  private String nCuenta;
  private DecimalFormat formato = new DecimalFormat("0.00");
  public CuentaCorriente(double s) {
    this.saldo = s;
    this.nCuenta = "";
    for (int i = 0; i < 10; i++) {
      this.nCuenta += (int) (Math.random()*10);
    }
  }

  public CuentaCorriente() {
    this.saldo = 0;
    this.nCuenta = "";
    for (int i = 0; i < 10; i++) {
      this.nCuenta += (int) (Math.random()*10);
    }
  }
  public double getSaldo() {
    return saldo;
  }

  public void ingreso(double i) {
    this.saldo += i;
  }

  public void cargo(double c) {
    this.saldo -= c;
  }

  public void transferencia(CuentaCorriente cuenta, double i) {
    cuenta.ingreso(i);
    this.cargo(i);
  }
  
  @Override
  public String toString() {
    return "Numero de cita: " + this.nCuenta + " Saldo: " + formato.format(this.getSaldo()) + "  €";
  }
}
