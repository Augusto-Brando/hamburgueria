package hamburgueria.estoque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioEstoque {

    @Test
    public void testAdicionarEConsumirIngrediente() {
        IEstoque estoque = new Estoque();
        estoque.adicionarIngrediente("Pao", 10);
        estoque.consumirIngrediente("Pao", 3);
        assertEquals(7, estoque.getQuantidade("Pao"));
    }

    @Test
    public void testEstoqueInsuficiente() {
        IEstoque estoque = new Estoque();
        estoque.adicionarIngrediente("Carne", 2);
        assertThrows(IllegalStateException.class,
                () -> estoque.consumirIngrediente("Carne", 5));
    }

    @Test
    public void testProxyGerenteTemAcesso() {
        Funcionario gerente = new Funcionario("Ana", true);
        IEstoque proxy = new EstoqueProxy(gerente);
        proxy.adicionarIngrediente("Queijo", 20);
        assertEquals(20, proxy.getQuantidade("Queijo"));
    }

    @Test
    public void testProxyFuncionarioSemAcesso() {
        Funcionario atendente = new Funcionario("João", false);
        IEstoque proxy = new EstoqueProxy(atendente);
        proxy.adicionarIngrediente("Alface", 5);
        assertThrows(SecurityException.class,
                () -> proxy.getQuantidade("Alface"));
    }
}
