public abstract class LinguagemDeProgramacao extends Conhecimento {

    private String versao;

    public LinguagemDeProgramacao(String nome, String descricao, String complexidade, double tempo, double pontuacao, String versao) {
        super(nome, descricao, complexidade, tempo, pontuacao);
        this.versao = versao;
    }
}
