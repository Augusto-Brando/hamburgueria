package hamburgueria.cardapio;

public class FabricaLancheClassico extends FabricaItemCardapio {
    @Override
    public ItemCardapio criarItem() {
        return new Lanche("Clássico", 22.0);
    }
}
