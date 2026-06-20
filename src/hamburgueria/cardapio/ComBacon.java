package hamburgueria.cardapio;

public class ComBacon extends LancheDecorator {
    public ComBacon(ItemCardapio lanche) { super(lanche); }
    @Override public double getPreco()     { return super.getPreco() + 4.0; }
    @Override public String getDescricao() { return lanche.getDescricao() + " + Bacon"; }
}
