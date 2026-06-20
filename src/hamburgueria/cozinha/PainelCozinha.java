package hamburgueria.cozinha;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Invoker do Command: painel que enfileira e executa comandos,
 * mantendo histórico para desfazer.
 */
public class PainelCozinha {
    private final Deque<Comando> historico = new ArrayDeque<>();

    public void executar(Comando cmd) {
        cmd.executar();
        historico.push(cmd);
    }

    public void desfazerUltimo() {
        if (!historico.isEmpty()) historico.pop().desfazer();
    }
}
