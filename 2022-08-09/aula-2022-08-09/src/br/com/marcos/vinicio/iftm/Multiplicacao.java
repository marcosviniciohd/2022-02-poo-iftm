package br.com.marcos.vinicio.iftm;

public class Multiplicacao {

    private double numero1;
    private double numero2;
    private double total;

    public void multiplicar(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        total = numero1 * numero2;
        System.out.println("A multiplicação dos dois números inseridos é " + total);
    }
}
