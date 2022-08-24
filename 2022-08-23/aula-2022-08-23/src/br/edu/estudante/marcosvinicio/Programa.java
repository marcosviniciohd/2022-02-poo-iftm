package br.edu.estudante.marcosvinicio;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void menu(){
        double lado, base, altura, raio, xc, yc;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Circulo");
        System.out.println("2 - Triângulo");
        System.out.println("3 - Quadrado");
        System.out.println("4 - SAIR");
        System.out.println("DIGITE A OPÇÃO DESEJADA:__");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1: {
                System.out.println("Digite o raio, XC e YC do circulo ");
                raio = sc.nextDouble();
                xc = sc.nextDouble();
                yc = sc.nextDouble();
                FigurasGeometricas circulo = new FigurasGeometricas(xc, yc, raio);
                circulo.exibeCirculo();
                break;
            }
            case 2: {
                System.out.println("Digite a base e altura do triangulo ");
                base = sc.nextDouble();
                altura = sc.nextDouble();
                FigurasGeometricas triangulo = new FigurasGeometricas(base, altura);
                triangulo.exibeTriangulo();
                break;
            }
            case 3: {
                System.out.println("Digite o lado do quadrado");
                lado = sc.nextDouble();
                FigurasGeometricas quadrado = new FigurasGeometricas(lado);
                quadrado.exibeQuadrado();
                break;
            }
            case 4:
                break;

        }

    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        menu();
    }
}
