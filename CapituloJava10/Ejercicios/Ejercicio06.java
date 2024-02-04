package CapituloJava10.Ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> m = new HashMap<String, Integer>();
    String nombreUsuario;
    int contrasena;
    m.put("Esteban", 1234);
    m.put("Lourdes", 5678);
    m.put("Luisa", 9012);
    m.put("Rodri", 3456);
    m.put("Felix", 7890);
    m.put("Sofia", 1357);
    

    int opor = 3;
    boolean acceso = false;
    
    while(opor > 0 && !acceso){
      System.out.print("Introduzca el nombre de usuario: ");
      nombreUsuario = sc.nextLine();
      System.out.print("Introduzca la contraseña: ");
      contrasena = Integer.parseInt(sc.nextLine());
      if(m.containsKey(nombreUsuario)){
        if (m.get(nombreUsuario).equals(contrasena)) {
          System.out.println("Bienvenido " + nombreUsuario);
          acceso = true;
        }else{
          System.out.println("Lo siento la contraseña es incorrecta");
        }
      }else{
        System.out.println("El nombre de usuario no coincide");
      }

      opor--;

      if (!acceso && (opor > 0)) {
        System.out.println("Le quedan " + opor + " oportunidades");
      }
    }

    if (!acceso) {
      System.out.println("Lo siento no tiene acceso al area restringida");
    }
    sc.close();
  }
}
