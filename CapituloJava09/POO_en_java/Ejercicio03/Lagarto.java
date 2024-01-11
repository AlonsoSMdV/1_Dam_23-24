package CapituloJava09.POO_en_java.Ejercicio03;

public class Lagarto extends Animal{
  public Lagarto(String s){
    super(s);
  }

  public void repta(){
    System.out.println("Voy arrastrandome por el suelo");
  }

  public void nada(){
    System.out.println("Que buena esta el agua");
  }
}
