package CapituloJava09.POO_en_java.Ejercicio09;

import java.text.DecimalFormat;

public class Movil extends Terminal {
  private String tarifa;
  private double costeTarifa;
  private DecimalFormat formato = new DecimalFormat("0.00");
  public Movil(String numero, String t) {
    super(numero);
    this.tarifa = t;
    this.costeTarifa = 0;
  }
  public String getTarifa() {
    return tarifa;
  }

  public double getCosteTarifa() {
    return costeTarifa;
  }
  
  public String toString() {
    return super.toString() + " - tarificados " + formato.format(this.costeTarifa) + " euros";
  }

  public void llama(Movil m, int segundos){
    super.llama(m, segundos);
    double minutos = (double) segundos/60;
    switch (this.tarifa) {
      case "rata":
        this.costeTarifa += minutos * 0.06;
        break;

      case "mono":
        this.costeTarifa += minutos * 0.12;
        break;

      case "bisonte":
        this.costeTarifa += minutos * 0.30;
        break;
    
      default:
        break;
    }
  }
}
