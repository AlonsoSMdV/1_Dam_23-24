package CapituloJava09.POO_en_java.Ejercicio03;

public class Mamifero extends Animal{
  public Mamifero (String s) {
    super(s);
  }
  
  public void come(String comida) {
    super.come();
    System.out.println("Hmmmm, gracias");
  }
}
