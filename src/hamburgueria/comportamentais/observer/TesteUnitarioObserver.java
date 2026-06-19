package hamburgueria.comportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioObserver {

    @Test
    public void testClienteRecebeNotificacao() {
        Pedido pedido = new Pedido("001", "Joao", "Em preparo");
        Cliente cliente = new Cliente("Joao");
        cliente.acompanhar(pedido);
        pedido.atualizarStatus();
        assertNotNull(cliente.getUltimaNotificacao());
        assertTrue(cliente.getUltimaNotificacao().contains("Joao"));
    }

    @Test
    public void testMultiplosClientesRecebemNotificacao() {
        Pedido pedido = new Pedido("002", "Mesa 5", "Pronto");
        Cliente c1 = new Cliente("Ana");
        Cliente c2 = new Cliente("Pedro");
        c1.acompanhar(pedido);
        c2.acompanhar(pedido);
        pedido.atualizarStatus();
        assertNotNull(c1.getUltimaNotificacao());
        assertNotNull(c2.getUltimaNotificacao());
    }
}
