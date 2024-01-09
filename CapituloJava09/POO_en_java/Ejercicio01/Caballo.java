package CapituloJava09.POO_en_java.Ejercicio01;
/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 */
public class Caballo {
  String color, raza, sexo;
  int edad;

  Caballo (String s){
    this.sexo = s;
  }

  String getSexo(){
    return this.sexo;
  }

  void relincha(){
    System.out.println("HIIIIIIIIIIIII");
  }

  void galopa(){
    System.out.println("Voy muy rapido");
  }

  void trota(){
    System.out.println("Ahora voy mas despacio");
  }
  void descansa(){
    System.out.println("Me he detenido");
  }

  void come(){
    System.out.println("Gracias por la comida");
  }

  void duerme(){
    System.out.println("zzzzzzzzz");
  }
}
