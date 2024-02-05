package CapituloJava10.Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    HashMap<String, Double> productos = new HashMap<String, Double>();
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("jengibre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put(" guisantes", 1.60);

    Scanner sc = new Scanner(System.in);
    String productoIntroducido = "";
    int cantidadProducto = 0;

    ArrayList<String> listaProductos = new ArrayList<String>();
    ArrayList<Integer> listaCantidades = new ArrayList<Integer>();

    do {
      System.out.print("Producto: ");
      productoIntroducido = sc.nextLine();
      if (!productoIntroducido.equals("fin")) {
        System.out.print("Cantidad: ");
        cantidadProducto = Integer.parseInt(sc.nextLine());
        listaProductos.add(productoIntroducido);
        listaCantidades.add(cantidadProducto);
      }
    } while (!productoIntroducido.equals("fin"));

    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");

    double total = 0;

    for (int i = 0; i < listaProductos.size(); i++) {
      String producto = listaProductos.get(i);
      double precio = productos.get(producto);
      int cantidad = listaCantidades.get(i);
      double subtotal = precio * cantidad;
      total += subtotal;
      System.out.printf("%-8s %7.2f %6d  %7.2f\n", producto, precio, cantidad, subtotal);
    }

    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %.2f", total);
    sc.close();
  }
}
