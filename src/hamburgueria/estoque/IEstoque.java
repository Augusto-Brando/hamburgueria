package hamburgueria.estoque;

public interface IEstoque {
    int getQuantidade(String ingrediente);
    void adicionarIngrediente(String ingrediente, int quantidade);
    void consumirIngrediente(String ingrediente, int quantidade);
}
