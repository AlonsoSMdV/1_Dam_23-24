package CapituloJava10.Ejercicios.Ejercicio22;

import java.util.ArrayList;

public class CuentaCorriente {
  private double saldo;
  private String nCuenta = "";
  private ArrayList<String> movimientos = new ArrayList<>();
  public CuentaCorriente(double s) {
    this.saldo = s;
    this.generaNCuenta();
  }

  public CuentaCorriente(){ 
    this.generaNCuenta(); 
    }


  public void generaNCuenta(){
    for (int i = 0; i < 10; i++) {
      nCuenta += (int)(Math.random()*10);
    }
  }
  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return "Numero de cta: " + this.nCuenta + " Saldo: " + String.format("%.2f", this.saldo) + "  €";
  }

  void ingreso(double dinero){
    saldo += dinero;
    movimientos.add("Ingreso de " + String.format("%.2f",dinero) + " € Saldo: " + String.format("%.2f",saldo) + " €");
  }
  void cargo(double dinero){
    saldo -= dinero;
    movimientos.add("Ingreso de " + String.format("%.2f",dinero) + " € Saldo: " + String.format("%.2f",saldo) + " €");
  }
  void transferencia(CuentaCorriente cuenta, double dinero){
    saldo -= dinero;
    cuenta.saldo += dinero;
    movimientos.add("Transf. emitida de " + String.format("%.2f",dinero) + " € a la cuenta " + cuenta.nCuenta + " Saldo " + String.format("%.2f",saldo) + " €");
    cuenta.movimientos.add("Transf. recibida de " + String.format("%.2f",dinero) + " € de la cuenta " + cuenta.nCuenta + " Saldo " + String.format("%.2f",saldo) + " €");
  }
  void movimientos(){
    System.out.println("Movimientos de la cuenta " + nCuenta);
    System.out.println("-----------------------------------");
    for (String mov : movimientos) {
      System.out.println(mov);
    }
    
  }
}
