import java.time.format.DateTimeFormatter;

public abstract class Dados  extends Conhecimento{

    public Dados(String nome, String descricao, String complexidade, DateTimeFormatter time, DateTimeFormatter tempoMedio, String dificuldade, Double pontuacao) {
        super(nome, descricao, complexidade, time, tempoMedio, dificuldade, pontuacao);
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
