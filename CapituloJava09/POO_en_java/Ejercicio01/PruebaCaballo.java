package CapituloJava09.POO_en_java.Ejercicio01;

public class PruebaCaballo {
  public static void main(String[] args) {
    Caballo rocinante = new Caballo("macho");
    rocinante.relincha();
    rocinante.galopa();
    rocinante.trota();
    rocinante.descansa();
    rocinante.come();
    rocinante.duerme();
  }
}
