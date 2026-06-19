package hamburgueria.comportamentais.templatemethod;

public abstract class Pedido {
    private int numeroPedido;
    protected String nomeCliente;
    private float tempoBase;
    private float tempoAdicional;

    public int getNumeroPedido() { return numeroPedido; }
    public void setNumeroPedido(int numeroPedido) { this.numeroPedido = numeroPedido; }
    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public float getTempoBase() { return tempoBase; }
    public void setTempoBase(float tempoBase) { this.tempoBase = tempoBase; }
    public float getTempoAdicional() { return tempoAdicional; }
    public void setTempoAdicional(float tempoAdicional) { this.tempoAdicional = tempoAdicional; }

    public float calcularTempoTotal() { return this.tempoBase + this.tempoAdicional; }

    public abstract String verificarPrioridade();

    public String getTipo() { return "Pedido"; }

    public String getInfo() {
        return getTipo() + "{numeroPedido=" + this.numeroPedido +
               ", nomeCliente='" + this.nomeCliente + "'" +
               ", prioridade=" + this.verificarPrioridade() + "}";
    }
}
