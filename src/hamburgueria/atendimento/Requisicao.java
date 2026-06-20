package hamburgueria.atendimento;

public class Requisicao {
    private final String descricao;
    private final TipoRequisicao tipo;

    public Requisicao(String descricao, TipoRequisicao tipo) {
        this.descricao = descricao;
        this.tipo      = tipo;
    }
    public String          getDescricao() { return descricao; }
    public TipoRequisicao  getTipo()      { return tipo; }
}
