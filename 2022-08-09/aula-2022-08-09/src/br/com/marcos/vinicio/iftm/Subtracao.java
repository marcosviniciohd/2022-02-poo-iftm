package br.com.marcos.vinicio.iftm;

public class Subtracao {

    private double minuendo;
    private double subtraendo;
    private double resto;

    public void diminuir(double numero1, double numero2){
        this.minuendo = numero1;
        this.subtraendo = numero2;
        resto = numero1 - numero2;
        System.out.println("A subtracao dos dois números é " + resto);
    }
}
