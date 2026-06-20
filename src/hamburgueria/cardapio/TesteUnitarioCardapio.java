package hamburgueria.cardapio;

import org.junit.jupiter.api.Test;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioCardapio {

    // ── Composite ──────────────────────────────────────────────────────────
    @Test
    public void testComboSomaPrecos() {
        Combo combo = new Combo("Combo Duplo");
        combo.adicionar(new PratoSimples("Hamburguer", 25.0, "Prato"));
        combo.adicionar(new PratoSimples("Batata", 10.0, "Porção"));
        assertEquals(35.0, combo.getPreco(), 0.001);
    }

    // ── Decorator ──────────────────────────────────────────────────────────
    @Test
    public void testDecoratorComQueijo() {
        ItemCardapio lanche = new Lanche("Smash", 20.0);
        ItemCardapio comQueijo = new ComQueijo(lanche);
        assertEquals(22.0, comQueijo.getPreco(), 0.001);
        assertTrue(comQueijo.getDescricao().contains("Queijo"));
    }

    @Test
    public void testDecoratorEmpilhado() {
        ItemCardapio lanche = new Lanche("Smash", 20.0);
        ItemCardapio customizado = new ComSalada(new ComBacon(new ComQueijo(lanche)));
        assertEquals(27.5, customizado.getPreco(), 0.001);
    }

    // ── Builder ────────────────────────────────────────────────────────────
    @Test
    public void testBuilderHamburguer() {
        Hamburguer h = new HamburguerBuilder()
                .tipo("Duplo Smash")
                .pao("Brioche")
                .carne("Blend 360g")
                .adicional("Queijo Cheddar")
                .adicional("Bacon")
                .preco(38.0)
                .build();
        assertEquals("Duplo Smash", h.getNome());
        assertEquals(2, h.getAdicionais().size());
        assertEquals(38.0, h.getPreco(), 0.001);
    }

    // ── Factory Method ─────────────────────────────────────────────────────
    @Test
    public void testFactoryLancheClassico() {
        FabricaItemCardapio fabrica = new FabricaLancheClassico();
        ItemCardapio item = fabrica.criarItem();
        assertEquals("Clássico", item.getNome());
        assertEquals(22.0, item.getPreco(), 0.001);
    }

    @Test
    public void testFactoryComboFamilia() {
        FabricaItemCardapio fabrica = new FabricaComboFamilia();
        ItemCardapio item = fabrica.criarItem();
        assertTrue(item instanceof Combo);
        assertEquals(41.0, item.getPreco(), 0.001);
    }

    // ── Iterator ───────────────────────────────────────────────────────────
    @Test
    public void testIteratorCardapio() {
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarItem(new PratoSimples("Fritas", 10.0, "Porção"));
        cardapio.adicionarItem(new PratoSimples("Onion Rings", 12.0, "Porção"));

        int count = 0;
        for (ItemCardapio item : cardapio) count++;
        assertEquals(2, count);
    }
}
