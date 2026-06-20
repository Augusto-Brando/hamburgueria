package hamburgueria.pedido;

public class EstadoPronto implements EstadoPedido {
    private static final EstadoPronto INSTANCIA = new EstadoPronto();
    private EstadoPronto() {}
    public static EstadoPronto getInstance() { return INSTANCIA; }

    @Override public void avancar(Pedido pedido) { pedido.setEstado(EstadoEntregue.getInstance()); }
    @Override public void cancelar(Pedido pedido){ throw new IllegalStateException("Pedido já está pronto."); }
    @Override public String getDescricao()       { return "Pronto"; }
}
