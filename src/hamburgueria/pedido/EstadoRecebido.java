package hamburgueria.pedido;

public class EstadoRecebido implements EstadoPedido {
    private static final EstadoRecebido INSTANCIA = new EstadoRecebido();
    private EstadoRecebido() {}
    public static EstadoRecebido getInstance() { return INSTANCIA; }

    @Override public void avancar(Pedido pedido) { pedido.setEstado(EstadoEmPreparo.getInstance()); }
    @Override public void cancelar(Pedido pedido){ pedido.setEstado(EstadoCancelado.getInstance()); }
    @Override public String getDescricao()       { return "Recebido"; }
}
