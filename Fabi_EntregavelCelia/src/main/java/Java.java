public class Java extends LinguagemDeProgramacao {

    public Java(String nome, String descricao, String complexidade, double tempo, String versao) {
        super(nome, descricao, complexidade, tempo, versao);
    }

    @Override
    public double getPontuacao() {
        if (this.getTempo() >= 10 || this.getComplexidade().equals("ALTA")) {
            return 15.0;
        } else if (this.getTempo() >= 5 || this.getComplexidade().equals("MEDIA")) {
            return 7.5;
        } else if (this.getTempo() >= 2 || this.getComplexidade().equals("BAIXA")) {
            return 4.0;
        }
        else {
            return 1.0;
        }
    }
}

