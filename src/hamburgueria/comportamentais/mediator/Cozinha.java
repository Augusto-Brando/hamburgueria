package hamburgueria.comportamentais.mediator;

public class Cozinha implements Setor {
    private static Cozinha instancia = new Cozinha();
    private Cozinha() {}
    public static Cozinha getInstancia() { return instancia; }

    public String receberReclamacao(String mensagem) {
        return "A Cozinha vai procurar melhorar o servico da reclamacao: " + mensagem;
    }
    public String receberElogio(String mensagem) {
        return "A Cozinha agradece a mensagem: " + mensagem;
    }
    public String receberSugestao(String mensagem) {
        return "A Cozinha vai analisar a sugestao: " + mensagem;
    }
}
