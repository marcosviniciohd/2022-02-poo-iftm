package paridade.soma;

import java.util.Scanner;

public class Paridade {
	
	int numero;

	public Paridade(int numero) {
		this.numero = numero;
	}
	
	public void verificarParidade() {
			while(numero <= 0) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite um número válido.");
				numero = sc.nextInt();
				sc.close();
			}
		if (numero % 2 == 0) {
			System.out.println("Número digita é par.");
		}else {
			System.out.println("Número digita é impar.");
		}
	}

}
