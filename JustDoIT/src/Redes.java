public class Redes extends Infraestrutura {

    public Redes(String nome, String descricao, String complexidade, double tempo) {
        super(nome, descricao, complexidade, tempo);
    }

    @Override
    public double getPontuacao() {
        return 0;
    }
}
