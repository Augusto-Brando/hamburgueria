package hamburgueria.comportamentais.interpreter;

public class Multiplicacao implements InterpretadorExpressao {
    private double x, y;
    public Multiplicacao(Numero e, Numero d) { x = e.getNumero(); y = d.getNumero(); }
    public double interpretar() { return x * y; }
}
