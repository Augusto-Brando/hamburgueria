package hamburgueria.comportamentais.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioMediator {

    @Test
    public void testElogioPassaPeloAtendimento() {
        Cliente cliente = new Cliente();
        String resposta = cliente.elogiarCozinha("Hamburguer delicioso!");
        assertTrue(resposta.contains("Atendimento agradece"));
        assertTrue(resposta.contains("Cozinha agradece"));
    }

    @Test
    public void testReclamacaoPassaPeloAtendimento() {
        Cliente cliente = new Cliente();
        String resposta = cliente.reclamarCozinha("Pedido demorou muito");
        assertTrue(resposta.contains("Cozinha vai procurar melhorar"));
    }

    @Test
    public void testClienteVipHerdaComportamento() {
        Cliente vip = new ClienteVip();
        String resposta = vip.sugerirCozinha("Adicionar opcao vegana");
        assertTrue(resposta.contains("Cozinha vai analisar"));
    }
}
