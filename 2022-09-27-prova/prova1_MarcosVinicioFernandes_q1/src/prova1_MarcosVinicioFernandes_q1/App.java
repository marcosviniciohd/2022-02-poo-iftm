package prova1_MarcosVinicioFernandes_q1;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Saque");
        System.out.println("2 - Deposito");
        System.out.println("3 - Exibicão de Saída");
        System.out.println("4 - SAIR");
        System.out.println("DIGITE A OPÇÃO DESEJADA:__");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1: {
                System.out.println("Digite qual o valor do saque desejado");

                break;
            }
            case 2: {
                System.out.println("Digite o valor do deposito desejado");

                break;
            }
            case 3: {
                System.out.println("Digite o lado do quadrado");

                break;
            }
            case 4:
                break;

        }
        sc.close();

    }
    public static void iniciaObjetos(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaCorrente contaEspecial = new ContaCorrente("", "", 0, "", 0);
        ContaCorrente contaComum = new ContaCorrente("", "", 0, "");
        System.out.println("Digite o tipo da sua conta (Comum ou Especial)");
        String tipoDeConta = sc.nextLine();
        if (tipoDeConta.equals("Comum") || tipoDeConta.equals("comum")){
            System.out.println("Digite seu nome ");
            String nome = sc.nextLine();
            contaComum.setNome(nome);
            System.out.println("Digite sua conta");
            String conta = sc.nextLine();
            contaComum.setNumeroConta(conta);
            contaComum.setTipoConta(tipoDeConta);
        } else {
            System.out.println("Digite seu nome ");
            String nome = sc.nextLine();
            contaEspecial.setNome(nome);
            System.out.println("Digite sua conta");
            String conta = sc.nextLine();
            contaEspecial.setNumeroConta(conta);
            contaEspecial.setTipoConta(tipoDeConta);
            System.out.println("Qual seu limite da conta especial");
            double limiteDeConta = sc.nextDouble();
            contaEspecial.setLimiteEspecial(limiteDeConta);

        }
        sc.close();
    }

    public static void main(String[] args) {
        iniciaObjetos();
    }
}
