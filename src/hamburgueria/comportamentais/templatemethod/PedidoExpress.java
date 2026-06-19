package hamburgueria.comportamentais.templatemethod;

public class PedidoExpress extends Pedido {
    public String verificarPrioridade() {
        return this.calcularTempoTotal() <= 15.0f ? "Alta" : "Normal";
    }
}
