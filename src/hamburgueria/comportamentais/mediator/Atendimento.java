package hamburgueria.comportamentais.mediator;

public class Atendimento {
    private static Atendimento instancia = new Atendimento();
    private Atendimento() {}
    public static Atendimento getInstancia() { return instancia; }

    public String receberElogioCozinha(String mensagem) {
        return "O Atendimento agradece seu contato.\n" +
               "A Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
               ">>" + Cozinha.getInstancia().receberElogio(mensagem);
    }
    public String receberReclamacaoCozinha(String mensagem) {
        return "O Atendimento agradece seu contato.\n" +
               "A Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
               ">>" + Cozinha.getInstancia().receberReclamacao(mensagem);
    }
    public String receberSugestaoCozinha(String mensagem) {
        return "O Atendimento agradece seu contato.\n" +
               "A Cozinha respondeu sua demanda conforme mensagem a seguir.\n" +
               ">>" + Cozinha.getInstancia().receberSugestao(mensagem);
    }
}
