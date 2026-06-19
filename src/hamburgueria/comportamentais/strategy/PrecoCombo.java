package hamburgueria.comportamentais.strategy;

public class PrecoCombo implements EstrategiaPreco {
    public float calcular(float valorBase, int quantidade) {
        int grupos = quantidade / 3;
        int resto  = quantidade % 3;
        return (grupos * 2 * valorBase) + (resto * valorBase);
    }
}
