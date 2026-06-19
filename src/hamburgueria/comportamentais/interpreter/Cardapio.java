package hamburgueria.comportamentais.interpreter;

public class Cardapio {
    public static String formula = "preco - desconto * 0.1";

    public static double calcularPrecoFinal(double preco, double desconto) {
        String expressao = formula.replace("preco", Double.toString(preco));
        expressao = expressao.replace("desconto", Double.toString(desconto));
        return new InterpretadorExpressoesAritmeticas(expressao).interpretar();
    }
}
