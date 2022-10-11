package prova1_MarcosVinicioFernandes_q1;

public class ContaCorrente {

    private String nome;
    private String numeroConta;
    private double saldo;
    private String tipoConta;
    private double limiteEspecial;


    public ContaCorrente(String nome, String numeroConta, double saldo, String tipoConta, double limiteEspecial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.limiteEspecial = limiteEspecial;
    }

    public ContaCorrente(String nome, String numeroConta, double saldo, String tipoConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void deposita(double valor){
        this.saldo += ( valor * 0.001 );
    }
    public boolean sacar(double valor){
        if( this.saldo >= valor ){
            this.saldo -= ( valor * 0.001 );
            return true;
        }
        return false;
    }
    public boolean sacar(double valor, double limite){
        if(this.saldo >= valor){
            this.saldo -= (valor * 0.002);
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
}
