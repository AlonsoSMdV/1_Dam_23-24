package CapituloJava10.Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio20 {
  @SuppressWarnings("rawtypes")
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();
    diccionario.put("caliente", "hot");
    diccionario.put("rojo", "red");
    diccionario.put("ardiente", "hot");
    diccionario.put("verde", "green");
    diccionario.put("agujetas", "stiff");
    diccionario.put("abrasador", "hot");
    diccionario.put("hierro", "iron");
    diccionario.put("grande", "big");

    Scanner sc = new Scanner(System.in);

    String palabraIntroducida = "";

    do {
      System.out.print("Introduzca una palabra y le daré los sinónimos: ");
      palabraIntroducida = sc.nextLine();

      if (!palabraIntroducida.equals("salir")) {
        if (!diccionario.containsKey(palabraIntroducida)) {
          System.out.print("No conozco esa palabra ¿quiere añadirla al diccionario? (s/n):");
          if (sc.nextLine().equals("s")) {
            System.out.print("Introduzca la traducción de " + palabraIntroducida + " en inglés: ");
            String traduccion = sc.nextLine();
            diccionario.put(palabraIntroducida, traduccion);
          }
        } else if (!tieneSinonimos(palabraIntroducida, diccionario)) {
          System.out.print("No conozco sinónimos de esa palabra ¿quiere añadir alguno? (s/n): ");
          if (sc.nextLine().equals("s")) {
            System.out.print("Introduzca un sinónimo de " + palabraIntroducida + ": ");
            String sinonimo = sc.nextLine();
            diccionario.put(sinonimo, diccionario.get(palabraIntroducida));
            System.out.println("Gracias por enseñarme nuevos sinónimos.");
          }
        } else {
          String significado = diccionario.get(palabraIntroducida);
          System.out.print("Sinónimos de " + palabraIntroducida + ": ");

          ArrayList<String> sinonimos = new ArrayList<>();

          for (Map.Entry entrada : diccionario.entrySet()) {
            if (!entrada.getKey().equals(palabraIntroducida)
                    && entrada.getValue().equals(significado)) {
              sinonimos.add((String) entrada.getKey());
            }
          }

          muestraLista(sinonimos);
        }
      }
    } while (!palabraIntroducida.equals("salir"));
    sc.close();
  }

  @SuppressWarnings("rawtypes")
  public static boolean tieneSinonimos(String palabra, HashMap<String, String> d) {
    String significado = d.get(palabra);

    int contador = 0;

    for (Map.Entry entrada : d.entrySet()) {
      if (entrada.getValue().equals(significado)) {
        contador++;
      }
    }

    return contador > 1;
  }

  public static void muestraLista(ArrayList<String> lista) {
    for (int i = 0; i < lista.size(); i++) {
      System.out.print(lista.get(i));
      if (i < lista.size() - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("");
  }
}
