package CapituloJava09.POO_en_java.Ejercicio03;

public class Gato extends Animal {
  public Gato (String s) {
    super(s);
  }
  /**
  * Hace que el gato emita sonidos.
  */
  public void hazRuido() {
    this.maulla();
    this.ronronea();
  }
  /**
  * Hace que el gato maulle.
  */
  public void maulla() {
    System.out.println("Miauuuu");
  }
  /**
  * Hace que el gato ronronee
  */
  public void ronronea() {
    System.out.println("mrrrrrr");
  }
  /**
  * Hace que el gato coma.
  * A los gatos les gusta el pescado, si le damos otra comida
  Programación orientada a objetos 185
  * la rechazará.
  *
  * @param comida la comida que se le ofrece al gato
  */
  public void come(String comida) {
    if (comida.equals("pescado")) {
      super.come();
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }
  /**
  * Pone a pelear al gato contra otro animal.
  * Solo se van a pelear dos machos entre sí.
  *
  * @param contrincante es el animal contra el que pelear
  */
  public void peleaCon(Animal contrincante) {
    if (this.getSexo().equals("HEMBRA")) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("HEMBRA")) {
        System.out.println("no peleo contra hembras");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }
}
