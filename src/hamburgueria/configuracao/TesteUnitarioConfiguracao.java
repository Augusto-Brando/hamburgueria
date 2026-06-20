package hamburgueria.configuracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioConfiguracao {

    @Test
    public void testInstanciaUnica() {
        ConfiguracaoRestaurante a = ConfiguracaoRestaurante.getInstance();
        ConfiguracaoRestaurante b = ConfiguracaoRestaurante.getInstance();
        assertSame(a, b);
    }

    @Test
    public void testAlterarNome() {
        ConfiguracaoRestaurante cfg = ConfiguracaoRestaurante.getInstance();
        cfg.setNomeRestaurante("Burguer Palace");
        assertEquals("Burguer Palace", ConfiguracaoRestaurante.getInstance().getNomeRestaurante());
        cfg.setNomeRestaurante("Hamburgueria do Zé"); // restaura
    }
}
