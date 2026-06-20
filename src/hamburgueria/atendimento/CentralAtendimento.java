package hamburgueria.atendimento;

import hamburgueria.cozinha.Cozinha;
import hamburgueria.pedido.Pedido;

/**
 * Mediator Singleton: coordena a comunicação entre atendimento e cozinha,
 * evitando que as partes se refiram diretamente umas às outras.
 */
public class CentralAtendimento {
    private static CentralAtendimento instancia;
    private final Cozinha cozinha = Cozinha.getInstance();

    private CentralAtendimento() {}

    public static synchronized CentralAtendimento getInstance() {
        if (instancia == null) instancia = new CentralAtendimento();
        return instancia;
    }

    public void registrarPedido(Pedido pedido) {
        System.out.println("[Central] Pedido " + pedido.getNumero() + " registrado. Enviando à cozinha.");
        cozinha.receberPedido(pedido);
    }
}
