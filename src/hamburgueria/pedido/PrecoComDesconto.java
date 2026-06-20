package hamburgueria.pedido;

public class PrecoComDesconto implements EstrategiaPreco {
    private final double percentualDesconto;
    public PrecoComDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
    @Override public double calcularTotal(double subtotal) {
        return subtotal * (1 - percentualDesconto / 100.0);
    }
}
