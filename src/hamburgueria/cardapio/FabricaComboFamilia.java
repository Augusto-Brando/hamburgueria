package hamburgueria.cardapio;

public class FabricaComboFamilia extends FabricaItemCardapio {
    @Override
    public ItemCardapio criarItem() {
        Combo combo = new Combo("Combo Família");
        combo.adicionar(new Lanche("Clássico", 22.0));
        combo.adicionar(new PratoSimples("Batata Frita Grande", 12.0, "Porção de batatas fritas"));
        combo.adicionar(new PratoSimples("Refrigerante 500ml", 7.0, "Lata gelada"));
        return combo;
    }
}
