package hamburgueria.comportamentais.mediator;

public class Cliente {
    public String elogiarCozinha(String mensagem) {
        return Atendimento.getInstancia().receberElogioCozinha(mensagem);
    }
    public String reclamarCozinha(String mensagem) {
        return Atendimento.getInstancia().receberReclamacaoCozinha(mensagem);
    }
    public String sugerirCozinha(String mensagem) {
        return Atendimento.getInstancia().receberSugestaoCozinha(mensagem);
    }
}
