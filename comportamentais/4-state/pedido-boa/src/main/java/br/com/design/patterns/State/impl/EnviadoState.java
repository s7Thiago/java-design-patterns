package br.com.design.patterns.State.impl;

import br.com.design.patterns.State.Pedido;
import br.com.design.patterns.State.State;

public class EnviadoState implements State {

    private Pedido pedido;

    public EnviadoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Erro: O pedido já foi pago e enviado!");
    }

    @Override
    public void despacharPedido() throws Exception {
        throw new Exception("Erro: O pedido já foi enviado!");

    }

    @Override
    public void cancelarPedido() throws Exception {
        throw new Exception("Erro: O pedido já foi pago e enviado!");

    }

}
