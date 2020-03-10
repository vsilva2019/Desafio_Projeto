import java.sql.Time;
import java.sql.Timestamp;

public abstract class Conhecimento {

    private String nome;
    private String descricao;
    private String complexidade;
    private double tempo;

    public Conhecimento(String nome, String descricao, String complexidade, double tempo) {
        this.nome = nome;
        this.descricao = descricao;
        this.complexidade = complexidade;
        this.tempo = tempo;
    }

    public double getTempoMedio(){
        return this.tempo;
    }

    public abstract double getPontuacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Conhecimento{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", complexidade='" + complexidade + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}
