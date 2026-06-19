package hamburgueria.comportamentais.chainofresponsability;

public class TipoRequisicaoReclamacao implements TipoRequisicao {
    private static TipoRequisicaoReclamacao instance = new TipoRequisicaoReclamacao();
    private TipoRequisicaoReclamacao() {}
    public static TipoRequisicaoReclamacao getTipoRequisicaoReclamacao() { return instance; }
}
