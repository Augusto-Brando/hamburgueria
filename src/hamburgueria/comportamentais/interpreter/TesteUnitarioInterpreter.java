package hamburgueria.comportamentais.interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioInterpreter {

    @Test
    public void testAdicao() {
        InterpretadorExpressao exp = new InterpretadorExpressoesAritmeticas("10 + 5");
        assertEquals(15.0, exp.interpretar());
    }

    @Test
    public void testSubtracao() {
        InterpretadorExpressao exp = new InterpretadorExpressoesAritmeticas("30 - 5");
        assertEquals(25.0, exp.interpretar());
    }

    @Test
    public void testCalcPrecoFinalItemCardapio() {
        ItemCardapio item = new ItemCardapio();
        item.setPreco(30.0);
        item.setDesconto(10.0);
        assertEquals(29.0, item.calcularPrecoFinal(), 0.01);
    }

    @Test
    public void testExpressaoInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            new InterpretadorExpressoesAritmeticas("10 + ");
        });
    }
}
