package hamburgueria.cardapio;

import java.util.List;

/** Produto do Builder. */
public class Hamburguer {
    private final String tipo;
    private final String pao;
    private final String carne;
    private final List<String> adicionais;
    private final double preco;

    public Hamburguer(String tipo, String pao, String carne,
                      List<String> adicionais, double preco) {
        this.tipo      = tipo;
        this.pao       = pao;
        this.carne     = carne;
        this.adicionais= adicionais;
        this.preco     = preco;
    }
    public String getNome()          { return tipo; }
    public String getPao()           { return pao; }
    public String getCarne()         { return carne; }
    public List<String> getAdicionais() { return adicionais; }
    public double getPreco()         { return preco; }

    @Override
    public String toString() {
        return tipo + " | " + pao + " | " + carne + " | " + adicionais + " | R$" + preco;
    }
}
