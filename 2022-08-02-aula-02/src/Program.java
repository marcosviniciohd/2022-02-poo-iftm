import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static double le(int coef){
        Scanner coeficiente = new Scanner(System.in);
        System.out.println("Digite o "+coef+"° coeficiente (A deve ser diferente de zero):");
        return coeficiente.nextDouble();
    }

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double a, b, c, d, x1, x2;
		Equacao2GrauClasseEObjeto eq1;
		
		a = le(1);
		b = le(2);
		c = le(3);
		
		eq1 = new Equacao2GrauClasseEObjeto(a, b, c);
		d = eq1.delta();
        if(d<0) {
        	System.out.println("Não existe raizes reais");
        } 
        else
        {
            x1 = eq1.calculaX1(d);
            x2 = eq1.calculaX2(d);
            eq1.exibe(x1, x2);            
        }
		
		
	}

}
