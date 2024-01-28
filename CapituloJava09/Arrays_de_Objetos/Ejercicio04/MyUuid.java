package CapituloJava09.Arrays_de_Objetos.Ejercicio04;

public class MyUuid {
  public static String getUuid(int digits){
    String ret = "";
    final char A = 'A';
    final char ZERO = '0';
    for (int i = 1; i <= digits; i++) {
        if(Math.random()>0.5){
            //one letter
            ret += (char)((int)A+(int)(Math.random() * 26));
        }else{
            //one digit
            ret += (char)(ZERO+(int)(Math.random() * 10));
        }
    }

    return ret;
  }
}
