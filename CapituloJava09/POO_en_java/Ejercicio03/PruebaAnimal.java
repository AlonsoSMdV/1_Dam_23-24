package CapituloJava09.POO_en_java.Ejercicio03;
public class PruebaAnimal {
  public static void main(String[] args) {
    Gato garfield = new Gato("MACHO");
    Gato tom = new Gato("MACHO");
    Gato shiva = new Gato("HEMBRA");
    garfield.hazRuido();
    tom.come("pescado");
    shiva.duerme();
    garfield.peleaCon(shiva);
    tom.peleaCon(garfield);
  System.out.println();
    Perro loki = new Perro("MACHO");
    Perro sira = new Perro("HEMBRA");
    loki.come("carne");
    loki.duerme();
    sira.hazRuido();
    sira.peleaCon(loki);
  System.out.println();
    Lagarto serpiente = new Lagarto("HEMBRA");
    serpiente.come();
    serpiente.duerme();
    serpiente.nada();
    serpiente.repta();
  System.out.println();
    Canario piolin = new Canario("MACHO");
    piolin.aseate();
    piolin.come();
    piolin.duerme();
    piolin.vuela();
  System.out.println();
    Pinguino skipper = new Pinguino("MACHO");
    skipper.aseate();
    skipper.come();
    skipper.duerme();
    skipper.vuela();
  System.out.println();
    Mamifero vaca = new Mamifero("HEMBRA");
    vaca.come("hierba");
  System.out.println();
    Ave cuervo = new Ave("MACHO");
    cuervo.aseate();
    cuervo.come();
    cuervo.duerme();
    cuervo.vuela();
  }
}
