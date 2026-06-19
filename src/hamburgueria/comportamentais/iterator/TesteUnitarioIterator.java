package hamburgueria.comportamentais.iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioIterator {

    @Test
    public void testContarTotalItens() {
        Cardapio cardapio = new Cardapio(
            new ItemCardapio("X-Burguer", true),
            new ItemCardapio("X-Tudo", true),
            new ItemCardapio("Hot Dog", false)
        );
        assertEquals(3, Catalogacao.contarTotalItens(cardapio));
    }

    @Test
    public void testContarItensDisponiveis() {
        Cardapio cardapio = new Cardapio(
            new ItemCardapio("X-Burguer", true),
            new ItemCardapio("X-Tudo", true),
            new ItemCardapio("Hot Dog", false)
        );
        assertEquals(2, Catalogacao.contarItensDisponiveis(cardapio));
    }
}
