package hamburgueria.comportamentais.templatemethod;

public class PedidoEspecial extends Pedido {
    public String verificarPrioridade() {
        return this.calcularTempoTotal() <= 30.0f ? "Alta" : "Normal";
    }

    @Override
    public String getTipo() { return "PedidoGourmet"; }
}
