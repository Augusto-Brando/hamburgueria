package hamburgueria.comportamentais.visitor;

public class Bebida implements ItemCardapio {
    private int codigo;
    private String nome;
    private float volume;

    public Bebida(int codigo, String nome, float volume) {
        this.codigo = codigo;
        this.nome = nome;
        this.volume = volume;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public float getVolume() { return volume; }

    public String aceitar(ItemVisitor visitor) { return visitor.exibirBebida(this); }
}
