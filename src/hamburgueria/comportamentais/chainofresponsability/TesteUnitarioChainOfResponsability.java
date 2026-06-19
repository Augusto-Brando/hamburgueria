package hamburgueria.comportamentais.chainofresponsability;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioChainOfResponsability {

    private Atendente buildChain() {
        AtendenteDono dono       = new AtendenteDono(null);
        AtendenteGerente gerente = new AtendenteGerente(dono);
        AtendenteCaixa caixa     = new AtendenteCaixa(gerente);
        return caixa;
    }

    @Test
    public void testPedidoResolvidoPeloCaixa() {
        Atendente chain = buildChain();
        Requisicao req = new Requisicao(TipoRequisicaoPedido.getTipoRequisicaoPedido());
        assertEquals("Caixa", chain.processarRequisicao(req));
    }

    @Test
    public void testReclamacaoResolvidaPeloGerente() {
        Atendente chain = buildChain();
        Requisicao req = new Requisicao(TipoRequisicaoReclamacao.getTipoRequisicaoReclamacao());
        assertEquals("Gerente", chain.processarRequisicao(req));
    }

    @Test
    public void testFranquiaResolvidaPeloDono() {
        Atendente chain = buildChain();
        Requisicao req = new Requisicao(TipoRequisicaoFranquia.getTipoRequisicaoFranquia());
        assertEquals("Dono", chain.processarRequisicao(req));
    }
}
