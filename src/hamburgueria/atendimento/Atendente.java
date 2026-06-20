package hamburgueria.atendimento;

/**
 * Chain of Responsibility: elo abstrato da corrente de atendimento.
 */
public abstract class Atendente {
    protected Atendente proximo;
    protected final String nome;

    public Atendente(String nome) { this.nome = nome; }

    public Atendente setProximo(Atendente proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract boolean atender(Requisicao req);
}
