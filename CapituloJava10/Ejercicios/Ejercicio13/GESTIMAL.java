package CapituloJava10.Ejercicios.Ejercicio13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GESTIMAL {

  static ArrayList<Articulo> a = new ArrayList<Articulo>();

  @SuppressWarnings("rawtypes")
  public static void main(String[] args) {

    HashMap<String, Integer> lineasFra = new HashMap<String, Integer>();

    int opcion;
    int opcion2;
    int i;
    int stockIntro;
    int unidades = 0;
    int unidadesEnFactura = 0;
    double precioDeCompraIntro;
    double precioDeVentaIntro;
    double subtotal;
    double baseImponible;
    String codigo;
    String codigoIntro = "";
    String descripcionIntro;
    String precioDeCompraIntroString;
    String precioDeVentaIntroString;
    String stockIntroString;

    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("\n\nG E S T I S I M A L");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Venta");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(sc.nextLine());

      switch (opcion) {

        case 1:
          System.out.println("\nLISTADO\n=======");

          for (Articulo aux : a) {
            System.out.println(aux);
          }
          break;

        case 2: 
          System.out.println("\nNUEVO ARTÍCULO\n==============");

          System.out.println("Por favor, introduzca los datos del artículo.");
          System.out.print("Código: ");
          codigoIntro = sc.nextLine();
          
          if (a.contains(new Articulo(codigoIntro))) {
            System.out.print("Ese código ya existe.\nIntroduzca otro código: ");
          } else {
            System.out.print("Descripcion: ");
            descripcionIntro = sc.nextLine();

            System.out.print("Precio de compra: ");
            precioDeCompraIntro = Double.parseDouble(sc.nextLine());

            System.out.print("Precio de venta: ");
            precioDeVentaIntro = Double.parseDouble(sc.nextLine());

            System.out.print("Stock: ");
            stockIntro = Integer.parseInt(sc.nextLine());

            a.add(new Articulo(codigoIntro, descripcionIntro, precioDeCompraIntro, precioDeVentaIntro, stockIntro));
          }

          break;

        case 3: 
          System.out.println("\nBAJA\n====");
          System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
          codigoIntro = sc.nextLine();

          if (!a.contains(new Articulo(codigoIntro))) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            a.remove(new Articulo(codigoIntro));
            System.out.println("articulo borrado.");
          }

          break;

        case 4: 
          System.out.println("\nMODIFICACIÓN\n============");
          System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
          codigoIntro = sc.nextLine();

          if (!a.contains(new Articulo(codigoIntro))) {
            System.out.println("No hay ningún artículo con ese código.");
          } else {

            i = a.indexOf(new Articulo(codigoIntro));

            System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");

            System.out.println("Código: " + a.get(i).getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntro = sc.nextLine();
            if (!codigoIntro.equals("")) {
              a.get(i).setCodigo(codigoIntro);
            }

            System.out.println("Descripción: " + a.get(i).getDescripcion());
            System.out.print("Nueva descripción: ");
            descripcionIntro = sc.nextLine();
            if (!descripcionIntro.equals("")) {
              a.get(i).setDescripcion(descripcionIntro);
            }

            System.out.println("Precio de compra: " + a.get(i).getPrecioCompra());
            System.out.print("Nuevo precio de compra: ");
            precioDeCompraIntroString = sc.nextLine();
            if (!precioDeCompraIntroString.equals("")) {
              a.get(i).setPrecioCompra(Double.parseDouble(precioDeCompraIntroString));
            }

            System.out.println("Precio de venta: " + a.get(i).getPrecioCompra());
            System.out.print("Nuevo precio de venta: ");
            precioDeVentaIntroString = sc.nextLine();
            if (!precioDeVentaIntroString.equals("")) {
              a.get(i).setPrecioCompra(Double.parseDouble(precioDeVentaIntroString));
            }

            System.out.println("Stock: " + a.get(i).getStock());
            System.out.print("Nuevo stock: ");
            stockIntroString = sc.nextLine();
            if (!stockIntroString.equals("")) {
              a.get(i).setStock(Integer.parseInt(stockIntroString));
            }
          }
          break;

        case 5: 
          System.out.println("\nENTRADA DE MERCANCÍA\n====================");
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntro = sc.nextLine();

          if (!a.contains(new Articulo(codigoIntro))) {
            System.out.println("No hay ningún artículo con ese código.");
          } else {
            i = a.indexOf(new Articulo(codigoIntro));
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(a.get(i));
            System.out.print("Introduzca el número de unidades que entran al almacén: ");
            stockIntro = Integer.parseInt(sc.nextLine());
            a.get(i).setStock(stockIntro + a.get(i).getStock());
            System.out.println("La mercancía ha entrado en el almacén.");
          }

          break;

        case 6: 
          System.out.println("\nVENTA\n=====");

          do {
            System.out.println("\n1. Añadir artículo");
            System.out.println("2. Generar factura");
            System.out.println("3. Cancelar");
            System.out.print("Introduzca una opción: ");
            opcion2 = Integer.parseInt(sc.nextLine());

            switch (opcion2) {

              case 1:
                System.out.print("Por favor, introduzca el código del artículo: ");
                codigoIntro = sc.nextLine();
                
                if (!a.contains(new Articulo(codigoIntro))) {
                  System.out.println("No hay ningún artículo con ese código.");
                } else {
                  i = a.indexOf(new Articulo(codigoIntro));
                  
                  System.out.println(a.get(i));

                  if (lineasFra.containsKey(codigoIntro)) {
                    unidadesEnFactura = lineasFra.get(codigoIntro);
                  } else {
                    unidadesEnFactura = 0;
                  }

                  System.out.println("Unidades en la factura provisional: " + unidadesEnFactura);

                  System.out.print("Unidades que quiere incorporar a la factura: ");
                  unidades = Integer.parseInt(sc.nextLine());

                  if ((a.get(i).getStock()) - unidadesEnFactura < unidades) {
                    System.out.println("No hay suficiente stock. Puede añadir a la venta un máximo de " + (a.get(i).getStock() - unidadesEnFactura) + " unidades de ese producto.");
                  } else if (lineasFra.containsKey(codigoIntro)) {
                    lineasFra.put(codigoIntro, lineasFra.get(codigoIntro) + unidades);
                  } else {
                    lineasFra.put(codigoIntro, unidades);
                  }
                }

                System.out.println("\n\n CÓDIGO |    DESCRIPCIÓN    | UNIDADES | PRECIO UNID. | SUBTOTAL");
                System.out.println("------------------------------------------------------------------");
                for (Map.Entry pareja : lineasFra.entrySet()) {
                  codigo = pareja.getKey().toString();
                  i = a.indexOf(new Articulo(codigo));
                  unidades = Integer.parseInt(pareja.getValue().toString());
                  subtotal = unidades * a.get(i).getPrecioCompra();
                  System.out.printf(" %6s | %17s | %8d | %12.2f | %8.2f\n", codigo, a.get(i).getDescripcion(), unidades, a.get(i).getPrecioCompra(), subtotal);
                }

                break;

              case 2:
                baseImponible = 0;
                System.out.println("\n\n CÓDIGO |   DESCRIPCIÓN   | UNIDADES | PRECIO UNID. | SUBTOTAL");
                System.out.println("----------------------------------------------------------------");
                for (Map.Entry pareja : lineasFra.entrySet()) {
                  codigo = pareja.getKey().toString();
                  i = a.indexOf(new Articulo(codigoIntro));
                  unidades = Integer.parseInt(pareja.getValue().toString());
                  subtotal = unidades * a.get(i).getPrecioCompra();
                  System.out.printf(" %6s | %15s | %8d | %12.2f | %8.2f\n", codigo, a.get(i).getDescripcion(), unidades, a.get(i).getPrecioCompra(), subtotal);
                  baseImponible += subtotal;
                  a.get(i).setStock(a.get(i).getStock() - unidades);
                }

                System.out.println("----------------------------------------------------------------");
                System.out.printf("                                      BASE IMPONIBLE: %8.2f \n", baseImponible);
                System.out.printf("                                           IVA (21%%): %8.2f \n", baseImponible * 0.21);
                System.out.printf("                                               TOTAL: %8.2f \n", baseImponible * 1.21);

                System.out.println("\n\nFactura generada.\nPulse INTRO para volver al menú principal.");
                sc.nextLine();

                break;
            } 

          } while (opcion2 == 1);

          break;

      } 

    } while (opcion != 7);
    sc.close();
  }
}