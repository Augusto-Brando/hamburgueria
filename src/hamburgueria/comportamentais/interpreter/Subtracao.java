package hamburgueria.comportamentais.interpreter;

public class Subtracao implements InterpretadorExpressao {
    private double x, y;
    public Subtracao(Numero e, Numero d) { x = e.getNumero(); y = d.getNumero(); }
    public double interpretar() { return x - y; }
}
