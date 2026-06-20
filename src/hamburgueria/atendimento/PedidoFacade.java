package hamburgueria.atendimento;

import hamburgueria.cardapio.ItemCardapio;
import hamburgueria.cliente.Cliente;
import hamburgueria.pedido.Pedido;
import hamburgueria.pedido.PrecoComTaxaEntrega;

import java.util.List;

/**
 * Facade: simplifica para o front-end o fluxo completo de
 * criação de pedido (cliente → itens → preço → central → cozinha).
 */
public class PedidoFacade {
    private static int contador = 0;
    private final CentralAtendimento central = CentralAtendimento.getInstance();

    public Pedido fazerPedidoDelivery(Cliente cliente,
                                      List<ItemCardapio> itens,
                                      double taxaEntrega) {
        Pedido pedido = new Pedido("P-" + (++contador));
        itens.forEach(pedido::adicionarItem);
        pedido.setEstrategiaPreco(new PrecoComTaxaEntrega(taxaEntrega));
        pedido.adicionarObservador(cliente);
        central.registrarPedido(pedido);
        return pedido;
    }
}
