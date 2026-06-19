package hamburgueria.comportamentais.chainofresponsability;

public class TipoRequisicaoReembolso implements TipoRequisicao {
    private static TipoRequisicaoReembolso instance = new TipoRequisicaoReembolso();
    private TipoRequisicaoReembolso() {}
    public static TipoRequisicaoReembolso getTipoRequisicaoReembolso() { return instance; }
}
