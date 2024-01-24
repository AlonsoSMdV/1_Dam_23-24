package CapituloJava09.POO_en_java.Ejercicio18;

public class Incidencia {
  private int codigo;
  private int numeroIncidencia;
  private String problema;
  private String estado;
  private String solucion;
  private static int contadorCods = 0;
  private static int pendientes = 0;
  public Incidencia(int n, String p) {
    this.numeroIncidencia = n;
    this.problema = p;
    this.codigo = contadorCods++;
    this.estado = "Pendiente";
    pendientes++;
  }

  public void resuelve(String solucion) {
    this.solucion = solucion;
    this.estado = "Resuelta";
    pendientes--;
  }

  public static int getPendientes() {
    return pendientes;
  }
  @Override
  public String toString() {
    return "Incidencia " + codigo + " - Puesto " + numeroIncidencia + " - " + problema + " - " + estado + (estado.equals("Resuelta") ? " - " + solucion : "");
  }
  
}
