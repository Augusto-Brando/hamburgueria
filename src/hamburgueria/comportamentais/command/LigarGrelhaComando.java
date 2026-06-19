package hamburgueria.comportamentais.command;

public class LigarGrelhaComando implements Comando {
    private Grelha grelha;

    public LigarGrelhaComando(Grelha grelha) { this.grelha = grelha; }

    public void executar() { this.grelha.ligar(); }
    public void cancelar() { this.grelha.desligar(); }
}
