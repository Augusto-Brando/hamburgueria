package hamburgueria.pedido;

public class PrecoComTaxaEntrega implements EstrategiaPreco {
    private final double taxaEntrega;
    public PrecoComTaxaEntrega(double taxaEntrega) { this.taxaEntrega = taxaEntrega; }
    @Override public double calcularTotal(double subtotal) { return subtotal + taxaEntrega; }
}
