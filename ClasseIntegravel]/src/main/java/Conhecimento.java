import java.time.format.DateTimeFormatter;

public abstract class Conhecimento  {
    private String nome;
    private String descricao;
    private String complexidade;
    private DateTimeFormatter time;
public   DateTimeFormatter TempoMedio;
public String Dificuldade;
public  Double Pontuacao;

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

    public DateTimeFormatter getTime() {
        return time;
    }

    public void setTime(DateTimeFormatter time) {
        this.time = time;
    }

    public DateTimeFormatter getTempoMedio() {
        return TempoMedio;
    }

    public void setTempoMedio(DateTimeFormatter tempoMedio) {
        TempoMedio = tempoMedio;
    }

    public String getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        Dificuldade = dificuldade;
    }

    public Double getPontuacao() {
        return Pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        Pontuacao = pontuacao;
    }

    public Conhecimento(String nome, String descricao, String complexidade, DateTimeFormatter time, DateTimeFormatter tempoMedio, String dificuldade, Double pontuacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.complexidade = complexidade;
        this.time = time;
        TempoMedio = tempoMedio;
        Dificuldade = dificuldade;
        Pontuacao = pontuacao;

    }

    @Override
    public String toString() {
        return "Conhecimento{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", complexidade='" + complexidade + '\'' +
                ", time=" + time +
                ", TempoMedio=" + TempoMedio +
                ", Dificuldade='" + Dificuldade + '\'' +
                ", Pontuacao=" + Pontuacao +
                '}';
    }

}
