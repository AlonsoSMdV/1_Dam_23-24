package CapituloJava09.POO_en_java.Ejercicio03;

public abstract class Animal {
  private String sexo;
  public Animal (String s) {
    this.sexo = s;
  }
  public String getSexo() {
    return this.sexo;
  }
  /**
  * Hace que el animal se eche a dormir.
  */
  public void duerme() {
    System.out.println("Zzzzzzz");
  }
  public void come() {
  }
}

