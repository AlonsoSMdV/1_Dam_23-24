package CapituloJava09.POO_en_java.Ejercicio02;
/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:
 */
public class Vehiculo {
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  // atributos de instancia
  private int kilometrosRecorridos;
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  /**
  * Hace que un vehículo recorra una distancia determinada.
  *
  * @param k kilómetros a recorrer
  */
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
