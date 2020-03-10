import java.time.format.DateTimeFormatter;

public class  LinguagemDeProgramacao extends Conhecimento {


    public LinguagemDeProgramacao(String nome, String descricao, String complexidade, DateTimeFormatter time, DateTimeFormatter tempoMedio, String dificuldade, Double pontuacao) {
        super(nome, descricao, complexidade, time, tempoMedio, dificuldade, pontuacao);
    }
    private String versao;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public DateTimeFormatter getTempoMedio() {
        return super.getTempoMedio();
    }

    @Override
    public String getDificuldade() {
        return super.getDificuldade();
    }
}
