import java.time.format.DateTimeFormatter;

public class MySql extends Dados {
    public MySql(String nome, String descricao, String complexidade, DateTimeFormatter time, DateTimeFormatter tempoMedio, String dificuldade, Double pontuacao) {
        super(nome, descricao, complexidade, time, tempoMedio, dificuldade, pontuacao);
    }
}
