package paridade.soma;

public class Soma {
	
	int numero1, numero2, soma;

	public Soma(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int somar() {
		soma = numero1 + numero2;
		System.out.println("A soma dos números digitados é " + soma + ".");
		return soma;
	}
	
	

}
