import java.util.Scanner;

public class Exemplo3 {
	
	public static int verificaNumero(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero ");
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " � par.");
		} else {
			System.out.println("O numero " + numero + " � impar.");
		}
		
		return numero;
	}

	public static void main(String[] args) {
		
		verificaNumero();
	}

}
