public class MySql extends Dados {

    public MySql(String nome, String descricao, String complexidade, double tempo) {
        super(nome, descricao, complexidade, tempo);
    }

    @Override
    public double getPontuacao() {
        return 0;
    }
}
