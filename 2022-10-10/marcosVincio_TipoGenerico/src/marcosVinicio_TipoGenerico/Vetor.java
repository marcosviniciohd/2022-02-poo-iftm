package marcosVinicio_TipoGenerico;

public class Vetor <T>{

    private Object[] vet;
    private int tamanho;


    public Vetor() {
    }

    public Vetor(Object[] vet, int tamanho) {
        this.vet = vet;
        this.tamanho = tamanho;
    }

    public Object[] getVet() {
        return vet;
    }

    public void setVet(Object[] vet) {
        this.vet = vet;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
