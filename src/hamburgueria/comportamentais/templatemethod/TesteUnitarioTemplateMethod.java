package hamburgueria.comportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioTemplateMethod {

    @Test
    public void testPedidoExpressPrioridadeAlta() {
        PedidoExpress pedido = new PedidoExpress();
        pedido.setNumeroPedido(1);
        pedido.setNomeCliente("Ana");
        pedido.setTempoBase(10.0f);
        pedido.setTempoAdicional(4.0f);
        assertEquals("Alta", pedido.verificarPrioridade());
    }

    @Test
    public void testPedidoExpressPrioridadeNormal() {
        PedidoExpress pedido = new PedidoExpress();
        pedido.setTempoBase(10.0f);
        pedido.setTempoAdicional(10.0f);
        assertEquals("Normal", pedido.verificarPrioridade());
    }

    @Test
    public void testPedidoEspecialTipoGourmet() {
        PedidoEspecial pedido = new PedidoEspecial();
        pedido.setNumeroPedido(2);
        pedido.setNomeCliente("Carlos");
        pedido.setTempoBase(20.0f);
        pedido.setTempoAdicional(5.0f);
        assertEquals("PedidoGourmet", pedido.getTipo());
        assertEquals("Alta", pedido.verificarPrioridade());
        assertTrue(pedido.getInfo().contains("PedidoGourmet"));
    }
}
