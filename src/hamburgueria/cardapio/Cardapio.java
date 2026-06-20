package hamburgueria.cardapio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Cardápio do restaurante — implementa Iterable (Iterator pattern).
 */
public class Cardapio implements Iterable<ItemCardapio> {
    private final List<ItemCardapio> itens = new ArrayList<>();

    public void adicionarItem(ItemCardapio item) { itens.add(item); }
    public void removerItem(ItemCardapio item)   { itens.remove(item); }
    public int  tamanho()                        { return itens.size(); }

    @Override
    public Iterator<ItemCardapio> iterator() { return itens.iterator(); }
}
