package hamburgueria.cardapio;

/**
 * Componente do Composite: representa qualquer item (folha ou composto).
 */
public interface ItemCardapio {
    String getNome();
    double getPreco();
    String getDescricao();
}
