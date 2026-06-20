package hamburgueria.cozinha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioCozinha {

    @Test
    public void testLigarGrelhaComando() {
        Grelha grelha   = new Grelha();
        PainelCozinha painel = new PainelCozinha();
        painel.executar(new LigarGrelha(grelha));
        assertTrue(grelha.isLigada());
        assertEquals(250, grelha.getTemperatura());
    }

    @Test
    public void testDesfazerComando() {
        Grelha grelha   = new Grelha();
        PainelCozinha painel = new PainelCozinha();
        painel.executar(new LigarGrelha(grelha));
        painel.desfazerUltimo();
        assertFalse(grelha.isLigada());
    }

    @Test
    public void testCozinhaSingleton() {
        Cozinha a = Cozinha.getInstance();
        Cozinha b = Cozinha.getInstance();
        assertSame(a, b);
    }
}
