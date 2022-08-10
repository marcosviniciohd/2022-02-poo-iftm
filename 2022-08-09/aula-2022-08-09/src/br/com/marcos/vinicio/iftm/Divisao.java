package br.com.marcos.vinicio.iftm;

public class Divisao {

    private double numero1;
    private double numero2;
    private double resto;

    public void dividir(double numero1, double numero2){
      this.numero1 = numero1;
      this.numero2 = numero2;
      resto = numero1 / numero2;
        System.out.println("A divisão dos dois números inseridos é " + resto);
    }
}
