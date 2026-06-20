package hamburgueria.pedido;

/** Strategy: cálculo de preço final do pedido. */
public interface EstrategiaPreco {
    double calcularTotal(double subtotal);
}
