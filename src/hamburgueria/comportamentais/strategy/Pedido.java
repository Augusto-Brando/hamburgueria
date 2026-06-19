package hamburgueria.comportamentais.strategy;

public class Pedido {
    private float preco;

    public float getPreco() { return preco; }

    public void calcularPrecoNormal(float valorBase, int quantidade) {
        this.preco = new Calculadora(valorBase, quantidade).calcular(new PrecoNormal());
    }
    public void calcularPrecoComDesconto(float valorBase, int quantidade) {
        this.preco = new Calculadora(valorBase, quantidade).calcular(new PrecoComDesconto());
    }
    public void calcularPrecoCombo(float valorBase, int quantidade) {
        this.preco = new Calculadora(valorBase, quantidade).calcular(new PrecoCombo());
    }
    public void calcularPrecoComTaxaEntrega(float valorBase, int quantidade) {
        this.preco = new Calculadora(valorBase, quantidade).calcular(new PrecoComTaxaEntrega());
    }
    public void calcularPrecoPromocional(float valorBase, int quantidade) {
        this.preco = new Calculadora(valorBase, quantidade).calcular(new PrecoPromocional());
    }
}
