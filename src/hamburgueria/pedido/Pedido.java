package hamburgueria.pedido;

import hamburgueria.cardapio.ItemCardapio;
import hamburgueria.cliente.ObservadorPedido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pedido — combina três padrões:
 *   State:           gerencia o ciclo de vida via EstadoPedido
 *   Observer:        notifica ObservadorPedido ao mudar de estado
 *   Template Method: calcularTotal() chama calcularSubtotal() (hook) + EstrategiaPreco
 */
public class Pedido {
    private final String numero;
    private final List<ItemCardapio> itens = new ArrayList<>();
    private EstadoPedido estado = EstadoRecebido.getInstance();
    private EstrategiaPreco estrategiaPreco = new PrecoNormal();
    private final List<ObservadorPedido> observadores = new ArrayList<>();

    public Pedido(String numero) { this.numero = numero; }

    // ── Observer ───────────────────────────────────────────────────────────
    public void adicionarObservador(ObservadorPedido obs)  { observadores.add(obs); }
    public void removerObservador(ObservadorPedido obs)    { observadores.remove(obs); }
    private void notificarObservadores() {
        for (ObservadorPedido obs : observadores)
            obs.notificar(numero, estado.getDescricao());
    }

    // ── State ──────────────────────────────────────────────────────────────
    public void avancarEstado()  { estado.avancar(this);  notificarObservadores(); }
    public void cancelar()       { estado.cancelar(this); notificarObservadores(); }
    public void setEstado(EstadoPedido novoEstado) { estado = novoEstado; }
    public String getStatusAtual() { return estado.getDescricao(); }

    // ── Itens ──────────────────────────────────────────────────────────────
    public void adicionarItem(ItemCardapio item) { itens.add(item); }
    public List<ItemCardapio> getItens()         { return Collections.unmodifiableList(itens); }

    // ── Strategy + Template Method ─────────────────────────────────────────
    public void setEstrategiaPreco(EstrategiaPreco ep) { estrategiaPreco = ep; }
    protected double calcularSubtotal() {
        return itens.stream().mapToDouble(ItemCardapio::getPreco).sum();
    }
    public final double calcularTotal() {                 // Template Method
        return estrategiaPreco.calcularTotal(calcularSubtotal());
    }

    public String getNumero() { return numero; }
}
