package hamburgueria.comportamentais.strategy;

public class PrecoComDesconto implements EstrategiaPreco {
    public float calcular(float valorBase, int quantidade) { return (valorBase * quantidade) * 0.90f; }
}
