package hamburgueria.comportamentais.chainofresponsability;

public class AtendenteGerente extends Atendente {
    public AtendenteGerente(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoReclamacao.getTipoRequisicaoReclamacao());
        listaRequisicoes.add(TipoRequisicaoReembolso.getTipoRequisicaoReembolso());
        setAtendenteSuperior(superior);
    }
    public String getDescricaoCargo() { return "Gerente"; }
}
