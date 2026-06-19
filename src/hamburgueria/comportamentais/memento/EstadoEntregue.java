package hamburgueria.comportamentais.memento;

public class EstadoEntregue implements PedidoEstado {
    private EstadoEntregue() {}
    private static EstadoEntregue instance = new EstadoEntregue();
    public static EstadoEntregue getInstance() { return instance; }
    public String getNomeEstado() { return "Entregue"; }
}
