package hamburgueria.comportamentais.memento;

public class EstadoRecebido implements PedidoEstado {
    private EstadoRecebido() {}
    private static EstadoRecebido instance = new EstadoRecebido();
    public static EstadoRecebido getInstance() { return instance; }
    public String getNomeEstado() { return "Recebido"; }
}
