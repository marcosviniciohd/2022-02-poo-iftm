package br.edu.iftm.estudante.marcos.fernandes;

import java.util.Date;

public class JogadorDeFutebol {

    public String nome;
    public String posicao;
    public Date dataNacimento;
    public String nacionalidade;
    public Double altura;
    public Double peso;


    public JogadorDeFutebol(String nome, String posicao, Date dataNacimento, String nacionalidade, Double altura, Double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNacimento = dataNacimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public Date calculaIdade(){
        return this.dataNacimento;
    }
}
