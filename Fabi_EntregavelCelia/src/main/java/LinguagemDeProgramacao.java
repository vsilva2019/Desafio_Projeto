public abstract class LinguagemDeProgramacao extends Conhecimento {
    private String versao;

    public LinguagemDeProgramacao(String nome, String descricao, String complexidade, double tempo, String versao) {
        super(nome, descricao, complexidade, tempo);
        this.versao = versao;
    }

}
