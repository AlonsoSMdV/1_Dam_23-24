package CapituloJava10.Ejercicios.Ejercicio09;

import java.util.Objects;

public class Carta implements Comparable{
  private static String valores[] = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  private static String palos[] = {"bastos", "copas", "oros", "espadas"};

  private Integer valor;
  private String palo;

  public Carta(){
    this.palo = palos[(int)(Math.random()*4)];
    this.valor = (int)(Math.random()*10);
  }

  public String getPalo() {
    return palo;
  }

  public int getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return valores[valor] + " de " + this.palo;
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
  


  @Override
  public int compareTo(Object o) {
    Carta c = (Carta) o;
    if (palo.equals(c.getPalo())) {
      return valor.compareTo(c.getValor());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
}
