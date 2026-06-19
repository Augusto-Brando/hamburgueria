package hamburgueria.comportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private PedidoEstado estado;
    private List<PedidoEstado> memento = new ArrayList<>();

    public PedidoEstado getEstado() { return this.estado; }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restaurarEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Indice invalido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<PedidoEstado> getEstados() { return this.memento; }
}
