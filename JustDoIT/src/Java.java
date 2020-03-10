public class Java extends LinguagemDeProgramacao {

    public Java(String nome, String descricao, String complexidade, double tempo, String versao) {
        super(nome, descricao, complexidade, tempo, versao);
    }

    @Override
    public double getPontuacao() {
        return 0;
    }
}
