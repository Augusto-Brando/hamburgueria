package hamburgueria.comportamentais.memento;

public class EstadoEmPreparo implements PedidoEstado {
    private EstadoEmPreparo() {}
    private static EstadoEmPreparo instance = new EstadoEmPreparo();
    public static EstadoEmPreparo getInstance() { return instance; }
    public String getNomeEstado() { return "Em Preparo"; }
}
