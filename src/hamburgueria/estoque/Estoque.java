package hamburgueria.estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque implements IEstoque {
    private final Map<String, Integer> ingredientes = new HashMap<>();

    @Override
    public int getQuantidade(String ingrediente) {
        return ingredientes.getOrDefault(ingrediente, 0);
    }

    @Override
    public void adicionarIngrediente(String ingrediente, int quantidade) {
        ingredientes.merge(ingrediente, quantidade, Integer::sum);
    }

    @Override
    public void consumirIngrediente(String ingrediente, int quantidade) {
        int atual = getQuantidade(ingrediente);
        if (quantidade > atual)
            throw new IllegalStateException("Estoque insuficiente de: " + ingrediente);
        ingredientes.put(ingrediente, atual - quantidade);
    }
}
