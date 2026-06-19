package hamburgueria.comportamentais.chainofresponsability;

public class AtendenteDono extends Atendente {
    public AtendenteDono(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoFranquia.getTipoRequisicaoFranquia());
        setAtendenteSuperior(superior);
    }
    public String getDescricaoCargo() { return "Dono"; }
}
