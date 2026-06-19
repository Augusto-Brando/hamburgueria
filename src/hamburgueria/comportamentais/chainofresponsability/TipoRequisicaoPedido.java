package hamburgueria.comportamentais.chainofresponsability;

public class TipoRequisicaoPedido implements TipoRequisicao {
    private static TipoRequisicaoPedido instance = new TipoRequisicaoPedido();
    private TipoRequisicaoPedido() {}
    public static TipoRequisicaoPedido getTipoRequisicaoPedido() { return instance; }
}
