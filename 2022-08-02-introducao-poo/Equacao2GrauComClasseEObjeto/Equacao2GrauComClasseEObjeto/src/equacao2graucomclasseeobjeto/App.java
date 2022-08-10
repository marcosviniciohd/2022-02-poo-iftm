package equacao2graucomclasseeobjeto;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class App {
    
    public static double le(int coef){
        Scanner coeficiente = new Scanner(System.in);
        System.out.println("Digite o "+coef+"° coeficiente (A deve ser diferente de zero):");
        return coeficiente.nextDouble();
    }
    
    public static void main(String[] args) {
      
        double a, b, c, d, x1, x2;
        Equacao2GrauComClasseEObjeto eq1;
        
        a = le(1);
        b = le(2);
        c = le(3);
        
        eq1 = new Equacao2GrauComClasseEObjeto(a,b,c);
        d = eq1.delta();
        if(d<0)
            JOptionPane.showMessageDialog(null, "Não existem reaízes reais", "SAÍDA", 1);
        else
        {
            x1 = eq1.calculaX1(d);
            x2 = eq1.calculaX2(d);
            eq1.exibe(x1, x2);            
        }
    }
}







