package hamburgueria.pedido;

import hamburgueria.cardapio.Lanche;
import hamburgueria.cardapio.PratoSimples;
import hamburgueria.cliente.Cliente;
import hamburgueria.cliente.Endereco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioPedido {

    // ── State ──────────────────────────────────────────────────────────────
    @Test
    public void testCicloDeVida() {
        Pedido pedido = new Pedido("001");
        assertEquals("Recebido",   pedido.getStatusAtual());
        pedido.avancarEstado();
        assertEquals("Em Preparo", pedido.getStatusAtual());
        pedido.avancarEstado();
        assertEquals("Pronto",     pedido.getStatusAtual());
        pedido.avancarEstado();
        assertEquals("Entregue",   pedido.getStatusAtual());
    }

    @Test
    public void testCancelamento() {
        Pedido pedido = new Pedido("002");
        pedido.cancelar();
        assertEquals("Cancelado", pedido.getStatusAtual());
    }

    @Test
    public void testNaoPodeCancelarAposEntrega() {
        Pedido pedido = new Pedido("003");
        pedido.avancarEstado(); // Em Preparo
        pedido.avancarEstado(); // Pronto
        pedido.avancarEstado(); // Entregue
        assertThrows(IllegalStateException.class, pedido::cancelar);
    }

    // ── Strategy ───────────────────────────────────────────────────────────
    @Test
    public void testPrecoNormal() {
        Pedido pedido = new Pedido("004");
        pedido.adicionarItem(new Lanche("Smash", 25.0));
        assertEquals(25.0, pedido.calcularTotal(), 0.001);
    }

    @Test
    public void testPrecoComDesconto() {
        Pedido pedido = new Pedido("005");
        pedido.adicionarItem(new Lanche("Smash", 40.0));
        pedido.setEstrategiaPreco(new PrecoComDesconto(10));
        assertEquals(36.0, pedido.calcularTotal(), 0.001);
    }

    @Test
    public void testPrecoComTaxaEntrega() {
        Pedido pedido = new Pedido("006");
        pedido.adicionarItem(new Lanche("Smash", 30.0));
        pedido.setEstrategiaPreco(new PrecoComTaxaEntrega(5.0));
        assertEquals(35.0, pedido.calcularTotal(), 0.001);
    }

    // ── Observer ───────────────────────────────────────────────────────────
    @Test
    public void testObserverClienteNotificado() {
        Pedido pedido = new Pedido("007");
        Cliente cliente = new Cliente("Ana", "9999", new Endereco("Rua A", "1", "Centro"));
        pedido.adicionarObservador(cliente);

        pedido.avancarEstado(); // → Em Preparo
        pedido.avancarEstado(); // → Pronto

        assertEquals(2, cliente.getHistorico().size());
        assertTrue(cliente.getHistorico().get(1).contains("Pronto"));
    }
}
