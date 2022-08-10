package br.com.marcos.vinicio.iftm;

public class Programa {
    public static void main(String[] args) {
        Adicao adicao = new Adicao();
        adicao.somar(45, 100);

        Subtracao subtracao = new Subtracao();
        subtracao.diminuir(100, 50);

        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.multiplicar(45, 100);

        Divisao divisao = new Divisao();
        divisao.dividir(10, 10);
    }
}
