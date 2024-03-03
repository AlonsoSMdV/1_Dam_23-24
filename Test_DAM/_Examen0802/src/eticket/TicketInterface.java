package eticket;

import java.util.Date;

public interface TicketInterface {
  /** GETTER
   * 
   * @return la fecha del ticket
   */
  public Date getFecha();

  /** GETTER
   * 
   * @return el codigo del ticket
   */
  public int getId();

  /** GETTER
   * 
   * @return el precio total de la compra
   */
  public double getTotalCompra();

  /** ADD METHOD
   * Añade X cantidad de un producto determinado a la compra
   * @param p producto 
   * @param amount cantidad a añadir
   */
  public void add(Product p, int amount);

  /** REMOVE METHOD
   * Elimina X cantidad de un producto determinado de la compra
   * @param p producto
   * @param amount cantidad a eliminar
   * @throws NotEnoughStock 
   * @throws ProductDoesNotExists 
   */
  public void remove(Product p, int amount) throws ProductDoesNotExists, NotEnoughStock;
}
