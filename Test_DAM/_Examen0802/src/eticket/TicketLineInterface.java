package eticket;

public interface TicketLineInterface {
  /** GETTER
   * 
   * @returnel el producto de la linea
   */
  public Product getProduct();

  /** GETTER
   * 
   * @return la cantidad compradada del producto
   */
  public int getAmount();

  /**
   * Modifica la cantidad comprada del producto
   * @param amount cantidad de producto deseada
   */
  public void setAmount(int amount);
  
  /** GETTER
   * 
   * @return el precio total de la linea(cantidad por precio del producto)
   */
  public double getTotal();
}
