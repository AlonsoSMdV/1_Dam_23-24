package eticket;

public class TicketLine implements TicketLineInterface{
  private Product product;
  private int amount;
  ///////////////////////////////////////CONSTRUCTOR///////////////////////////////////////
  public TicketLine(Product product, int amount){
    this.product = product;
    this.amount = amount;
  }
  ///////////////////////////////////////GETTERS///////////////////////////////////////
  public Product getProduct() {
    return product;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public double getTotal() {
    return product.getPrecio() * getAmount();
  }
 ///////////////////////////////////////TOSTRING///////////////////////////////////////
  @Override
  public String toString() {
    String ret = String.format("%50s(%d x %-10.2f € ) = %-10.2f €",
                              product.getTradeName(), getAmount(), product.getPrecio(), getTotal());
    return ret;
  }

  
}
