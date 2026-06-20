package hamburgueria.cozinha;

public class LigarGrelha implements Comando {
    private final Grelha grelha;
    public LigarGrelha(Grelha grelha) { this.grelha = grelha; }
    @Override public void executar() { grelha.ligar(); }
    @Override public void desfazer() { grelha.desligar(); }
}
