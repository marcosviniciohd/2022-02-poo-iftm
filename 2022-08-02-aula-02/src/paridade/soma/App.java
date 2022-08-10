package paridade.soma;

public class App {

	public static void main(String[] args) {

		Soma soma = new Soma(6, 10);
		soma.somar();
		
		Paridade paridade = new Paridade(6);
		paridade.verificarParidade();
	}

}
