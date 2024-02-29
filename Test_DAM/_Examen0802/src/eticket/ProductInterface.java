package eticket;

public interface ProductInterface {
  public int getCode();
  public String getBrand();
  public String getModel();
  public String getTradeName();
  public double getPrecio();
  public boolean equals(Object obj);
}
