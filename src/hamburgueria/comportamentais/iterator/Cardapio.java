package hamburgueria.comportamentais.iterator;

import java.util.*;

public class Cardapio implements Iterable<ItemCardapio> {
    private List<ItemCardapio> itens = new ArrayList<>();

    public Cardapio(ItemCardapio... itens) {
        this.itens = Arrays.asList(itens);
    }

    @Override
    public Iterator<ItemCardapio> iterator() {
        return itens.iterator();
    }
}
