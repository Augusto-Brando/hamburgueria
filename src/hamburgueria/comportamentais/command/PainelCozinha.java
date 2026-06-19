package hamburgueria.comportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class PainelCozinha {
    private List<Comando> comandos = new ArrayList<Comando>();

    public void executarComando(Comando comando) {
        this.comandos.add(comando);
        comando.executar();
    }

    public void cancelarUltimoComando() {
        if (!comandos.isEmpty()) {
            Comando comando = this.comandos.get(this.comandos.size() - 1);
            comando.cancelar();
            this.comandos.remove(this.comandos.size() - 1);
        }
    }
}
