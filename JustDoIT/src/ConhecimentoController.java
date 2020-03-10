import java.util.ArrayList;

public class ConhecimentoController {

    private ArrayList<Conhecimento> lista;

    public ConhecimentoController() {
        lista = new ArrayList<Conhecimento>();
    }

    public void adicionaConhecimento(Conhecimento c) {
        lista.add(c);
    }

    public void exibeConhecimento() {
        for (Conhecimento c : lista) {
            System.out.println(c);
        }

    }

}