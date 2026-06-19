package hamburgueria.comportamentais.interpreter;

public class Divisao implements InterpretadorExpressao {
    private double x, y;
    public Divisao(Numero e, Numero d) { x = e.getNumero(); y = d.getNumero(); }
    public double interpretar() { return x / y; }
}
