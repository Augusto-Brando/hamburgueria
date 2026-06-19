package hamburgueria.comportamentais.command;

public class DesligarGrelhaComando implements Comando {
    private Grelha grelha;

    public DesligarGrelhaComando(Grelha grelha) { this.grelha = grelha; }

    public void executar() { this.grelha.desligar(); }
    public void cancelar() { this.grelha.ligar(); }
}
