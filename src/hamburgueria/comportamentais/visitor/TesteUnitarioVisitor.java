package hamburgueria.comportamentais.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioVisitor {

    @Test
    public void testExibirHamburguer() {
        ItemCardapioVisitor visitor = new ItemCardapioVisitor();
        Hamburguer hamburguer = new Hamburguer(1, "X-Tudo", 25.0f);
        String resultado = visitor.exibir(hamburguer);
        assertTrue(resultado.contains("X-Tudo"));
        assertTrue(resultado.contains("25.0"));
    }

    @Test
    public void testExibirBebida() {
        ItemCardapioVisitor visitor = new ItemCardapioVisitor();
        Bebida bebida = new Bebida(2, "Refrigerante", 350f);
        String resultado = visitor.exibir(bebida);
        assertTrue(resultado.contains("Refrigerante"));
        assertTrue(resultado.contains("350"));
    }

    @Test
    public void testExibirSobremesa() {
        ItemCardapioVisitor visitor = new ItemCardapioVisitor();
        Sobremesa sobremesa = new Sobremesa(3, "Sundae", "Sorvete");
        String resultado = visitor.exibir(sobremesa);
        assertTrue(resultado.contains("Sundae"));
        assertTrue(resultado.contains("Sorvete"));
    }
}
