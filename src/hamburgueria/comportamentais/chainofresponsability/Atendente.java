package hamburgueria.comportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Atendente {
    protected ArrayList listaRequisicoes = new ArrayList();
    private Atendente atendenteSuperior;

    public Atendente getAtendenteSuperior() { return atendenteSuperior; }
    public void setAtendenteSuperior(Atendente atendenteSuperior) { this.atendenteSuperior = atendenteSuperior; }

    public abstract String getDescricaoCargo();

    public String processarRequisicao(Requisicao requisicao) {
        if (listaRequisicoes.contains(requisicao.getTipoRequisicao())) {
            return getDescricaoCargo();
        } else {
            if (atendenteSuperior != null) {
                return atendenteSuperior.processarRequisicao(requisicao);
            } else {
                return "Sem autorizacao";
            }
        }
    }
}
