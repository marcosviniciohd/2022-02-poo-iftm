import java.util.Scanner;

public class Exemplo1 {

	public static void verificaNumero(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int numero = sc.nextInt();
		while (numero == 0 || numero < 0) {
			System.out.println("N�mero inv�lido");
			System.out.println("Digite novamente! ");
			numero = sc.nextInt();
		}
		if(numero % 2 == 0) {
			System.out.println("O numero " + numero + " � par.");
		}else {
			System.out.println("O numero " + numero + " � impar.");
		}
		sc.close();
	}
	public static void main(String[] args) {
		verificaNumero();
		
	}

}
