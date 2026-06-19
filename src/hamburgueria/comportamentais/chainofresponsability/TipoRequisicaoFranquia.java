package hamburgueria.comportamentais.chainofresponsability;

public class TipoRequisicaoFranquia implements TipoRequisicao {
    private static TipoRequisicaoFranquia instance = new TipoRequisicaoFranquia();
    private TipoRequisicaoFranquia() {}
    public static TipoRequisicaoFranquia getTipoRequisicaoFranquia() { return instance; }
}
