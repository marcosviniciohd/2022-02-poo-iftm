
public class Exemplo2 {

	public static void verificaNumero(int numero) {
		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " � par.");
		} else {
			System.out.println("O numero " + numero + " � impar.");
		}
	}

	public static void main(String[] args) {
		verificaNumero(10);
		verificaNumero(5);
		verificaNumero(8);
		verificaNumero(15);
	}

}
