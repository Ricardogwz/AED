
public class Segmento {
    private String nome;
    private int quantidade;
    public String getQuantidade;

    public Segmento(String nome) {
        this.nome = nome;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void incrementaQuantidade() {
        quantidade++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Segmento [nome=" + nome + ", quantidade=" + quantidade + "]";
    }

    
}