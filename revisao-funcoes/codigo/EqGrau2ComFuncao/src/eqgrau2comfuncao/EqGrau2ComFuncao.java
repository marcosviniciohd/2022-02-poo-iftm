package eqgrau2comfuncao;

import java.util.Scanner;

public class EqGrau2ComFuncao {
    
    public static double le(int coef){
        Scanner coeficiente = new Scanner(System.in);
        System.out.println("Digite o "+coef+"° coeficiente (A deve ser diferente de zero):");
        return coeficiente.nextDouble();
    }
    
    public static double delta(double a, double b, double c){
        return Math.pow(b,2)-4*a*c;
    }
    
    public static double calculaX1(double a, double b, double d){
        return (-b+Math.sqrt(d))/(2*a);
    }

    public static double calculaX2(double a, double b, double d){
        return (-b-Math.sqrt(d))/(2*a);
    }
    
    public static void exibe(double x1, double x2){
        System.out.println("As raízes da equação são: X1= "+x1+"    X2= "+x2);
    }
    
    public static void main(String[] args) {
    double a, b, c, d, x1, x2;
        
    System.out.println("Digite os 3 coeficientes da equação com A diferente de zero!");
    a = le(1);
    b = le(2);
    c = le(3);
    d = delta(a,b,c);
    if(d<0)
        System.out.println("Não existem raízes reais!");
    else{
            x1= calculaX1(a,b,d);
            x2= calculaX2(a,b,d);
            exibe(x1,x2);
        }
    }  //fim do main() 
} //fim da classe

//x2+5x+4=0