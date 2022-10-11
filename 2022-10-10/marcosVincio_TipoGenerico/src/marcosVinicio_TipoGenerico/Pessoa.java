package marcosVinicio_TipoGenerico;

public class Pessoa {

    private String nome;
    private Character sexo;
    private String naturalidade;

    public Pessoa() {
    }

    public Pessoa(String nome, Character sexo, String naturalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
}
