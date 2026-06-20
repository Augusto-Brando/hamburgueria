package hamburgueria.cliente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioCliente {

    @Test
    public void testPrototypeCloneIndependente() {
        Endereco end = new Endereco("Rua A", "10", "Centro");
        Cliente original = new Cliente("Maria", "9999-0000", end);
        Cliente clone    = original.clone();

        clone.getEndereco().setRua("Rua B");
        assertEquals("Rua A", original.getEndereco().getRua(),
                "Endereço do original não deve ser alterado pelo clone");
    }

    @Test
    public void testObserverNotificacao() {
        Endereco end    = new Endereco("Rua X", "1", "Leste");
        Cliente cliente = new Cliente("Pedro", "1111-2222", end);

        cliente.notificar("001", "Em preparo");
        cliente.notificar("001", "Pronto");

        assertEquals(2, cliente.getHistorico().size());
        assertTrue(cliente.getHistorico().get(0).contains("Em preparo"));
    }
}
