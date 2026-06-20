package hamburgueria.cardapio;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder de Hamburguer — permite montar lanches complexos passo a passo.
 * (Padrão: Builder)
 */
public class HamburguerBuilder {
    private String tipo   = "Hamburguer";
    private String pao    = "Brioche";
    private String carne  = "Blend 180g";
    private final List<String> adicionais = new ArrayList<>();
    private double preco  = 20.0;

    public HamburguerBuilder tipo(String tipo)     { this.tipo = tipo;   return this; }
    public HamburguerBuilder pao(String pao)       { this.pao = pao;     return this; }
    public HamburguerBuilder carne(String carne)   { this.carne = carne; return this; }
    public HamburguerBuilder adicional(String a)   { adicionais.add(a);  return this; }
    public HamburguerBuilder preco(double p)       { this.preco = p;     return this; }

    public Hamburguer build() {
        return new Hamburguer(tipo, pao, carne, new ArrayList<>(adicionais), preco);
    }
}
