package CapituloJava09.POO_en_java.Ejercicio02;

public class Bicicleta extends Vehiculo{
  int pinones;
  Bicicleta (int p){
    this.pinones = p;
  }

  void hazCaballito(){
    System.out.println("Mira estoy haciendo el caballito");
  }
}
