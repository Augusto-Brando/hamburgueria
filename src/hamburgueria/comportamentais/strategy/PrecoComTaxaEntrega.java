package hamburgueria.comportamentais.strategy;

public class PrecoComTaxaEntrega implements EstrategiaPreco {
    private static final float TAXA_ENTREGA = 5.00f;
    public float calcular(float valorBase, int quantidade) {
        if (quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        return (valorBase * quantidade) + TAXA_ENTREGA;
    }
}
