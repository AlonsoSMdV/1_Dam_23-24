package CapituloJava09.Arrays_de_Objetos.Ejercicio02;

public class Prueba2 {
  public static void main(String[] args) {
    Gatos gatos[] = new Gatos[4];

    gatos[0] = new Gatos("Garfield", "naranja", "macho");
    gatos[1] = new Gatos("Tom", "negro", "macho"); 
    gatos[2] = new Gatos("Silvestre", "negro", "macho"); 
    gatos[3] = new Gatos("Lisa", "blanco", "hembra"); 

    for (int i = 0; i < gatos.length; i++) {
      System.out.println("Gato "+ (i+1));
      System.out.println("Nombre: " + gatos[i].getNombre());
      System.out.println("Color: " + gatos[i].getColor());
      System.out.println("Sexo: " + gatos[i].getSexo());
    }
  }
}
