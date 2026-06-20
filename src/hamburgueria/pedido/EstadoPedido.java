package hamburgueria.pedido;

/** State: interface de estado do pedido. */
public interface EstadoPedido {
    void avancar(Pedido pedido);
    void cancelar(Pedido pedido);
    String getDescricao();
}
