package CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN.crud;

import CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN.discos.Disco;

public interface CRUD {
    public Disco anadeDisco(Disco disco);
    public Disco actualizaDisco(String codigo,
                                String nombre,
                                String autor,
                                String genero,
                                int duracion);
    public Disco eliminaDisco(String codigo);
    public Disco[] listaDiscos();
}
