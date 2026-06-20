package hamburgueria.atendimento;

public class AtendenteCaixa extends Atendente {
    public AtendenteCaixa(String nome) { super(nome); }

    @Override
    public boolean atender(Requisicao req) {
        if (req.getTipo() == TipoRequisicao.DUVIDA) {
            System.out.println("[" + nome + "] Respondendo dúvida: " + req.getDescricao());
            return true;
        }
        return proximo != null && proximo.atender(req);
    }
}
