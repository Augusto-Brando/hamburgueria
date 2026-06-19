package hamburgueria.comportamentais.interpreter;

public class Adicao implements InterpretadorExpressao {
    private double x, y;
    public Adicao(Numero e, Numero d) { x = e.getNumero(); y = d.getNumero(); }
    public double interpretar() { return x + y; }
}
