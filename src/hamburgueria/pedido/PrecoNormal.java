package hamburgueria.pedido;

public class PrecoNormal implements EstrategiaPreco {
    @Override public double calcularTotal(double subtotal) { return subtotal; }
}
