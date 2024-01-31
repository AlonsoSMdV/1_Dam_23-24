package sieteymedia;

public class Carta implements CartaInterface{
  private String palo;
  private String numero;
  private int codigo;

  public Carta(int codigo) {
    this.codigo = codigo;
    this.palo = BarajaInterface.getPalo(codigo);
    this.numero = BarajaInterface.getNumero(codigo);
  }

  public String getPalo() {
      return palo;
  }


  public String getNumero() {
      return numero;
  }


  public int getCodigo() {
      return codigo;
  }

  @Override
  public String toString() {
      return numero + " de " + palo;
  }
}
