package hamburgueria.cliente;

/**
 * Prototype: clone() cria novo cliente com mesmo endereço (cópia profunda).
 * Observer: implementa ObservadorPedido para receber atualizações de pedidos.
 */
public class Cliente implements Cloneable, ObservadorPedido {
    private String nome;
    private String telefone;
    private Endereco endereco;
    private final java.util.List<String> historicoPedidos = new java.util.ArrayList<>();

    public Cliente(String nome, String telefone, Endereco endereco) {
        this.nome     = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    /** Prototype: clona o cliente com endereço copiado (cópia profunda). */
    @Override
    public Cliente clone() {
        try {
            Cliente copia = (Cliente) super.clone();
            copia.endereco = this.endereco.clone();
            return copia;
        } catch (CloneNotSupportedException e) { throw new AssertionError(); }
    }

    /** Observer: recebe notificação de mudança de status do pedido. */
    @Override
    public void notificar(String numeroPedido, String novoStatus) {
        historicoPedidos.add("[Pedido " + numeroPedido + "] " + novoStatus);
    }

    public String getNome()                       { return nome; }
    public String getTelefone()                   { return telefone; }
    public void   setTelefone(String t)           { telefone = t; }
    public Endereco getEndereco()                 { return endereco; }
    public void     setEndereco(Endereco e)       { endereco = e; }
    public java.util.List<String> getHistorico()  { return java.util.Collections.unmodifiableList(historicoPedidos); }
}
