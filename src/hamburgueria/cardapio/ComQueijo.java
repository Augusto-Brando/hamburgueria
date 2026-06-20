package hamburgueria.cardapio;

public class ComQueijo extends LancheDecorator {
    public ComQueijo(ItemCardapio lanche) { super(lanche); }
    @Override public double getPreco()     { return super.getPreco() + 2.0; }
    @Override public String getDescricao() { return lanche.getDescricao() + " + Queijo"; }
}
