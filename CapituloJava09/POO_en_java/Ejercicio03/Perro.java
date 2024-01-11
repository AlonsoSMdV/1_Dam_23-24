package CapituloJava09.POO_en_java.Ejercicio03;

public class Perro extends Animal{
  public Perro (String s) {
    super(s);
  }
  /**
  * Hace que el Perro emita sonidos.
  */
  
  public void hazRuido() {
    this.ladra();
  }
  /**
  * Hace que el Perro ladre.
  */
  public void ladra() {
    System.out.println("Guau guau");
  }
  /**
  * Hace que el Perro coma.
  * A los Perros les gusta la carne, si le damos otra comida la rechazará.
  *
  * @param comida la comida que se le ofrece al Perro
  */
  public void come(String comida) {
    if (comida.equals("carne")) {
      super.come();
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como carne");
    }
  }
  /**
  * Pone a pelear el perro contra otro animal.
  * Solo se van a pelear si los dos son perros.
  *
  * @param contrincante es el animal contra el que pelear
  */
  public void peleaCon(Animal contrincante) {
    if (contrincante.getClass().getSimpleName().equals("Perro")) {
      System.out.println("ven aquí que te vas a enterar");
    } else {
      System.out.println("no me gusta pelear");
    }
  }

}
