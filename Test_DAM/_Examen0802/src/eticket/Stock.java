package eticket;

import java.util.HashMap;
import java.util.Map;

public class Stock {
  HashMap<Product, Integer> stockage = new HashMap<Product, Integer>();
  ///////////////////////////////////////CONSTRUCTOR///////////////////////////////////////
  public Stock(){

  }
  ///////////////////////////////////////ADD///////////////////////////////////////
  public void addProduct(Product product, int amount) {
    if (stockage.containsKey(product)) {//si el stock ya contiene el producto le suma la cantidad a añadir, sino añade desde 0
      stockage.put(product, stockage.get(product) + amount);
    } else {
      stockage.put(product,amount);
    }
  }
  ///////////////////////////////////////ALLOCATE///////////////////////////////////////
  public void allocateProduct(Product product, int amount)throws ProductDoesNotExists, NotEnoughStock {
    if (stockage.containsKey(product)) {//si el stock contiene el producto lo elimina, sino lanza excepcion
      if (stockage.get(product) >= amount) {//si la cantidad a eliminar es menor o igual le resta esa cantidad al stockage del producto,
                                            //si la cantidad es mayor lanza excepcion
        if (stockage.get(product) == amount) {//Si la cantidad a eliminar es igual a la que hay de un producto en la compra
                                              //directamente elimina el producto del stock, sino solo le resta la cantidad
          stockage.remove(product);
        } else {
          stockage.put(product, stockage.get(product) - amount);
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
    String ret = "**********************************";
    for (Map.Entry<Product, Integer> entry : stockage.entrySet()) {
      ret += entry.getKey();
      ret += "\nStock disponible: " + entry.getValue() + "\n";
      ret += "**********************************";
    }
    return ret;
  }


}
