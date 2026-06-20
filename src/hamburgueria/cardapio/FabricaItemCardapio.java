package hamburgueria.cardapio;

/**
 * Factory Method abstrata para criar itens do cardápio.
 */
public abstract class FabricaItemCardapio {
    public abstract ItemCardapio criarItem();

    public ItemCardapio pedirItem() {
        ItemCardapio item = criarItem();
        System.out.println("Preparando: " + item.getDescricao());
        return item;
    }
}
