package CapituloJava10.Ejercicios.Ejercicio23;

public class Figura {
  private String nombre;
  private int valor;//Valor de la figura en peones(EJEMPLO: 1 dama = 8 peones)
  private int cantidad;//Cantidad maxima existente de cada figura (EJEMPLO: Max 2 torres)

  public Figura(String nom, int v, int c){
    this.nombre = nom;
    this.valor = v;
    this.cantidad = c;
  }

  public boolean esCapturable(){
    return this.cantidad > 0;
  }

  public void captura(){
    this.cantidad--;
  }

  @Override
  public String toString() {
    return nombre + " (" + valor + ((valor == 1)? " peón" : " peones") + ")";
  }

  public int getValor() {
    return valor;
  }
}
