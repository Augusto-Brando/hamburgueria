package hamburgueria.atendimento;

public class AtendenteDono extends Atendente {
    public AtendenteDono(String nome) { super(nome); }

    @Override
    public boolean atender(Requisicao req) {
        System.out.println("[" + nome + "] Dono tratando decisão estratégica: " + req.getDescricao());
        return true;
    }
}
