package CapituloJava10.Ejercicios.Ejercicio05;
import java.util.ArrayList;
import java.util.Scanner;
public class coleccionDeDiscos {
  public static void menu(){
    System.out.println("COLECCIÓN DE DISCOS");
    System.out.println("====================");
    System.out.println("1. LISTADO\n2. Nuevo disco\n3. Modificar disco\n4. Borrar Disco\n5. Salir");
    System.out.println("Que desea realizar");
  }

  public static void menuListado(){
    System.out.println("1. Listado completo\n2. Listado por autor\n3. Listado por genero\n4. Listado por rango de duracion");
  }
  public static void main(String[] args) {
    ArrayList<Discos> album = new ArrayList<Discos>();

    album.add(new Discos(
      "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
    album.add(new Discos(
      "FGHQ64", "Metallica", "Black album", "hard rock", 46));
    album.add(new Discos(
      "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));

    int opcion;
    Scanner sc = new Scanner(System.in);
    int i;
    String codigo = "";
    String autor;
    String titulo;
    String genero;
    int duracion;

    do {
      menu();
      opcion = Integer.parseInt(sc.nextLine());
      switch (opcion) {
        case 1:
          System.out.println("LISTADO");
          System.out.println("========");
          menuListado();
          opcion = Integer.parseInt(sc.nextLine());
          switch (opcion) {
            case 1:
            for (Discos d : album) {
              if (!d.getCodigo().equals("LIBRE")) {
                System.out.println(d);
              }
            }
              break;

            case 2:
            System.out.println("De que autor desea buscar los discos");
            autor = sc.nextLine();
            for (Discos d : album) {
              if (d.getAutor().equals(autor)) {
                System.out.println(d);
              }
            }
              break;

            case 3:
            System.out.println("De que genero desea buscar los discos");
            genero = sc.nextLine();
            for (Discos d : album) {
              if (d.getGenero().equals(genero)) {
                System.out.println(d);
              }
            }
              break;

            case 4:
            
            System.out.println("Entre que rango de duracion desea buscar los discos");
            System.out.println("Duracion inicial");
            String durIni = sc.nextLine();
            System.out.println("Duracion final");
            String durFin = sc.nextLine();
            for (Discos d : album) {
              if (d.getDuracion() >= Integer.parseInt(durIni) && d.getDuracion() <= Integer.parseInt(durFin)) {
                System.out.println(d);
              }
            }
              break;
          
            default:
              break;
          }
          
          break;

        case 2:
          System.out.println("NUEVO DISCO");
          System.out.println("============");
          
            System.out.println("A continuacion introduzca los siguientes datos");
            System.out.print("Código: ");
            codigo = sc.nextLine();
            while (album.contains(new Discos(codigo, "", "", "", 0))) {
              System.out.println("El codigo ya exste");
              System.out.println("Introduzca otro");
              codigo = sc.nextLine();
            }
            System.out.print("Autor: ");
            autor = sc.nextLine();
            System.out.print("Título: ");
            titulo = sc.nextLine();
            System.out.print("Género: ");
            genero = sc.nextLine();
            System.out.print("Duración: ");
            duracion = Integer.parseInt(sc.nextLine());
            album.add(new Discos(codigo, autor, titulo, genero, duracion));
          break;

        case 3:
          System.out.println("MODIFICAR");
          System.out.println("==========");

          System.out.println("Introduzca el codigo del disco que desea modificar");
          codigo = sc.nextLine();
          while (!album.contains(new Discos(codigo, "", "", "", 0))) {
            System.out.println("El codigo no exste");
            System.out.println("Introduzca otro");
            codigo = sc.nextLine();
          }
          i = album.indexOf(new Discos(codigo, "", "", "", 0));
          System.out.println("Introduzca los nuevos datos del disco");

          System.out.println("Código: "+album.get(i).getCodigo());
          System.out.print("Nuevo código: ");
          codigo = sc.nextLine();
          if (!codigo.equals("")) {
            album.get(i).setCodigo(codigo);
          }
          System.out.println("Autor: "+album.get(i).getAutor());
          System.out.print("Nuevo autor: ");
          autor = sc.nextLine();
          if (!autor.equals("")) {
            album.get(i).setAutor(autor);
          }
          System.out.println("Título: "+album.get(i).getTitulo());
          System.out.print("Nuevo título: ");
          titulo = sc.nextLine();
          if (!titulo.equals("")) {
            album.get(i).setTitulo(titulo);
          }
          System.out.println("Género: "+album.get(i).getGenero());
          System.out.print("Nuevo género: ");
          genero = sc.nextLine();
          if (!genero.equals("")) {
            album.get(i).setGenero(genero);
          }
          System.out.println("Duración: "+album.get(i).getDuracion());
          System.out.print("Nueva duración: ");
          String duracionString = sc.nextLine();
          if (!duracionString.equals("")) {
            duracion = Integer.parseInt(duracionString);
            album.get(i).setDuracion(duracion);
          }
          break;

        case 4:
          System.out.println("BORRAR");
          System.out.println("=======");

          System.out.println("Introduzca el codigo del disco que desea borrar");
          codigo = sc.nextLine();
          if (!album.contains(new Discos(codigo, "", "", "", 0))) {
            System.out.println("El codigo introducido no existe");
          }else{
            album.remove(album.indexOf(new Discos(codigo, "", "", "", 0)));
            System.out.println("Album borrado");
          }
          break;
      
        default:
          break;
      }
    } while (opcion != 5);
    sc.close();

  }
}
