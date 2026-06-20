package hamburgueria.cardapio;

/** Decorator abstrato. */
public abstract class LancheDecorator implements ItemCardapio {
    protected final ItemCardapio lanche;

    public LancheDecorator(ItemCardapio lanche) { this.lanche = lanche; }

    @Override public String getNome()  { return lanche.getNome(); }
    @Override public double getPreco() { return lanche.getPreco(); }
}
