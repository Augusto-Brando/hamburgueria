package hamburgueria.cozinha;

/** Receiver do Command: equipamento que realmente executa as ações. */
public class Grelha {
    private boolean ligada = false;
    private int     temperatura = 0;

    public void ligar()  { ligada = true;  temperatura = 250; }
    public void desligar(){ ligada = false; temperatura = 0; }
    public boolean isLigada()    { return ligada; }
    public int     getTemperatura(){ return temperatura; }
}
