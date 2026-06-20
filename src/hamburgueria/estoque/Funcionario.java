package hamburgueria.estoque;

public class Funcionario {
    private final String nome;
    private final boolean ehGerente;

    public Funcionario(String nome, boolean ehGerente) {
        this.nome = nome;
        this.ehGerente = ehGerente;
    }
    public String getNome()    { return nome; }
    public boolean ehGerente() { return ehGerente; }
}
