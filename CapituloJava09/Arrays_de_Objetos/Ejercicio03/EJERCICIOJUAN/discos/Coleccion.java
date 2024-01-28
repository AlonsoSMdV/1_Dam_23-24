package CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN.discos;

import CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN.crud.CRUD;

public class Coleccion implements CRUD{
    private Disco[] discos;
    public Coleccion(){
        discos = new Disco[100];
    }

    public Disco anadeDisco(Disco disco){
        for(int i = 0; i < discos.length; i++){
            if(discos[i]!=null){
                discos[i]=disco;
                return disco;
            }
        }
        return null;
    }
    public Disco actualizaDisco(String codigo,
                                String nombre,
                                String autor,
                                String genero,
                                int duracion){

        Disco disco = null;
        for(int i=0; i<= discos.length; i++){
            if(codigo==discos[i].getCodigo()){
                if(!nombre.equals(""))
                    discos[i].setNombre(nombre);
                if(!autor.equals(""))
                    discos[i].setNombre(autor);
                if(!genero.equals(""))
                    discos[i].setNombre(genero);
                if(duracion != 0)
                    discos[i].setDuracion(duracion);
                disco = discos[i];
                break;
            }
        }
        return disco;
    }
    public Disco eliminaDisco(String codigo){
        Disco disco = null;
        for(int i=0; i<= discos.length; i++){
            if(codigo==discos[i].getCodigo()){
                disco = discos[i];
                discos[i] = null;
                break;
            }
        }
        return disco;
    }
    public Disco[] listaDiscos(){
        Disco[] _discos = new Disco[discos.length];
        for(int i = 0; i<discos.length; i++){
            _discos[i] = new Disco(discos[i].getNombre(), discos[i].getAutor(), discos[i].getGenero(), discos[i].getDuracion());
        }
        return _discos;
    }

}
