package CapituloJava10.Ejercicios.Ejercicio08;

import java.util.Objects;

public class Carta {
  private static String valores[] = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  private static String palos[] = {"bastos", "copas", "oros", "espadas"};

  private String valor;
  private String palo;

  Carta(){
    this.palo = palos[(int)(Math.random()*4)];
    this.valor = valores[(int)(Math.random()*10)];
  }

  public String getPalo() {
    return palo;
  }

  public String getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return this.valor + " de " + this.palo;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Carta other = (Carta) obj;
    if (!Objects.equals(this.valor, other.valor)) {
      return false;
    }
    if (!Objects.equals(this.palo, other.palo)) {
      return false;
    }
    return true;
  }
}
