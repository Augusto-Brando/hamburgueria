package hamburgueria.cardapio;

/** Folha do Composite. */
public class PratoSimples implements ItemCardapio {
    private final String nome;
    private final double preco;
    private final String descricao;

    public PratoSimples(String nome, double preco, String descricao) {
        this.nome      = nome;
        this.preco     = preco;
        this.descricao = descricao;
    }
    @Override public String getNome()      { return nome; }
    @Override public double getPreco()     { return preco; }
    @Override public String getDescricao() { return descricao; }
}
