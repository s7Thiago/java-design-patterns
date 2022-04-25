package br.com.design.patterns.State.impl;

import br.com.design.patterns.State.Pedido;
import br.com.design.patterns.State.State;

public class AguardandoPagamentoState implements State {

    private Pedido pedido;

    public AguardandoPagamentoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        this.pedido.setEstadoAtual(this.pedido.getPago());
    }

    @Override
    public void despacharPedido() throws Exception {
        // Como não é possível despachar um pedido sem ter realizado o pagamento
        // (estando na transição de aguardando pagamento), lançar uma exceção
        throw new Exception("Não é possível despachar um pedido sem ter realizado o pagamento");
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getCancelado());

    }

}
