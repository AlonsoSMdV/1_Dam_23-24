package CapituloJava10.Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio10 {
  public static void main(String[] args) {
    HashMap<String, String> d = new HashMap<String, String>();
    d.put("arbol", "tree");
    d.put("gato", "cat");
    d.put("perro", "dog");
    d.put("balon", "ball");
    d.put("circulo", "circle");
    d.put("chico", "boy");
    d.put("chica", "girl");
    d.put("beber", "drink");
    d.put("bailar", "dance");
    d.put("comer", "eat");
    d.put("cientifico", "scientist");
    d.put("coche", "car");
    d.put("jugador", "player");
    d.put("saltar", "jump");
    d.put("rojo", "red");
    d.put("negro", "black");
    d.put("boca", "mouth");
    d.put("nariz", "nose");
    d.put("ojo", "eye");
    d.put("comida", "food");

    int i = 0;
    int numero;

    String[] a = d.keySet().toArray(new String[0]);

    ArrayList<Integer> n = new ArrayList<Integer>();
    n.add((int)(Math.random()*20));

    for (int j = 0; j < 4; j++) {
      do {
        numero = (int)(Math.random()*20);
      } while (n.contains(numero));
      n.add(numero);
    }

    int puntos = 0;
    System.out.println("Mostraré la palabra en español y usted tendrá que traducirla al inglés.");
    for (i = 0; i < 5; i++) {
      System.out.print(a[n.get(i)] + ": ");
      String palabraIntro = System.console().readLine();
      if (palabraIntro.equals(d.get(a[n.get(i)]))) {
        System.out.println("Respuesta correcta");
        puntos++;
      } else {
        System.out.println("Respuesta incorrecta.");
        System.out.println("La respuesta correcta es " + d.get(a[n.get(i)]));
      }
    }

    System.out.println("Ha obtenido " + puntos + " puntos.");
  }
}
