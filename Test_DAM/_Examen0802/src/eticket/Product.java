package eticket;

/** Product
 * Mantiene la información de un producto
 * Información que mantiene:
 * code: Código del producto (se debe autogenerar empezando en 1)
 * brand: Marca del producto
 * model: Modelo del producto
 * tradeName: Nombre comercial del producto
 * price: Precio del producto
 * Nota:
 * - Getters de cada uno de los campos
 * - Debes implementar el método equals que indica si un producto es igual a otro
 *   para ello se deben comparar los códigos de productos y así determinar si son iguales o no
 * - Se debe poder imprimir la información de un producto de la siguiente forma:
 * Ej:
 *   Código: 7
 *   Marca: C&A
 *   Modelo: G123456
 *   Nombre comercial: Vestido señora
 *   Precio: 119,95 €
 */
public class Product implements ProductInterface{
    private int code;
    private String brand;
    private String model;
    private String tradeName;
    private double precio;

    private static int codeIncrement;
///////////////////////////////////////CONSTRUCTOR///////////////////////////////////////
    public Product(String brand, String model, String tradeName, double precio){
      codeIncrement++;
      this.code = codeIncrement;
      this.brand = brand;
      this.model = model;
      this.tradeName = tradeName; 
      this.precio = precio;
    }
    ///////////////////////////////////////GETTERS///////////////////////////////////////
    public int getCode() {
      return code;
    }

    public String getBrand() {
      return brand;
    }

    public String getModel() {
      return model;
    }

    public String getTradeName() {
      return tradeName;
    }

    public double getPrecio() {
      return precio;
    }
    ///////////////////////////////////////EQUALS///////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
      if (obj.getClass() == this.getClass()) {
        return this == obj || this.getCode() == ((Product)obj).getCode();
      }else{
        return false;
      }
    }
    ///////////////////////////////////////TOSTRING///////////////////////////////////////
    @Override
    public String toString() {
    String ret = "Código: " + this.code 
                + "\nMarca: " + this.brand + "\nModelo: " + this.model + 
                  "\nNombre comercial: " + this.tradeName + "\nPrecio: " + this.precio + " €";
      return ret;
    }
}
