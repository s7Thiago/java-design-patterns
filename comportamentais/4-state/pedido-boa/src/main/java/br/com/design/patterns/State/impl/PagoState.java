package br.com.design.patterns.State.impl;

import br.com.design.patterns.State.Pedido;
import br.com.design.patterns.State.State;

public class PagoState implements State {

    private Pedido pedido;

    public PagoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Erro: O pedido já foi pago");
    }

    @Override
    public void despacharPedido() throws Exception {
        this.pedido.setEstadoAtual(this.pedido.getEnviado());
    }

    @Override
    public void cancelarPedido() throws Exception {
        this.pedido.setEstadoAtual(this.pedido.getCancelado());

    }

}
