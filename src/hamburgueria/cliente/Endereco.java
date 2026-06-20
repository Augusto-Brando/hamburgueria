package hamburgueria.cliente;

/**
 * Cloneable — usado pelo padrão Prototype em Cliente.
 */
public class Endereco implements Cloneable {
    private String rua;
    private String numero;
    private String bairro;

    public Endereco(String rua, String numero, String bairro) {
        this.rua    = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    @Override
    public Endereco clone() {
        try { return (Endereco) super.clone(); }
        catch (CloneNotSupportedException e) { throw new AssertionError(); }
    }

    public String getRua()    { return rua; }
    public void setRua(String r) { rua = r; }
    public String getNumero() { return numero; }
    public void setNumero(String n) { numero = n; }
    public String getBairro() { return bairro; }
    public void setBairro(String b) { bairro = b; }

    @Override
    public String toString() { return rua + ", " + numero + " – " + bairro; }
}
