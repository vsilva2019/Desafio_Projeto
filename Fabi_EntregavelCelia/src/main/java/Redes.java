public class Redes extends Infraestrutura {
    public Redes(String nome, String descricao, String complexidade, double tempo) {
        super(nome, descricao, complexidade, tempo);
    }

    @Override
    public double getPontuacao() {

        if (this.getTempo() >= 10 || this.getComplexidade().equals("ALTA")) {
            return 12.0;
        } else if (this.getTempo() >= 5 || this.getComplexidade().equals("MEDIA")) {
            return 6.0;
        } else if (this.getTempo() >= 2 || this.getComplexidade().equals("BAIXA")) {
            return 3.0;
        } else {
            return 1.0;
        }
    }
}
