package hamburgueria.pedido;

public class EstadoEmPreparo implements EstadoPedido {
    private static final EstadoEmPreparo INSTANCIA = new EstadoEmPreparo();
    private EstadoEmPreparo() {}
    public static EstadoEmPreparo getInstance() { return INSTANCIA; }

    @Override public void avancar(Pedido pedido) { pedido.setEstado(EstadoPronto.getInstance()); }
    @Override public void cancelar(Pedido pedido){ pedido.setEstado(EstadoCancelado.getInstance()); }
    @Override public String getDescricao()       { return "Em Preparo"; }
}
