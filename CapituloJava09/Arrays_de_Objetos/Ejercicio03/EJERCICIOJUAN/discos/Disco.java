package CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN.discos;

import CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN.uuids.MyUuid;

public class Disco {

    private String codigo;
    private String autor;
    private int duracion;
    private String nombre;
    private String genero;

    public Disco(String nombre, 
          String autor, 
          String genero, 
          int duracion){
            this.codigo = MyUuid.getUuid(6);
            this.autor = autor;
            this.genero = genero;
            this.nombre = nombre;
            this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        String salida = "";
        salida+="------------------------------------\n";
        salida+=String.format("Autor: %s%n", this.autor);
        salida+=String.format("Título: %s%n", this.nombre);
        salida+=String.format("Género: %s%n", this.genero);
        salida+=String.format("Duración: %d%n", this.duracion);
        salida+="------------------------------------\n";
        return salida;
    }

    
}
