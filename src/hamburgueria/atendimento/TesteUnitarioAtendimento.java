package hamburgueria.atendimento;

import hamburgueria.cardapio.Lanche;
import hamburgueria.cliente.Cliente;
import hamburgueria.cliente.Endereco;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioAtendimento {

    // ── Chain of Responsibility ────────────────────────────────────────────
    @Test
    public void testChainDuvidaResolvida() {
        AtendenteCaixa  caixa   = new AtendenteCaixa("Carlos");
        AtendenteGerente gerente = new AtendenteGerente("Lucia");
        AtendenteDono   dono    = new AtendenteDono("Roberto");
        caixa.setProximo(gerente).setProximo(dono);

        boolean resolvida = caixa.atender(new Requisicao("Qual o horário?", TipoRequisicao.DUVIDA));
        assertTrue(resolvida);
    }

    @Test
    public void testChainReembolsoPassaParaGerente() {
        AtendenteCaixa  caixa   = new AtendenteCaixa("Carlos");
        AtendenteGerente gerente = new AtendenteGerente("Lucia");
        caixa.setProximo(gerente);

        boolean resolvida = caixa.atender(new Requisicao("Quero reembolso", TipoRequisicao.REEMBOLSO));
        assertTrue(resolvida);
    }

    @Test
    public void testChainDecisaoEstrategicaChegaAoDono() {
        AtendenteCaixa   caixa   = new AtendenteCaixa("Carlos");
        AtendenteGerente gerente = new AtendenteGerente("Lucia");
        AtendenteDono    dono    = new AtendenteDono("Roberto");
        caixa.setProximo(gerente).setProximo(dono);

        boolean resolvida = caixa.atender(
                new Requisicao("Abrir nova unidade?", TipoRequisicao.DECISAO_ESTRATEGICA));
        assertTrue(resolvida);
    }

    // ── Facade ─────────────────────────────────────────────────────────────
    @Test
    public void testFacadePedidoDelivery() {
        PedidoFacade facade  = new PedidoFacade();
        Cliente cliente = new Cliente("João", "9999", new Endereco("Rua B", "2", "Norte"));
        var pedido = facade.fazerPedidoDelivery(
                cliente,
                List.of(new Lanche("Clássico", 25.0)),
                5.0);

        assertEquals(30.0, pedido.calcularTotal(), 0.001);
        assertEquals("Em Preparo", pedido.getStatusAtual());
    }
}
