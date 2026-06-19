package hamburgueria.comportamentais.command;

public class Grelha {
    private String situacao;

    public String getSituacao() { return situacao; }

    public void ligar() { this.situacao = "Grelha ligada"; }
    public void desligar() { this.situacao = "Grelha desligada"; }
}
