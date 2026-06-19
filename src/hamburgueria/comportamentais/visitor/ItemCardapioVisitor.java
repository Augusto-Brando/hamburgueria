package hamburgueria.comportamentais.visitor;

public class ItemCardapioVisitor implements ItemVisitor {

    public String exibir(ItemCardapio item) { return item.aceitar(this); }

    @Override
    public String exibirHamburguer(Hamburguer hamburguer) {
        return "Hamburguer{codigo=" + hamburguer.getCodigo() +
               ", nome='" + hamburguer.getNome() + "'" +
               ", preco=R$" + hamburguer.getPreco() + "}";
    }

    @Override
    public String exibirBebida(Bebida bebida) {
        return "Bebida{codigo=" + bebida.getCodigo() +
               ", nome='" + bebida.getNome() + "'" +
               ", volume=" + bebida.getVolume() + "ml}";
    }

    @Override
    public String exibirSobremesa(Sobremesa sobremesa) {
        return "Sobremesa{codigo=" + sobremesa.getCodigo() +
               ", nome='" + sobremesa.getNome() + "'" +
               ", tipo='" + sobremesa.getTipo() + "'}";
    }
}
