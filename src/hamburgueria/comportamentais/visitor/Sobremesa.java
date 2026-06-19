package hamburgueria.comportamentais.visitor;

public class Sobremesa implements ItemCardapio {
    private int codigo;
    private String nome;
    private String tipo;

    public Sobremesa(int codigo, String nome, String tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }

    public String aceitar(ItemVisitor visitor) { return visitor.exibirSobremesa(this); }
}
