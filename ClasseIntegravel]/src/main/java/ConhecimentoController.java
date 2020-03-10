import java.util.ArrayList;

 class ConhecimentoControlle {

    private ArrayList listaConhecimento;

    public ConhecimentoControlle() { listaConhecimento = new ArrayList<ConhecimentoControlle>();}

public void adicionarConhecimento ( ConhecimentoControlle c){listaConhecimento.add(c);}


public ArrayList exibirConhecimento() {
        return this.listaConhecimento;
}
}
