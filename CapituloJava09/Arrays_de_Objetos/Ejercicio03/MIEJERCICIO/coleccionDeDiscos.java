package CapituloJava09.Arrays_de_Objetos.Ejercicio03.MIEJERCICIO;
import java.util.Scanner;
public class coleccionDeDiscos {
  public static void menu(){
    System.out.println("COLECCIÓN DE DISCOS");
    System.out.println("====================");
    System.out.println("1. LISTADO\n2. Nuevo disco\n3. Modificar disco\n4. Borrar Disco\n5. Salir");
    System.out.println("Que desea realizar");
  }
  public static void main(String[] args) {
    final int N = 100;

    Discos disco[] = new Discos[N];
    for (int i = 0; i < disco.length; i++) {
      disco[i] = new Discos();
    }

    disco[0] = new Discos(
      "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
    disco[1] = new Discos(
      "FGHQ64", "Metallica", "Black album", "hard rock", 46);
    disco[2] = new Discos(
      "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

    int opcion;
    Scanner sc = new Scanner(System.in);
    int i;
    String codigo;
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

          for (Discos d : disco) {
            if (!d.getCodigo().equals("LIBRE")) {
              System.out.println(d);
            }
          }
          break;

        case 2:
          System.out.println("NUEVO DISCO");
          System.out.println("============");
          int libre = -1;
          do {
            libre++;
          } while (!((disco[libre].getCodigo()).equals("LIBRE")));
          System.out.println("A continuacion introduzca los siguientes datos");
          System.out.print("Código: ");
          codigo = sc.nextLine();
          System.out.print("Autor: ");
          autor = sc.nextLine();
          System.out.print("Título: ");
          titulo = sc.nextLine();
          System.out.print("Género: ");
          genero = sc.nextLine();
          System.out.print("Duración: ");
          duracion = Integer.parseInt(sc.nextLine());
          disco[libre] = new Discos(codigo, autor, titulo, genero, duracion);
          break;

        case 3:
          System.out.println("MODIFICAR");
          System.out.println("==========");

          System.out.println("Introduzca el codigo del disco que desea modificar");
          codigo = sc.nextLine();
          i = -1;
          do {
            i++;
          } while (!disco[i].getCodigo().equals(codigo));
          System.out.println("Introduzca los nuevos datos del disco");

          System.out.println("Código: "+disco[i].getCodigo());
          System.out.print("Nuevo código: ");
          codigo = sc.nextLine();
          if (!codigo.equals("")) {
            disco[i].setCodigo(codigo);
          }
          System.out.println("Autor: "+disco[i].getAutor());
          System.out.print("Nuevo autor: ");
          autor = sc.nextLine();
          if (!autor.equals("")) {
            disco[i].setAutor(autor);
          }
          System.out.println("Título: "+disco[i].getTitulo());
          System.out.print("Nuevo título: ");
          titulo = sc.nextLine();
          if (!titulo.equals("")) {
            disco[i].setTitulo(titulo);
          }
          System.out.println("Género: "+disco[i].getGenero());
          System.out.print("Nuevo género: ");
          genero = sc.nextLine();
          if (!genero.equals("")) {
            disco[i].setGenero(genero);
          }
          System.out.println("Duración: "+disco[i].getDuracion());
          System.out.print("Nueva duración: ");
          String duracionString = sc.nextLine();
          if (!duracionString.equals("")) {
            duracion = Integer.parseInt(duracionString);
            disco[i].setDuracion(duracion);
          }
          break;

        case 4:
          System.out.println("BORRAR");
          System.out.println("=======");

          System.out.println("Introduzca el codigo del disco que desea borrar");
          codigo = sc.nextLine();
          i = -1;
          do {
            i++;
          } while (!disco[i].getCodigo().equals(codigo));
          disco[i].setCodigo("LIBRE");
          System.out.println("Álbum Borrado");
          break;
      
        default:
          break;
      }
    } while (opcion != 5);
    sc.close();

  }
}
