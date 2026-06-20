package hamburgueria.pedido;

public class EstadoCancelado implements EstadoPedido {
    private static final EstadoCancelado INSTANCIA = new EstadoCancelado();
    private EstadoCancelado() {}
    public static EstadoCancelado getInstance() { return INSTANCIA; }

    @Override public void avancar(Pedido pedido) { throw new IllegalStateException("Pedido cancelado."); }
    @Override public void cancelar(Pedido pedido){ /* já cancelado */ }
    @Override public String getDescricao()       { return "Cancelado"; }
}
