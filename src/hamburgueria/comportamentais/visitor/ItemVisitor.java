package hamburgueria.comportamentais.visitor;

public interface ItemVisitor {
    String exibirHamburguer(Hamburguer hamburguer);
    String exibirBebida(Bebida bebida);
    String exibirSobremesa(Sobremesa sobremesa);
}
