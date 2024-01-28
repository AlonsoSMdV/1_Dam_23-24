package CapituloJava09.Arrays_de_Objetos.Ejercicio04;
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
    String codigo = "";
    String cAux;
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
            for (Discos d : disco) {
              if (!d.getCodigo().equals("LIBRE")) {
                System.out.println(d);
              }
            }
              break;

            case 2:
            System.out.println("De que autor desea buscar los discos");
            autor = sc.nextLine();
            for (Discos d : disco) {
              if (d.getAutor().equals(autor)) {
                System.out.println(d);
              }
            }
              break;

            case 3:
            System.out.println("De que genero desea buscar los discos");
            genero = sc.nextLine();
            for (Discos d : disco) {
              if (d.getGenero().equals(genero)) {
                System.out.println(d);
              }
            }
              break;

            case 4:
            for (Discos d : disco) {
            System.out.println("Entre que rango de duracion desea buscar los discos");
            System.out.println("Duracion inicial");
            String durIni = sc.nextLine();
            System.out.println("Duracion final");
            String durFin = sc.nextLine();
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
          int libre = 0;
          cAux = disco[libre].getCodigo();
          while ((libre < N) && (!(cAux).equals("LIBRE"))) {
            libre++;
            if (libre < N) {
              cAux = disco[libre].getCodigo();
            }
          }

          if (libre == N) {
            System.out.println("Lo siento pero no quedan huecos libres para un disco nuevo");
          }else{
            System.out.println("A continuacion introduzca los siguientes datos");
            System.out.print("Código: ");
            boolean existeCodigo = true;
            while (existeCodigo) {
              existeCodigo = false;
              codigo = sc.nextLine();

              for (Discos discos : disco) {
                if(codigo.equals(discos.getCodigo())){
                  existeCodigo = true;
                }
              }
              if (existeCodigo) {
                System.out.println("El codigo ya existe ");
                System.out.print("Introduzca otro: ");
              }
            }
            System.out.print("Autor: ");
            autor = sc.nextLine();
            System.out.print("Título: ");
            titulo = sc.nextLine();
            System.out.print("Género: ");
            genero = sc.nextLine();
            System.out.print("Duración: ");
            duracion = Integer.parseInt(sc.nextLine());
            disco[libre] = new Discos(codigo, autor, titulo, genero, duracion);
          }
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
          cAux = "";
          do {
            System.out.println(i);
            i++;
            if (i < N) {
              cAux = disco[i].getCodigo();
            }
          } while (!(cAux.equals(codigo)) && (i < N));
          
          System.out.println(i);
          if(i == N){
            System.out.println("El codigo no existe");
          }else{
            disco[i].setCodigo("LIBRE");
            System.out.println("Álbum Borrado");
          }
          break;
      
        default:
          break;
      }
    } while (opcion != 5);
    sc.close();

  }
}
