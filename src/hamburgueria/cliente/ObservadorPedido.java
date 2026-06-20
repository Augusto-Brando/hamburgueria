package hamburgueria.cliente;

/**
 * Interface do Observer — quem quer saber sobre mudanças de status do pedido.
 */
public interface ObservadorPedido {
    void notificar(String numeroPedido, String novoStatus);
}
