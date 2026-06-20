package hamburgueria.cardapio;

public class ComSalada extends LancheDecorator {
    public ComSalada(ItemCardapio lanche) { super(lanche); }
    @Override public double getPreco()     { return super.getPreco() + 1.5; }
    @Override public String getDescricao() { return lanche.getDescricao() + " + Salada"; }
}
