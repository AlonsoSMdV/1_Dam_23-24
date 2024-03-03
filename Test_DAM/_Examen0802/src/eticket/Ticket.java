package eticket;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Ticket implements TicketInterface{
  private HashMap<Product, TicketLine> compra = new HashMap<Product, TicketLine>();

  private Date fecha;
  private int id;
  
  private static int idIncrement;
  ///////////////////////////////////////CONSTRUCTOR///////////////////////////////////////
  public Ticket(){
    this.fecha = new Date();
    idIncrement++;
    this.id = idIncrement;
  }
  ///////////////////////////////////////GETTERS///////////////////////////////////////
  public Date getFecha() {
    return fecha;
  }

  public int getId() {
    return id;
  }

  public double getTotalCompra() {
    double total = 0;
    for (Map.Entry<Product, TicketLine> c : compra.entrySet()) {//Por cada producto que haya en el ticket le va sumando su precio al 
                                                                //total del ticket
      total += c.getKey().getPrecio() * c.getValue().getAmount();
    }
    return total;
  }
  ///////////////////////////////////////ADD///////////////////////////////////////
  public void add(Product p, int amount) {
    if (compra.containsKey(p)) {//si el ticket ya contiene el producto le suma la cantidad a añadir, sino añade desde 0
      compra.get(p).setAmount(compra.get(p).getAmount() + amount);
    } else {
      compra.put(p, new TicketLine(p, amount));
    }
  }
  ///////////////////////////////////////REMOVE///////////////////////////////////////
  public void remove(Product p, int amount) throws ProductDoesNotExists, NotEnoughStock {
    if (compra.containsKey(p)) {//si el stock contiene el producto lo elimina, sino lanza excepcion
      if (compra.get(p).getAmount() >= amount) {//si la cantidad a eliminar es menor o igual le resta esa cantidad al stockage del producto,
                                                //si la cantidad es mayor lanza excepcion
        if (compra.get(p).getAmount() == amount) {//Si la cantidad a eliminar es igual a la que hay de un producto en la compra
                                                  //directamente elimina el producto del ticket, sino solo le resta la cantidad
          compra.remove(p);
        } else {
          compra.get(p).setAmount(compra.get(p).getAmount() - amount);
        }
        
      } else {
        throw new NotEnoughStock();
      }
    } else {
      throw new ProductDoesNotExists();
    }
  }
///////////////////////////////////////TOSTRING///////////////////////////////////////
  @Override
  public String toString() {
    String ret = "Ticket nº: " + getId() + "\nFecha: " + getFecha() + "\n";

    for (Map.Entry<Product, TicketLine> c : compra.entrySet()) {
      ret += c.getValue() + "\n";
    }
    ret += String.format("%50s %.2f €", "Total", getTotalCompra());
    return ret;
  }
}
