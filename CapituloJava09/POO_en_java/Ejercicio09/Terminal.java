package CapituloJava09.POO_en_java.Ejercicio09;

public class Terminal {
  private int duracionLLamada;
  private String numeroTerminal;
  public Terminal(String numero) {
    this.numeroTerminal = numero;
    this.duracionLLamada = 0;
  }

  public String getNumeroTerminal() {
    return numeroTerminal;
  }

  public int getDuracionLLamada() {
    return duracionLLamada;
  }

  public String toString() {
    return "Nº " + this.numeroTerminal + " - " + this.duracionLLamada + "s de conversación";
  }
  public void llama(Terminal t, int duracion) {
    this.duracionLLamada += duracion;
    t.duracionLLamada += duracion;
  }
  
}
