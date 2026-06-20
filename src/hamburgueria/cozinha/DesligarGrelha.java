package hamburgueria.cozinha;

public class DesligarGrelha implements Comando {
    private final Grelha grelha;
    public DesligarGrelha(Grelha grelha) { this.grelha = grelha; }
    @Override public void executar() { grelha.desligar(); }
    @Override public void desfazer() { grelha.ligar(); }
}
