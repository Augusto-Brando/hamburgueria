package hamburgueria.comportamentais.memento;

public class EstadoPronto implements PedidoEstado {
    private EstadoPronto() {}
    private static EstadoPronto instance = new EstadoPronto();
    public static EstadoPronto getInstance() { return instance; }
    public String getNomeEstado() { return "Pronto"; }
}
