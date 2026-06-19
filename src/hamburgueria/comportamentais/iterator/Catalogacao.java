package hamburgueria.comportamentais.iterator;

import java.util.Iterator;

public class Catalogacao {
    public static Integer contarItensDisponiveis(Cardapio cardapio) {
        int quantidade = 0;
        for (ItemCardapio item : cardapio) {
            if (item.isDisponivel()) quantidade++;
        }
        return quantidade;
    }

    public static Integer contarTotalItens(Cardapio cardapio) {
        int quantidade = 0;
        for (Iterator<ItemCardapio> it = cardapio.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }
}
