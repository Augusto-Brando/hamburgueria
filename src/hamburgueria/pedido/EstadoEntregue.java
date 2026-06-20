package hamburgueria.pedido;

public class EstadoEntregue implements EstadoPedido {
    private static final EstadoEntregue INSTANCIA = new EstadoEntregue();
    private EstadoEntregue() {}
    public static EstadoEntregue getInstance() { return INSTANCIA; }

    @Override public void avancar(Pedido pedido) { throw new IllegalStateException("Pedido já entregue."); }
    @Override public void cancelar(Pedido pedido){ throw new IllegalStateException("Pedido já entregue."); }
    @Override public String getDescricao()       { return "Entregue"; }
}
