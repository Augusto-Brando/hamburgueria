package hamburgueria.cardapio;

import java.util.ArrayList;
import java.util.List;

/**
 * Composto do Composite: agrega itens e soma preços.
 */
public class Combo implements ItemCardapio {
    private final String nome;
    private final List<ItemCardapio> itens = new ArrayList<>();

    public Combo(String nome) { this.nome = nome; }

    public void adicionar(ItemCardapio item)  { itens.add(item); }
    public void remover(ItemCardapio item)    { itens.remove(item); }
    public List<ItemCardapio> getItens()      { return itens; }

    @Override public String getNome() { return nome; }
    @Override public double getPreco() {
        return itens.stream().mapToDouble(ItemCardapio::getPreco).sum();
    }
    @Override public String getDescricao() {
        StringBuilder sb = new StringBuilder("Combo: ");
        for (int i = 0; i < itens.size(); i++) {
            sb.append(itens.get(i).getNome());
            if (i < itens.size() - 1) sb.append(" + ");
        }
        return sb.toString();
    }
}
