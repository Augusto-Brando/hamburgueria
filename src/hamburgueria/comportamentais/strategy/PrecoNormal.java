package hamburgueria.comportamentais.strategy;

public class PrecoNormal implements EstrategiaPreco {
    public float calcular(float valorBase, int quantidade) { return valorBase * quantidade; }
}
