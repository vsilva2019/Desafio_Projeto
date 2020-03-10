public class Mysql extends Dados {

    public Mysql(String nome, String descricao, String complexidade, double tempo) {
        super(nome, descricao, complexidade, tempo);
    }

    @Override
    public double getPontuacao() {
        if (this.getTempo() >= 10 || this.getComplexidade().equals("ALTA")) {
            return 8.0;
        } else if (this.getTempo() >= 5 || this.getComplexidade().equals("MEDIA")) {
            return 4.0;
        } else if (this.getTempo() >= 2 || this.getComplexidade().equals("BAIXA")) {
            return 2.0;
        } else {
            return 1.0;
        }
    }
}
