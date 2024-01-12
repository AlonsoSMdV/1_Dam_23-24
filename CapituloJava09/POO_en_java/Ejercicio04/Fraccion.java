package CapituloJava09.POO_en_java.Ejercicio04;

public class Fraccion {
  private int signo;
  private int numerador;
  private int denominador;
  public Fraccion(int n, int d){
    if (d == 0) {
      System.out.println("Una fracción no puede tener como denominador el número 0");
    } else {
      if (n * d < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(n);
      this.denominador = Math.abs(d);
    }
  }
  int getNumerador(){
    return numerador;
  }
  int getDenominador(){
    return denominador;
  }
  public String toString() {
    if (signo == -1) {
      return "-" + this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "/" + this.denominador;
    }
  }
  public Fraccion invierte() {
    return new Fraccion(this.signo * this.denominador,this.numerador);
  }
  public Fraccion multiplica(int i) {
    return new Fraccion(this.signo * this.numerador * i,this.denominador);
  }
  public Fraccion multiplica(Fraccion f2) {
    return new Fraccion(this.signo * this.numerador * f2.numerador,this.denominador * f2.denominador);
  }
  public Fraccion divide(int i) {
    return new Fraccion(this.signo * this.numerador * i,this.denominador*1);
  }
  public Fraccion divide(Fraccion f2) {
    return new Fraccion(this.signo * this.numerador*f2.denominador,this.denominador*f2.numerador);
  }
  public Fraccion simplifica() {
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
        while (((n % i) == 0) && ((d % i) == 0)) {
            n /= i;
            d /= i;
        }
    }
    return new Fraccion(s * n, d);
  }
}
