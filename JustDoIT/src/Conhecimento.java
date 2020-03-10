

public abstract class Conhecimento {

    private String nome;
    private String descricao;
    private String complexidade;
    private double tempo;
    private double Pontuacao;

    public Conhecimento(String nome, String descricao, String complexidade, double tempo, double pontuacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.complexidade = complexidade;
        this.tempo = tempo;
        Pontuacao = pontuacao;
    }

    public abstract double getPontuacao();

    public double getTempoMedio() {
        return tempo;
    }

    public String getDificuldade() {
        return complexidade;
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

    public void setPontuacao(double pontuacao) {
        Pontuacao = pontuacao;
    }
}