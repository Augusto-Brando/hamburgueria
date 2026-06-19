package hamburgueria.comportamentais.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testPrecoNormal() {
        Pedido pedido = new Pedido();
        pedido.calcularPrecoNormal(20.0f, 3);
        assertEquals(60.0f, pedido.getPreco());
    }

    @Test
    public void testPrecoComDesconto() {
        Pedido pedido = new Pedido();
        pedido.calcularPrecoComDesconto(20.0f, 2);
        assertEquals(36.0f, pedido.getPreco(), 0.01f);
    }

    @Test
    public void testPrecoCombo3Leva2() {
        Pedido pedido = new Pedido();
        pedido.calcularPrecoCombo(20.0f, 3);
        assertEquals(40.0f, pedido.getPreco());
    }

    @Test
    public void testPrecoComTaxaEntrega() {
        Pedido pedido = new Pedido();
        pedido.calcularPrecoComTaxaEntrega(20.0f, 2);
        assertEquals(45.0f, pedido.getPreco());
    }

    @Test
    public void testPrecoPromocional() {
        Pedido pedido = new Pedido();
        pedido.calcularPrecoPromocional(20.0f, 4);
        assertEquals(40.0f, pedido.getPreco());
    }
}
