package hamburgueria.comportamentais.chainofresponsability;

public class AtendenteCaixa extends Atendente {
    public AtendenteCaixa(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoPedido.getTipoRequisicaoPedido());
        setAtendenteSuperior(superior);
    }
    public String getDescricaoCargo() { return "Caixa"; }
}
