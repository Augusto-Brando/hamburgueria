package hamburgueria.estoque;

/**
 * Proxy de proteção: apenas gerentes podem ver quantidades reais;
 * funcionários comuns recebem apenas "disponível" ou "indisponível".
 * (Padrão: Proxy)
 */
public class EstoqueProxy implements IEstoque {
    private IEstoque estoqueReal;          // criado sob demanda (lazy)
    private final Funcionario funcionario;

    public EstoqueProxy(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    private IEstoque getEstoqueReal() {
        if (estoqueReal == null) estoqueReal = new Estoque();
        return estoqueReal;
    }

    @Override
    public int getQuantidade(String ingrediente) {
        if (!funcionario.ehGerente())
            throw new SecurityException("Apenas gerentes podem ver quantidades.");
        return getEstoqueReal().getQuantidade(ingrediente);
    }

    @Override
    public void adicionarIngrediente(String ingrediente, int quantidade) {
        getEstoqueReal().adicionarIngrediente(ingrediente, quantidade);
    }

    @Override
    public void consumirIngrediente(String ingrediente, int quantidade) {
        getEstoqueReal().consumirIngrediente(ingrediente, quantidade);
    }
}
