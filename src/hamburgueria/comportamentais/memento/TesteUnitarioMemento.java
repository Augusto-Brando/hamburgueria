package hamburgueria.comportamentais.memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioMemento {

    @Test
    public void testHistoricoDeEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoRecebido.getInstance());
        pedido.setEstado(EstadoEmPreparo.getInstance());
        pedido.setEstado(EstadoPronto.getInstance());
        assertEquals(3, pedido.getEstados().size());
    }

    @Test
    public void testRestaurarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoRecebido.getInstance());
        pedido.setEstado(EstadoEmPreparo.getInstance());
        pedido.restaurarEstado(0);
        assertEquals("Recebido", pedido.getEstado().getNomeEstado());
    }

    @Test
    public void testIndiceInvalidoLancaExcecao() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoRecebido.getInstance());
        assertThrows(IllegalArgumentException.class, () -> pedido.restaurarEstado(5));
    }
}
