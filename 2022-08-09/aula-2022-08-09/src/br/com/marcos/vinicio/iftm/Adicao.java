package br.com.marcos.vinicio.iftm;

public class Adicao {

    private double numero1;
    private double numero2;
    private double soma;

    public void somar(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        soma = numero1 + numero2;
        System.out.println("A soma dos dois números é " + soma);
    }
}
