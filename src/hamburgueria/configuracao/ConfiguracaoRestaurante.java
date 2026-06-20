package hamburgueria.configuracao;

public class ConfiguracaoRestaurante {
    private static ConfiguracaoRestaurante instancia;
    private String nomeRestaurante  = "Hamburgueria do Zé";
    private String endereco         = "Rua das Hamburguerias, 42";
    private String horario          = "11h–23h";
    private double taxaEntrega      = 5.0;

    private ConfiguracaoRestaurante() {}

    public static synchronized ConfiguracaoRestaurante getInstance() {
        if (instancia == null) instancia = new ConfiguracaoRestaurante();
        return instancia;
    }
    public String getNomeRestaurante()  { return nomeRestaurante; }
    public void   setNomeRestaurante(String n) { nomeRestaurante = n; }
    public String getEndereco()         { return endereco; }
    public void   setEndereco(String e) { endereco = e; }
    public String getHorario()          { return horario; }
    public void   setHorario(String h)  { horario = h; }
    public double getTaxaEntrega()      { return taxaEntrega; }
    public void   setTaxaEntrega(double t) { taxaEntrega = t; }
}
