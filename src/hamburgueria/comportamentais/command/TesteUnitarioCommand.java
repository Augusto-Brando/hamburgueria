package hamburgueria.comportamentais.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioCommand {

    @Test
    public void testLigarGrelha() {
        Grelha grelha = new Grelha();
        PainelCozinha painel = new PainelCozinha();
        painel.executarComando(new LigarGrelhaComando(grelha));
        assertEquals("Grelha ligada", grelha.getSituacao());
    }

    @Test
    public void testDesligarGrelha() {
        Grelha grelha = new Grelha();
        PainelCozinha painel = new PainelCozinha();
        painel.executarComando(new DesligarGrelhaComando(grelha));
        assertEquals("Grelha desligada", grelha.getSituacao());
    }

    @Test
    public void testCancelarUltimoComando() {
        Grelha grelha = new Grelha();
        PainelCozinha painel = new PainelCozinha();
        painel.executarComando(new LigarGrelhaComando(grelha));
        painel.cancelarUltimoComando();
        assertEquals("Grelha desligada", grelha.getSituacao());
    }
}
