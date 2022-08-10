package equacao2graucomclasseeobjeto;

import java.util.Scanner;


public class Equacao2GrauComClasseEObjeto {

    public double a, b, c;
    
    public Equacao2GrauComClasseEObjeto(double x, double y, double z)
    {
        a = x;
        b = y;
        c = z;
        
    }
    
    public double delta(){
        return Math.pow(b,2)-4*a*c;
    }
    
    public double calculaX1(double d){
        return (-b+Math.sqrt(d))/(2*a);
    }

    public double calculaX2(double d){
        return (-b-Math.sqrt(d))/(2*a);
    }
    
    public void exibe(double x1, double x2){
        System.out.println("As raízes da equação são: X1= "+x1+"    X2= "+x2);
    }  
    
    
}
