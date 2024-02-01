package CapituloJava09.Arrays_de_Objetos.Ejercicio05;
import java.util.Scanner;
public class GESTIMAL {
  static final int N = 100;

  static Articulo[] articulos = new Articulo[N];

  public static void main(String[] args) {

    for(int i = 0; i < N; i++) {
      GESTIMAL.articulos[i] = new Articulo();
    }

    int opcion;
    int stockIntroducido;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigoIntroducido = "";
    String descripcionIntroducida;

    Scanner sc = new Scanner(System.in);

    do {
      pintaTitulo("G E S T I S I M A L");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(sc.nextLine());
      
      switch (opcion) {

        case 1:
          pintaTitulo("LISTADO");
          
          for(Articulo a : articulos) {
            if (!a.getCodigo().equals("LIBRE")) {
              System.out.println(a);
            }
          }
  
          break;
        case 2:
          pintaTitulo("NUEVO ARTÍCULO");
          
          if (primeraPosicionLibre() == N) {
            System.out.println("Lo siento, la base de datos está llena.");
          } else {
            
            System.out.println("Por favor, introduzca los datos del artículo.");  
            System.out.print("Código: ");
            
            do {
              codigoIntroducido = sc.nextLine();
              if (existeCodigo(codigoIntroducido)) {
                System.out.println("Ese código ya existe en la base de datos.");
                System.out.print("Introduzca otro código: ");
              }
            } while (existeCodigo(codigoIntroducido));
            
            System.out.print("Descripcion: ");
            descripcionIntroducida = sc.nextLine();
            System.out.print("Precio de compra: ");
            precioDeCompraIntroducido = Double.parseDouble(sc.nextLine());
            System.out.print("Precio de venta: ");
            precioDeVentaIntroducido = Double.parseDouble(sc.nextLine());
            System.out.print("Stock: ");
            stockIntroducido = Integer.parseInt(sc.nextLine());

            // Crea el nuevo artículo
            articulos[primeraPosicionLibre()] = new Articulo(codigoIntroducido, descripcionIntroducida, precioDeCompraIntroducido, precioDeVentaIntroducido, stockIntroducido);
          }
          
          break;

        case 3:
          pintaTitulo("BAJA");
          
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = sc.nextLine();
    
          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            articulos[posicionConCodigo(codigoIntroducido)].setCodigo("LIBRE");
            System.out.println("Artículo borrado.");  
          }
          
          break;
          
        case 4:
          pintaTitulo("MODIFICACIÓN");
          
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = sc.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.print("Introduzca los nuevos datos del artículo");
            System.out.println(" o INTRO para dejarlos igual.");
      
            int i = posicionConCodigo(codigoIntroducido);

            System.out.println("Código: " + articulos[i].getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = sc.nextLine();
            if (!codigoIntroducido.equals("")) {
              articulos[i].setCodigo(codigoIntroducido);
            }
            
            System.out.println("Descripción: " + articulos[i].getDescripcion());
            System.out.print("Nueva descripción: ");
            descripcionIntroducida = sc.nextLine();
            if (!descripcionIntroducida.equals("")) {
              articulos[i].setDescripcion(descripcionIntroducida);
            }
            
            System.out.println("Precio de compra: " + articulos[i].getPrecioCompra());
            System.out.print("Nuevo precio de compra: ");
            String precioDeCompraIntroducidoString = sc.nextLine();
            if (!precioDeCompraIntroducidoString.equals("")) {
              articulos[i].setPrecioCompra(Double.parseDouble(precioDeCompraIntroducidoString));
            }
            System.out.println("Precio de venta: " + articulos[i].getPrecioVenta());
            System.out.print("Nuevo precio de venta: ");
            String precioDeVentaIntroducidoString = sc.nextLine();
            if (!precioDeVentaIntroducidoString.equals("")) {
              articulos[i].setPrecioVenta(Double.parseDouble(precioDeVentaIntroducidoString));
            }
            System.out.println("Stock: " + articulos[i].getStock());
            System.out.print("Nuevo stock: ");
            String stockIntroducidoString = sc.nextLine();
            if (!stockIntroducidoString.equals("")) {
              articulos[i].setStock(Integer.parseInt(stockIntroducidoString));
            }
          }
          
          break;
          case 5:
            pintaTitulo("ENTRADA DE MERCANCÍA");
            
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntroducido = sc.nextLine();
        
            if (!existeCodigo(codigoIntroducido)) {
              System.out.println("Lo siento, el código introducido no existe.");
            } else {
              int i = posicionConCodigo(codigoIntroducido);
              System.out.println("Entrada de mercancía del siguiente artículo: ");
              System.out.println(articulos[i]);
              System.out.print("Introduzca el número de unidades que entran: ");
              String stockIntroducidoString = sc.nextLine();
              articulos[i].setStock(
                Integer.parseInt(stockIntroducidoString) + articulos[i].getStock());
              System.out.println("La mercancía ha entrado en el almacén.");  
            }
            
            break;
            case 6:
              pintaTitulo("SALIDA DE MERCANCÍA");
              
              System.out.print("Por favor, introduzca el código del artículo: ");
              codigoIntroducido = sc.nextLine();

              if (!existeCodigo(codigoIntroducido)) {
                System.out.println("Lo siento, el código introducido no existe.");
              } else {
                int i = posicionConCodigo(codigoIntroducido);
                System.out.println("Salida de mercancía del siguiente artículo: ");
                System.out.println(articulos[i]);
                System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
                stockIntroducido = Integer.parseInt(sc.nextLine());
                if (articulos[i].getStock() - stockIntroducido > 0) {
                  articulos[i].setStock(articulos[i].getStock() - stockIntroducido);
                  System.out.println("La mercancía ha salido del almacén.");
                } else {
                  System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                }
              }
              
              break;
      } 
    } while (opcion != 7);
    sc.close();
  }

  
  public static int primeraPosicionLibre() {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals("LIBRE")) {
        return i;
      }
    }
    return -1;
  }
  
  
  public static boolean existeCodigo(String codigo) {
    for (Articulo a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }
  
  public static void pintaTitulo(String titulo) {
    System.out.println("\n" + titulo);
    for (int i = 0; i < titulo.length(); i++) {
      System.out.print("=");  
    }
    System.out.println();
  }

  
  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
}
