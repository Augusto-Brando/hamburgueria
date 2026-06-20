package hamburgueria.cardapio;

/** Implementação base de hambúrguer (Decorator base). */
public class Lanche implements ItemCardapio {
    private final String nome;
    private final double precoBase;

    public Lanche(String nome, double precoBase) {
        this.nome      = nome;
        this.precoBase = precoBase;
    }
    @Override public String getNome()      { return nome; }
    @Override public double getPreco()     { return precoBase; }
    @Override public String getDescricao() { return nome; }
}
