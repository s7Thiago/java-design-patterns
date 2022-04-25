package br.com.design.patterns.State.impl;

import br.com.design.patterns.State.Pedido;
import br.com.design.patterns.State.State;

public class CanceladoState implements State {

    private Pedido pedido;

    public CanceladoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Operação não suportada: O pedido foi cancelado");
    }

    @Override
    public void despacharPedido() throws Exception {
        throw new Exception("Operação não suportada: O pedido foi cancelado");

    }

    @Override
    public void cancelarPedido() throws Exception {
        throw new Exception("Operação não suportada: O pedido já está cancelado");

    }

}
