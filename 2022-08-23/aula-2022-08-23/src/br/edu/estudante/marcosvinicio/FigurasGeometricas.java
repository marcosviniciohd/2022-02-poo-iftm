package br.edu.estudante.marcosvinicio;

public class FigurasGeometricas {
    private double lado;
    private double base;
    private double altura;
    private double xc;
    private double yc;
    private double raio;

    //Construtores
    public FigurasGeometricas(double lado) {
        this.lado = lado;
    }

    public FigurasGeometricas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public FigurasGeometricas(double xc, double yc, double raio) {
        this.xc = xc;
        this.yc = yc;
        this.raio = raio;
    }

    //Métodos calcular área
    public double areaQuadrado(){
        return this.lado * this.lado;
    }

    public double areaTriangulo(){
        return (this.base * this.altura) / 2;
    }

    public double areaCirculo(){
        return (this.raio * this.raio) * Math.PI;
    }

    // Metodos exibir resultados
    public void exibeCirculo(){
        System.out.println("A area do circulo de centro (" + xc + "," + yc + ")" + " e raio = " + this.raio + " é: " + areaCirculo());
    }
    public void exibeTriangulo(){
        System.out.println("A area do triangulo com base " + this.base + " e altura " + this.altura + " é: " + areaTriangulo());
    }
    public void exibeQuadrado(){
        System.out.println("A area do quadrado com lado " + this.lado + " é " + areaQuadrado());
    }

}


