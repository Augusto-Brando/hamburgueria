package hamburgueria.cozinha;

import hamburgueria.pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton + participante do Mediator:
 * representa a cozinha que recebe pedidos do mediador (CentralAtendimento).
 */
public class Cozinha {
    private static Cozinha instancia;
    private final List<String> filaPedidos = new ArrayList<>();

    private Cozinha() {}

    public static synchronized Cozinha getInstance() {
        if (instancia == null) instancia = new Cozinha();
        return instancia;
    }

    public void receberPedido(Pedido pedido) {
        filaPedidos.add(pedido.getNumero());
        pedido.avancarEstado(); // Recebido → Em Preparo
    }

    public List<String> getFilaPedidos() { return filaPedidos; }
}
