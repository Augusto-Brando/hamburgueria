package hamburgueria.comportamentais.memento;

public class EstadoCancelado implements PedidoEstado {
    private EstadoCancelado() {}
    private static EstadoCancelado instance = new EstadoCancelado();
    public static EstadoCancelado getInstance() { return instance; }
    public String getNomeEstado() { return "Cancelado"; }
}
