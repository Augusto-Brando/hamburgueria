package hamburgueria.comportamentais.chainofresponsability;

public class AtendenteCozinha extends Atendente {
    public AtendenteCozinha(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoReembolso.getTipoRequisicaoReembolso());
        setAtendenteSuperior(superior);
    }
    public String getDescricaoCargo() { return "Cozinha"; }
}
