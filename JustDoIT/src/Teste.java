public class Teste {

    public static void main(String[] args) {

        LinguagemDeProgramacao ldp = new LinguagemDeProgramacao() {

        @Override
        public double getPontuacao() {
            return ("Css",
            "Linguagem de programação", "Alta",15);
        }

        Infraestrutura infra = new Infraestrutura() {
            @Override
            public double getPontuacao() {
                return ("Data Center", "Infraestrutura", "Media", 10 );
            }
        }

        Dados bd = new Dados() {
            @Override
            public double getPontuacao() {
                return "SQL Server", "Banco de dados", "Baixa", 5);
            }
        }
    }

}
