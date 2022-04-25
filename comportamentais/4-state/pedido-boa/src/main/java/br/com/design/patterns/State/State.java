package br.com.design.patterns.State;

public interface State {
    public void sucessoAoPagar() throws Exception;

    public void despacharPedido() throws Exception;

    public void cancelarPedido() throws Exception;
}
