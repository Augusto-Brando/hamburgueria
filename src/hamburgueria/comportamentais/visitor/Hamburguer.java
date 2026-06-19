package hamburgueria.comportamentais.visitor;

public class Hamburguer implements ItemCardapio {
    private int codigo;
    private String nome;
    private float preco;

    public Hamburguer(int codigo, String nome, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public float getPreco() { return preco; }

    public String aceitar(ItemVisitor visitor) { return visitor.exibirHamburguer(this); }
}
