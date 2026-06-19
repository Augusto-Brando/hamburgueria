package hamburgueria.comportamentais.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioPedido {

    @Test
    public void testFluxoCompletoDoEstado() {
        Pedido pedido = new Pedido();
        assertEquals("Recebido", pedido.getNomeEstado());
        assertTrue(pedido.confirmar());
        assertEquals("Em Preparo", pedido.getNomeEstado());
        assertTrue(pedido.finalizar());
        assertEquals("Pronto", pedido.getNomeEstado());
        assertTrue(pedido.entregar());
        assertEquals("Entregue", pedido.getNomeEstado());
    }

    @Test
    public void testCancelamentoAposPedidoRecebido() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.cancelar());
        assertEquals("Cancelado", pedido.getNomeEstado());
    }

    @Test
    public void testNaoPodeEntregarSemFinalizar() {
        Pedido pedido = new Pedido();
        pedido.confirmar();
        assertFalse(pedido.entregar());
        assertEquals("Em Preparo", pedido.getNomeEstado());
    }
}
