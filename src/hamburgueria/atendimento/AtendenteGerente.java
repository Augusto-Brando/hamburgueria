package hamburgueria.atendimento;

public class AtendenteGerente extends Atendente {
    public AtendenteGerente(String nome) { super(nome); }

    @Override
    public boolean atender(Requisicao req) {
        if (req.getTipo() == TipoRequisicao.RECLAMACAO
         || req.getTipo() == TipoRequisicao.REEMBOLSO) {
            System.out.println("[" + nome + "] Gerente resolvendo: " + req.getDescricao());
            return true;
        }
        return proximo != null && proximo.atender(req);
    }
}
