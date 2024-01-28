package CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN;

import CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN.discos.Disco;
import CapituloJava09.Arrays_de_Objetos.Ejercicio03.EJERCICIOJUAN.uuids.MyUuid;

/**
 * Corresponde al Ejercicio 3 de array de objetos
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println(MyUuid.getUuid(6));
        Disco disco = new Disco("Maximazing the Audience", "Wim Mertens", "instrumental", 50);
        System.out.println(disco);
    }
}
