package eqgrau2semfuncao;

import java.util.Scanner;

public class EqGrau2SemFuncao {

    public static void main(String[] args) {
    double a, b, c, d, x1, x2;
    
    Scanner coeficiente = new Scanner(System.in);
    
    System.out.println("Digite os coeficientes da equação com A diferente de zero!");
    System.out.println("Digite o coeficiente A (deve ser diferente de zero):");
    a = coeficiente.nextDouble();
    System.out.println("Digite o coeficiente B:");
    b = coeficiente.nextDouble();
    System.out.println("Digite o coeficiente C:");
    c = coeficiente.nextDouble();
    d = Math.pow(b,2)-4*a*c;
    if(d<0)
        System.out.println("Não existem raízes reais!");
    else{
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("As raízes da equação são: X1= "+x1+"    X2= "+x2);
        }
    }  //fim do main() 
} //fim da classe

//x2+5x+4=0
