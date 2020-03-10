public class Teste {
    public static void main(String[] args) {
        Conhecimento java = new Java("Java","Linguagem de programação" + " + POO", "ALTA",13.0,"10");

        Conhecimento mysql = new Mysql("MySQL", "Banco de dados relacional",
                "MÉDIA", 7.0);

        ConhecimentoController controller = new ConhecimentoController();

        controller.adicionaConhecimento(java);
        controller.adicionaConhecimento(mysql);

        controller.exibeConhecimento();





    }
}
